package com.ppfurtado.payrollapi.services;

import com.ppfurtado.payrollapi.domain.Payroll;
import com.ppfurtado.payrollapi.feignClients.UserFeign;
import com.ppfurtado.payrollapi.services.excpetions.ObjectNotFoundException;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Service
public class PayrollService {

    private final Environment env;
    private final UserFeign feign;

    public Payroll getPayment(Long worked, Payroll payroll){
        log.info("PAYROLL_SERVICE ::: Get Request on " + env.getProperty("local.server.port")+" port");
        try {
            var user = feign.findById(worked).getBody();
            if (Objects.nonNull(user)){
                return new Payroll(
                        user.getName(),
                        payroll.getDescription(),
                        user.getHourlyPrice(),
                        payroll.getWorkedHours(),
                        payroll.getWorkedHours() * user.getHourlyPrice()
                );
            }
        }catch (FeignException.NotFound ex){
            throw new ObjectNotFoundException("Object not found");
        }catch (Exception e) {
            throw new IllegalArgumentException("Ilegal argument excetion");
        }
        return null;
    }
}

package com.ppfurtado.payrollapi.resources;

import com.ppfurtado.payrollapi.domain.Payroll;
import com.ppfurtado.payrollapi.domain.User;
import com.ppfurtado.payrollapi.feignClients.UserFeign;
import com.ppfurtado.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payments")
public class PayrollResource {

    private final PayrollService payrollService;

    @GetMapping("/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){

        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }
}

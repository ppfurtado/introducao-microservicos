package com.ppfurtado.payrollapi.resources;

import com.ppfurtado.payrollapi.domain.Payroll;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PayrollResource {

    @GetMapping("/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                new Payroll("Pedro", "Pagamento da rescisão", payment.getHourlyPrice(), 166.0, payment.getHourlyPrice()*payment.getWorkedhours())
        );
    }
}

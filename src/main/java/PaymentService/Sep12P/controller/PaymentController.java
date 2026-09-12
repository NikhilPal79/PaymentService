package PaymentService.Sep12P.controller;

import PaymentService.Sep12P.OrderClient;
import PaymentService.Sep12P.model.Payment;
import PaymentService.Sep12P.model.PaymentStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private OrderClient client;

    @PostMapping
    public String makePayment(@RequestBody Payment payment) {
        payment.setStatus(PaymentStatus.PAID);
        client.updateOrderStatus(payment.getId(),"Paid");
        return "Payment done successfully" ;
    }
}

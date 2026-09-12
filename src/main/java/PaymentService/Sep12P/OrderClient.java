package PaymentService.Sep12P;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service", url = "localhost:8087/order")
public interface OrderClient {

    @PutMapping("/payment/{id}")
    void updateOrderStatus(@PathVariable Long id, @RequestParam String status); ///consuming not exposing
}

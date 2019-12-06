package tomu.cloud.microservice_user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-ticket")
public interface TicketService {
    @GetMapping("/getticket")
    public String getTicket();

}

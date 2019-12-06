package tomu.cloud.microservice_ticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @GetMapping("/getticket")
    public String getTicket(){

        return "Ticket Success!";
    }
}

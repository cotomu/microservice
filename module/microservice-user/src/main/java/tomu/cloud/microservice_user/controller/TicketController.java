package tomu.cloud.microservice_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tomu.cloud.microservice_user.service.TicketService;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @RequestMapping("/microservice-ticket/getticket")
    public String getTicket() {
        return ticketService.getTicket();

    }
}

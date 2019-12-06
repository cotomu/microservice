package tomu.cloud.microservice_user.service.impl;

import org.springframework.stereotype.Service;
import tomu.cloud.microservice_user.service.TicketService;
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "SUCCESS！";
    }
}

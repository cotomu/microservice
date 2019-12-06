package tomu.cloud.microservice_user.service.impl;

import org.springframework.stereotype.Service;
import tomu.cloud.microservice_user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "yuanyuan";
    }
}

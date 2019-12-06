package tomu.cloud.eureka_client;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    @Autowired
    private EurekaClient eurekaClient;

    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @RequestMapping("/info")
    public String test() {

        return "test";
    }

    @RequestMapping("/test")
    public String testClient() {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("EurekaClient", false);
        return instanceInfo.getHomePageUrl();
    }
}

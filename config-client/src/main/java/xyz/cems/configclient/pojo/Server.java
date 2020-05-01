package xyz.cems.configclient.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("servidor")
public class Server {

    private String host;
    private int port;
}

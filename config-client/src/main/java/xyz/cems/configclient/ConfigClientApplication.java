package xyz.cems.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.cems.configclient.pojo.Server;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}

@Configuration
@RefreshScope
@RestController
class MessageRestController {

	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;

	@Autowired
	private Server server;

	@GetMapping("/msg")
	public String getMsg() {
		return this.msg;
	}

	@GetMapping("/server")
	public Server getServer() {
		return server;
	}
}
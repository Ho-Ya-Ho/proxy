package hello.proxy;

import hello.proxy.config.AppV1Config;
import hello.proxy.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({AppV1Config.class, AppV2Config.class}) //Config를 여러개 만들어서 원하는 것들만 Spring Container에 올리기위해서
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의 -해당 경로 아래의 파일들만 ComponentScan의 대상이 된다.-
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

}

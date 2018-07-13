package cn.ucmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * 1、Spring boot 启动报错 Failed to auto-configure a DataSource:
 *    需要在启动类的@EnableAutoConfiguration或@SpringBootApplication中添加exclude= {DataSourceAutoConfiguration.class}，排除此类的autoconfig。启动以后就可以正常运行。
 * 2、集成Mybatis后，将项目中对应的mapper类的路径加进来：@MapperScan("cn.ucmed.mapper")
 */

//@SpringBootApplication(scanBasePackages = {"web","service","mapper","mapping"})
@SpringBootApplication()
@MapperScan("cn.ucmed.mapper")
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}


	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {

		return (container -> {
			ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/400.html");
			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

			container.addErrorPages(error400Page, error401Page, error404Page, error500Page);
		});
	}
}

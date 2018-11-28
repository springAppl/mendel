package pvt.lee.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pvt.lee.spring.modle.Computer;

//@SpringBootApplication
public class MendelApplication {

	@Test
	public void name() {
		//SpringApplication.run(MendelApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Computer computer = (Computer) context.getBean("computer");
		System.out.println(computer.getMouse().getBrand());
	}

}

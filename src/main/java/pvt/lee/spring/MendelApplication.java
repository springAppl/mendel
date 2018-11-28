package pvt.lee.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pvt.lee.spring.instant.Item;
import pvt.lee.spring.name.Computer;

public class MendelApplication {

	@Test
	public void name() {
		ApplicationContext context = new ClassPathXmlApplicationContext("name.xml");
		Computer computer = (Computer) context.getBean("computer");
		System.out.println(computer.getMouse().getBrand());
	}

	@Test
	public void instantiat(){
		ApplicationContext context = new ClassPathXmlApplicationContext("instant.xml");
		Item itemByHand = (Item) context.getBean("itemByHand");
		System.out.println(itemByHand.getMethod());
		Item itemByFactory = (Item) context.getBean("itemByFactory");
		System.out.println(itemByFactory.getMethod());
	}
}

package pvt.lee.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pvt.lee.spring.autowir.DC;
import pvt.lee.spring.autowir.HeroCompany;
import pvt.lee.spring.autowir.Marvel;
import pvt.lee.spring.dependency.ConUnit;
import pvt.lee.spring.dependency.SetUnit;
import pvt.lee.spring.factory.Car;
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

	@Test
	public void dependency(){
		ApplicationContext context = new ClassPathXmlApplicationContext("dependency.xml");
		ConUnit conUnit = (ConUnit) context.getBean("conUnit");
		Assert.assertEquals("constructor", conUnit.getData().getMethod());
		SetUnit setUnit = (SetUnit) context.getBean("setUnit");
		Assert.assertEquals("setter", setUnit.getData().getMethod());
	}

	@Test
	public void lifecycel(){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
	}

	@Test
	public void dependon(){
		ApplicationContext context = new ClassPathXmlApplicationContext("dependon.xml");
	}

	@Test
	public void lazyinit(){
		ApplicationContext context = new ClassPathXmlApplicationContext("lazyinit.xml");
		context.getBean("bob");
	}

	@Test
	public void autowir(){
		ApplicationContext context = new ClassPathXmlApplicationContext("autowir.xml");
		DC dc = (DC) context.getBean("dc");
		System.out.println(dc.getBathMan());

		Marvel marvel = (Marvel) context.getBean("marvel");
		System.out.println(marvel.getAronMan());

		HeroCompany heroCompany = (HeroCompany) context.getBean("heroCompany");
		System.out.println(heroCompany);
		Assert.assertEquals(dc, heroCompany.getDc());
		Assert.assertEquals(marvel, heroCompany.getMarvel());
	}

	@Test
	public void aware(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aware.xml");
	}

	@Test
	public void processor(){
		new ClassPathXmlApplicationContext("processor.xml");
	}

	@Test
	public void factory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
		Car car = context.getBean(Car.class);
		System.out.println(car);
	}
}

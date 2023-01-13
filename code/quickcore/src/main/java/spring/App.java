package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtools.service.InventoryMgmtService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		InventoryMgmtService inventoryMgmtService = context.getBean("inventoryMgmtService", InventoryMgmtService.class);
		int price = inventoryMgmtService.getAvailableUnits("P9383");
		System.out.println("price : " + price);
	}
}

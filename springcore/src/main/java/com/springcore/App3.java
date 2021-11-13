package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
	public static void main(String[] args )
    {
     ApplicationContext context = new  ClassPathXmlApplicationContext("springcore.xml");
     Customer customer = (Customer) context.getBean("customer1");
     System.out.println(customer);
     Address address = (Address) context.getBean("address");
     System.out.println(address);
    }

}

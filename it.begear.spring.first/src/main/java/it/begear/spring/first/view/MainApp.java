package it.begear.spring.first.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.begear.spring.first.model.HelloWorld;

public class MainApp {
	   @Autowired
	   HelloWorld obj;
   public static void main(String[] args) {
	   
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	   	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	   	obj.getMessage();
   
   }
}
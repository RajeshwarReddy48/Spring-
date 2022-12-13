package com.spring.branfactory;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BeanFactory bean= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context= new ClassPathXmlApplicationContext("BeanFactory.xml");
		//Triangle triangle= (Triangle) context.getBean("triangle");
		//triangle.draw();
		
		//Circle circle= (Circle) context.getBean("circle");
	//	circle.draw();
		Shape shape= (Shape) context.getBean("circle");
		shape.draw();



	}

}

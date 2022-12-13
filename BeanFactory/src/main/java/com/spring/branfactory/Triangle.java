package com.spring.branfactory;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Triangle implements ApplicationContextAware, BeanNameAware {
	
public class Triangle implements Shape
{
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	public Point getPointA() {
		return PointA;
	}
	public void setPointA(Point pointA) {
		PointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	public Point getPointC() {
		return PointC;
	}
	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void draw()
	{
		System.out.println("Point A= {"+getPointA().getX()+","+getPointA().getY()+"}");
		System.out.println("Point B= {"+getPointB().getX()+","+getPointB().getY()+"}");
		System.out.println("Point C= {"+getPointC().getX()+","+getPointC().getY()+"}");


	}

	
	/*
	 * // initializing collections private List<Point> points; private
	 * ApplicationContext context=null;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 * 
	 * public void draw() { for(Point p: points) {
	 * System.out.println("Point = {"+p.getX()+","+p.getY()+"}"); } }
	 */
	/*
	 * public void setApplicationContext(ApplicationContext context) throws
	 * BeansException { // TODO Auto-generated method stub this.context=context;
	 * 
	 * }
	 * 
	 * public void setBeanName(String name) { // TODO Auto-generated method stub
	 * System.out.println("BeanName is: "+name);
	 * 
	 * }
	 */
	
	/*
	// Objects injection
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	public Point getPointA() {
		return PointA;
	}
	public void setPointA(Point pointA) {
		PointA = pointA;
	}
	public Point getPointB() {
		return PointB;
	}
	public void setPointB(Point pointB) {
		PointB = pointB;
	}
	public Point getPointC() {
		return PointC;
	}
	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void drawTriangle()
	{
		System.out.println("Point A= {"+getPointA().getX()+","+getPointA().getY()+"}");
		System.out.println("Point B= {"+getPointB().getX()+","+getPointB().getY()+"}");
		System.out.println("Point C= {"+getPointC().getX()+","+getPointC().getY()+"}");


	}
	/* Constructor injection
	 * private String type;
	 */
	/*private int height;
	
	public Triangle(String type) {

		this.type = type;
	}
	public Triangle(int height) {

		this.height = height;
	}
	public Triangle(String type, int height) {
		
		this.type = type;
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	/*
	 * public void setType(String type) { this.type = type; }
	 */
	/*public void drawTriangle()
	{
		System.out.println(getType()+ " Triangle is drawn with height of "+getHeight());
	}
	*/
}

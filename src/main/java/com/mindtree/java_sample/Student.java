package com.mindtree.java_sample;

/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}


public class Student {
	
	private int id;
	private String name;
	private String address;
	private String course_code;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		

	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
}
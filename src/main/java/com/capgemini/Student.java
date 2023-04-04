package com.capgemini;

public class Student {
	String id;
	String name;
	String number;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	public Student(String id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

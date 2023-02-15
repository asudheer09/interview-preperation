package com.example.day1;

import java.util.Objects;

public class Employee {
	
	private int id; // default value of int is 0
	private String name; // default value for any object is null
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		Employee employee= new Employee();
		int a=10;
		System.out.println(a); //10
		
		String s="hello";
		System.out.println(s);//hello
		
		System.out.println(employee);// packageName.className@HexadecimalCode
		
		
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

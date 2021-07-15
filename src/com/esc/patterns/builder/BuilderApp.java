package com.esc.patterns.builder;

public class BuilderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person.Builder("joe", "joe@gmail.com").setAge(20).build();
		System.out.println(person);

	}

}

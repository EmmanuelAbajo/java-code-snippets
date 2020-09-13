package com.esc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDriver {

	public static void main(String[] args) {
		Person p1 = new Person("Emmanuel","30");
		Person p2 = new Person("Emmanuel","30");
		Person p3 = new Person("Emmanuel","30");
		
		List<Person> personList = Stream.of(p1,p2,p3).collect(Collectors.toList());
		personList.forEach(x -> System.out.println(x));
		
//		System.out.println(personList);

	}

}

class Person {
	
	private String name;
	private String age;
	
	public Person() {};
	
	public Person(String name,String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}	
	


package com.org.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Colleague {

	private String name;
	private int age;
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Collegue [name=" + name + ", age=" + age + ", isActive=" + isActive + "]";
	}

}

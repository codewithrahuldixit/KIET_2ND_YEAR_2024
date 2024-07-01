package com.rahul;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Document
public class Student {
	@Id
	private int id;
	private String name;
	private long contact;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}

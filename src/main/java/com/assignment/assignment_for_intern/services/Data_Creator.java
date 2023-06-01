package com.assignment.assignment_for_intern.services;

public class Data_Creator {
	 private int id;
		private String name;
		
		 private String job;
		
		 private String location;
	 public Data_Creator(int id, String name, String job, String location) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.location = location;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", job=" + job + ", location=" + location + "]";
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



}

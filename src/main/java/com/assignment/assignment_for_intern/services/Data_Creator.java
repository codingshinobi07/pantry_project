package com.assignment.assignment_for_intern.services;

public class Data_Creator {
	 private int key;
	 private String value;
	public Data_Creator(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data_Creator [key=" + key + ", value=" + value + "]";
	}
	


}

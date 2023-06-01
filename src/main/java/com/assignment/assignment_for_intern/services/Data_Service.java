package com.assignment.assignment_for_intern.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
@Service
public class Data_Service {
	private  static List<Data_Creator> data_Creator=new ArrayList<>();
	public static int numberof = 0;

	
//	CREATING A STATIC DATA FOR OUR CRUD OPERATION

static {
		
		data_Creator.add(new Data_Creator(++numberof,"varun","SDE-1","Pune"));
		data_Creator.add(new Data_Creator(++numberof,"mark","SDE-2","DELHI"));

	}
public   List<Data_Creator> findByUserName(){
	
	
	return data_Creator.stream().toList();
}




//1............CREATE

public void create(Data_Creator data) {
	++numberof;
	data.setId(numberof);

	data_Creator.add(data);

}
//2,,,,,,,,,,,DELETE
public void delete(int id) {
	
	Predicate<? super 	Data_Creator>predicate=data_Creator->data_Creator.getId()==id;
	
	data_Creator.removeIf(predicate);
}
	
///3..................UPDATE
public Data_Creator update(int id) {
	
	Predicate<? super Data_Creator>predicate=data_Creator->data_Creator.getId()==id;
	
	Data_Creator dataCollection2 = data_Creator.stream().filter(predicate).findFirst().get();
	return dataCollection2;
}
public void updatetodo(Data_Creator data_Creator1) {
	
	delete(data_Creator1.getId());
	
	data_Creator.add(data_Creator1);
}
	
	
}

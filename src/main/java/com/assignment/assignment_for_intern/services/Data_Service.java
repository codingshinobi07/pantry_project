package com.assignment.assignment_for_intern.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
@Service
public class Data_Service {
	private  static List<Data_Creator> data_Creator=new ArrayList<>();
	public  static int numberof = 109234459;

	
//	CREATING A STATIC DATA FOR OUR CRUD OPERATION

static {
		
		data_Creator.add(new Data_Creator(++numberof,"value1"));
		data_Creator.add(new Data_Creator(++numberof,"value2"));

	}

public List getAll() {
	
	
	
	return data_Creator;
}
public List getById(int key) {
	Predicate<? super Data_Creator>predicate=data_Creator->data_Creator.getKey()==key;
	Data_Creator dataCollection2 = data_Creator.stream().filter(predicate).findFirst().get();
	
	return data_Creator;
}


//1............CREATE

public void create(Data_Creator data) {
	++numberof;
	data.setKey(numberof);

	data_Creator.add(data);

}
//2,,,,,,,,,,,DELETE
public void delete(int id) {
	
	Predicate<? super 	Data_Creator>predicate=data_Creator->data_Creator.getKey()==id;
	
	data_Creator.removeIf(predicate);
}
	
///3..................UPDATE
public Data_Creator update(int id) {
	
	Predicate<? super Data_Creator>predicate=data_Creator->data_Creator.getKey()==id;
	
	Data_Creator dataCollection2 = data_Creator.stream().filter(predicate).findFirst().get();
	return dataCollection2;
}

	
}

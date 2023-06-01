package com.assignment.assignment_for_intern.services;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Data_Controller {
	private Data_Service  data_Service;
	private Data_Creator  data_Creator;

	public Data_Controller(Data_Service data_Service) {
		super();
		// TODO Auto-generated constructor stub
		this.data_Service= data_Service;  
	}
	
	
	
	
@RequestMapping("home")

public String main(ModelMap model) {
	
	List<Data_Creator > data_Creator=data_Service.findByUserName();
	
	model.addAttribute("datas",data_Creator);	
	
	
	return "home";
}
@RequestMapping(value="add",method=RequestMethod.GET)
public String add(ModelMap model){

	Data_Creator data=new Data_Creator(0,"","","");
	model.put("data_Creator", data);
	List<Data_Creator > data_Creator=data_Service.findByUserName();
	
	model.addAttribute("datas",data_Creator);	
	return "home";
}




@RequestMapping(value="add",method=RequestMethod.POST)
public String add1(@RequestBody Data_Creator data,ModelMap model){
	
	data_Service.create(data);
	List<Data_Creator > data_Creator=data_Service.findByUserName();
	
	model.addAttribute("datas",data_Creator);	

	
	
	
	return "home";
}
@RequestMapping(value="delete")
public String delete(@RequestParam int id,ModelMap model){
	
	data_Service.delete(id);
	List<Data_Creator > data_Creator=data_Service.findByUserName();
	
	model.addAttribute("datas",data_Creator);	
	
	return "redirect:home";

}
@RequestMapping(value="update")
public String update(@RequestParam int id,ModelMap model){
	
	Data_Creator data_Creator=data_Service.update(id);
	model.addAttribute("data_Creator",data_Service);
	
	return "home";

}
@RequestMapping(value="update",method=RequestMethod.GET)
public String updateget(@RequestParam int id,ModelMap model){
	Data_Creator data_Creator=data_Service.update(id);
	model.addAttribute("data_Creator",data_Service);
	
	return "home";
}
@RequestMapping(value="update",method=RequestMethod.POST)
public String updatepost(ModelMap model,  Data_Creator dataCollection){
	
	
	model.addAttribute("data_Creator",data_Service);
	
	data_Service.updatetodo(dataCollection);
	return "home";
}















}

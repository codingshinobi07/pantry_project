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

@RestController
public class Data_Controller {

  private Data_Service data_Service;
  private Data_Creator data_Creator;

  public Data_Controller(Data_Service data_Service) {
    super();
    // TODO Auto-generated constructor stub
    this.data_Service = data_Service;
  }

  @RequestMapping("get-item")
  public List get() {
    List<Data_Creator> data_Creator = data_Service.getAll();

    return data_Creator;
  }

  @RequestMapping(value = "line-basket")
  public List linebasketget(@RequestParam int id, ModelMap model) {
    data_Service.delete(id);
    List<Data_Creator> data_Creator = data_Service.getById(id);

    return data_Creator;
  }

  @RequestMapping(value = "delete-item")
  public List delete(@RequestParam int id, ModelMap model) {
    data_Service.delete(id);
    List<Data_Creator> data_Creator = data_Service.getAll();

    model.addAttribute("datas", data_Creator);

    return data_Creator;
  }

  @RequestMapping(value = "update-item")
  public void update(@RequestParam int id, ModelMap model) {
    Data_Creator data_Creator = data_Service.update(id);
    model.addAttribute("data_Creator", data_Service);
  }
}

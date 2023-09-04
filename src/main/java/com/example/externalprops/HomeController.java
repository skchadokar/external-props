package com.example.externalprops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  PropReaders propReaders;

  @GetMapping("/print")
  public void printProps(){

    System.out.println("Say hi my name is : "+ propReaders.getName());
    System.out.println("Say hi my age is : "+ propReaders.getAge());
  }
}

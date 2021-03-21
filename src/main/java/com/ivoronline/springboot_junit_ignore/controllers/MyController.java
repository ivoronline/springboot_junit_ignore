package com.ivoronline.springboot_junit_ignore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/TestMe")
  public String testMe() {
    return "Hello from TestMe";
  }

  @ResponseBody
  @RequestMapping("/DisableMe")
  public String disableMe() {
    return "Hello from DisableMe";
  }

}

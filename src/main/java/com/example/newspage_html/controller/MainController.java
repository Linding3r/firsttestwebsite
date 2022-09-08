package com.example.newspage_html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/home")
  public String home(){
    return "index";
  }

  @PostMapping("/goauto")
  public String goauto1(){
    return "weather";
  }
  @GetMapping("/goauto")
  public String goauto2(){
    return "weather";
  }
}

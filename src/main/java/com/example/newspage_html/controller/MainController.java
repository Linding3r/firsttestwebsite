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

  @GetMapping("/weather")
  public String weather(){
    return "weather";
  }

  @GetMapping("/sport")
  public String sport(){
    return "sport";
  }

  @GetMapping("/entertainment")
  public String entertainment(){
    return "entertainment";
  }
}

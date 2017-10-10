package br.com.bhl.superfid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController
{

   @GetMapping
   public String index() {
      return "home/index";
   }
   
}
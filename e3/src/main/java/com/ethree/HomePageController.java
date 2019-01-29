package com.ethree;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController
{

   @RequestMapping("/")
   public String processHomePage() {
      return "Welcome To E3!!!!";
   }

}

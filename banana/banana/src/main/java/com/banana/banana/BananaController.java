package com.banana.banana;

// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
  
// Annotation
@Controller
@RequestMapping
// // Main class
public class BananaController {

@GetMapping("/ice_cream") 
public String ice_cream() {
    return "ice_cream";
}

//     @RequestMapping("/hello")
//     @ResponseBody
  
//     // Method
//     public String helloGFG()
//     {
//         return "Hello GeeksForGeeks";
//     }


// @RequestMapping(value = "/ice_cream")
// @ResponseBody

// // Method
// public String ice_cream()
// {
//     return "ice_cream.html";
// }
}



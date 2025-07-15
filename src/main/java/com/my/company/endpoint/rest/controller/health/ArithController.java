package com.my.company.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithController {

  @GetMapping("/add")
  public Long add(@RequestParam Long a, @RequestParam Long b) {
    return a + b;
  }
}

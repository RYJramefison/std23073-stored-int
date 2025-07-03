package com.my.company.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoredIntController {

  @GetMapping("/stored-int")
  public String getStoredInt() {
    return "123😒";
  }
}

package com.my.company.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
  @GetMapping("/stored-int")
  public int getStoredInt() {
    return 42;
  }
}

package com.my.company.endpoint.rest.controller.health;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {

  private static final Path filePath = Path.of("stored-int.txt");

  @GetMapping("/stored-int")
  public synchronized int getStoredInt() throws IOException {

    if (Files.exists(filePath)) {
      String value = Files.readString(filePath).trim();
      return Integer.parseInt(value);
    } else {
      int randomNumber = new Random().nextInt(100);
      Files.writeString(filePath, String.valueOf(randomNumber));
      return randomNumber;
    }
  }
}

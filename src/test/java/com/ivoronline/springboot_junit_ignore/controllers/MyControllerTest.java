package com.ivoronline.springboot_junit_ignore.controllers;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

  @Autowired MyController myController;

  @Test
  void testMe() {
    String result = myController.testMe();
    assertEquals("Hello from TestMe", result);
  }

  @Disabled
  void disableMe() {
    String result = myController.disableMe();
    assertEquals("Hello from DisableMe", result);
  }

}



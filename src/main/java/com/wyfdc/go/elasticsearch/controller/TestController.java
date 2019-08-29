package com.wyfdc.go.elasticsearch.controller;

import com.wyfdc.go.elasticsearch.service.TestService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 */
@RestController
@RequestMapping("/test")
public class TestController {

  @Autowired
  private TestService testService;

  @RequestMapping("/now")
  public Date getNow(){
    return new Date();
  }

  @GetMapping("/init")
  public String initUserInfo(){
      testService.init();
      return "SUCESS";
  }

}

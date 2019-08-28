package com.wyfdc.go.elasticsearch.Controller;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 */
@RestController
@RequestMapping("/test")
public class TestController {


  @RequestMapping("/now")
  public Date getNow(){
    return new Date();
  }

}

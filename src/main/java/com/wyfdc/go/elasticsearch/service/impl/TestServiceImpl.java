package com.wyfdc.go.elasticsearch.service.impl;

import com.alibaba.fastjson.JSON;
import com.wyfdc.go.elasticsearch.dao.UserRepository;
import com.wyfdc.go.elasticsearch.entity.es.User;
import com.wyfdc.go.elasticsearch.service.TestService;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void init() {
    String[] userNames = {"Jacob        ",
        "Joshua	      ",
        "William	  ",
        "Daniel	      ",
        "Michael	  ",
        "Ethan	      ",
        "Matthew	  ",
        "James	      ",
        "Joseph	      ",
        "Alexander    ",
        "Noah	      ",
        "Ryan	      ",
        "Jack	      ",
        "Andrew	      ",
        "Benjamin     ",
        "Samuel	      ",
        "Christophr   ",
        "David	      ",
        "Anthony	  ",
        "Dylan	      ",
        "Logan	      ",
        "Thomas	      ",
        "Tyler	      ",
        "John	      ",
        "Mason	      ",
        "Nathan	      ",
        "Nicholas     ",
        "Jayden	      ",
        "Jordan	      ",
        "Elijah	      ",
        "Jonathan     ",
        "Christian    ",
        "Gabriel	  ",
        "Luke	      ",
        "Liam	      ",
        "Brandon	  ",
        "Cameron	  ",
        "Aiden	      ",
        "Oliver	      ",
        "Zachary      "};

    for (int i=0;i<userNames.length;i++){
      String name =userNames[i].trim();
      int age = new Random().nextInt(50);
      int sex = new Random().nextInt(2);
      User user = new User();
      user.setUserId((new Integer(i).toString()));
      user.setName(name);
      user.setAge(age);
      user.setSex(sex);
      log.debug("--->>>init user: {}", JSON.toJSONString(user));
      userRepository.save(user);
    }
  }
}

package com.wyfdc.go.elasticsearch.controller;

import com.wyfdc.go.elasticsearch.entity.User;
import com.wyfdc.go.elasticsearch.service.UserService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserRepositoryController {


  @Autowired
  private UserService userService;

  @RequestMapping("/all")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @RequestMapping("/id/{userId}")
  public User getUser(@PathVariable String userId) {
    return userService.getUser(userId);
  }

  @RequestMapping(value = "/new", method = RequestMethod.POST)
  public User addNewUsers(@RequestBody User user) {
    return userService.addNewUsers(user);
  }







}

package com.wyfdc.go.elasticsearch.service.impl;

import com.wyfdc.go.elasticsearch.dao.UserRepository;
import com.wyfdc.go.elasticsearch.entity.es.User;
import com.wyfdc.go.elasticsearch.service.UserService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;


  @Override
  public User getUser(String userId) {
    log.info("Getting user with ID: {}", userId);
    List<User> users = new ArrayList<>();
    List<String> ids = new ArrayList<>();
    ids.add(userId);
    userRepository.findAllById(ids).forEach(users::add);
    log.info("User with ID: {} is {}", userId, users.get(0));
    return users.get(0);
  }

  @Override
  public List<User> getAllUsers() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }


  @Override
  public User addNewUsers(User user) {
    log.info("Adding user : {}", user);
    userRepository.save(user);
    log.info("Added user : {}", user);
    return user;
  }
}

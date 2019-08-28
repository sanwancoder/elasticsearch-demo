package com.wyfdc.go.elasticsearch.service;

import com.wyfdc.go.elasticsearch.entity.User;
import java.util.List;

/**
 * @Author:
 */
public interface UserService {

  User getUser(String userId);

  List<User> getAllUsers();

  User addNewUsers(User user);



}

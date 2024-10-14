package com.miti99.try_spring_boot.controller;

import com.miti99.try_spring_boot.document.User;
import com.miti99.try_spring_boot.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserController {
  final UserRepository userRepository;

  @PostConstruct
  public void init() {
    var user = new User("1", "name", "password", "value");
    userRepository.save(user);
  }
}

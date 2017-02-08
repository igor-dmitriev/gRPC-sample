package com.example.proto;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String name) {
    super("There is no user with such name " + name);
  }
}

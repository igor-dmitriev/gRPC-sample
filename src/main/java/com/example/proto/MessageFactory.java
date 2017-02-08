package com.example.proto;

import com.google.protobuf.StringValue;

/**
 * Created by Igor Dmitriev on 2/8/17
 */
public class MessageFactory {
  public User.Builder createUser() {
    return User.newBuilder();
  }

  public StringValue stringToStringValue(String val) {
    return StringValue.newBuilder().setValue(val).build();
  }

  public String stringValueToString(StringValue val) {
    return val.getValue();
  }
}

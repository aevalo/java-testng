package com.dev9;

public class IsItFriday {
  static public String isItFriday(String today) {
    if (today.equals("Friday")) {
      return "TGIF";
    }
    return "Nope";
  }
}

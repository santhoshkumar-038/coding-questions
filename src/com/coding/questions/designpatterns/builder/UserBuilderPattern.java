package com.coding.questions.designpatterns.builder;

public class UserBuilderPattern {
    public static void main(String[] args) {
      User user =  new User.UserBuilder("Santhosh", "Naroju")
                .age(26)
                .email("narojusanthoshkumar@gmail.com")
                .build();
      System.out.println(user.getFirstName() + " : " + user.getLastName() + " : " + user.getAge() + " : " + user.getEmail());
    }
}

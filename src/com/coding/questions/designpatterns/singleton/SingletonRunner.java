package com.coding.questions.designpatterns.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
      Singleton instance = Singleton.getInstance();
      System.out.println(instance.toString());
    }
}

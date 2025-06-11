package com.coding.questions.designpatterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}

package com.coding.questions.designpatterns.builder;

public class User{
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;

    public User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String address;

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

package org.lab08.messagingApp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage{}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission{
    String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission {
    String value();
}

class MessagingSystem {

    @CanSendMessage
    @RequiresPermission("ADMIN")
    public void sendMessage(Admin admin, String message){
        System.out.println("User is admin: " + message);
    }

    @CanSendMessage
    @RequiresPermission("USER")
    public void sendMessage(User user, String message){
        System.out.println("User is not admin: " + message);
    }
}

class Admin {
    private String name;
    public Admin(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class Main {
    public static void main(String[] args){
        MessagingSystem messangingSystem = new MessagingSystem();
        Admin admin = new Admin("Edina");
        User user = new User("Kenai");

        messangingSystem.sendMessage(user, "Ja sam user");
        messangingSystem.sendMessage(admin, "Ja sam admin");
    }
}
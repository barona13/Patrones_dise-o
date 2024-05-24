package com.state;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.onActive());
        System.out.println(user.onBuy());
        System.out.println(user.onLock());
        System.out.println(user.onBuy());
        System.out.println(user.onActive());
        System.out.println(user.onLock());
        System.out.println(user.onDisable());
        System.out.println(user.onLock());
    }
}
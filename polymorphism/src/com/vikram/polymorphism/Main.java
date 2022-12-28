package com.vikram.polymorphism;

import com.vikram.polymorphism.ClassMonitor;

public class Main {
    public static void main(String[] args) {

        ClassMonitor classMonitor = new ClassMonitor("Mike");
        System.out.println(classMonitor);
        classMonitor.play();
    }
}
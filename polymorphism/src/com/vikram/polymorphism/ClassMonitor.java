package com.vikram.polymorphism;

public class ClassMonitor extends Student {
    public void monitorClass(){
        System.out.println("Monitor is monitoring the class");
    }

    public ClassMonitor(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void doStudy() {
        super.doStudy();
    }

    @Override
    public void doStudy(String subject) {
        super.doStudy(subject);
    }

    @Override
    public void commute() {
        super.commute();
    }

    @Override
    protected void play() {
        System.out.println("Monitor is playing");
    }

//    @Override
//    private void play() {
//        System.out.println("Monitor is playing");
//    }



    @Override
    public String toString() {
        return "com.vikram.polymorphism.ClassMonitor{"+ super.toString()+"}";
    }

    @Override
    ClassMonitor studentDetails() {
        return this;
    }
}

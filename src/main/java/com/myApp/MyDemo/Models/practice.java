package com.myApp.MyDemo.Models;
class Mythread extends Thread {
    public static void main(String[] args) {
        Mythread my = new Mythread();
        Thread t = new Thread(my);
        t.start();
    }


    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "..");
        }
    }
}
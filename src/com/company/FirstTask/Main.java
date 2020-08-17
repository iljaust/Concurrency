package com.company.FirstTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Foo foo = new Foo();

        Thread t1 = new Thread(() -> {
            try{

                foo.first();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try{
                foo.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try{
                foo.third();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }
}


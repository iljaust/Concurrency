package com.company.FirstTask;

import java.util.concurrent.Semaphore;

public class Foo {
    private final Semaphore sem;
    private final Semaphore sem2;

    public Foo(){
        this.sem = new Semaphore(0);
        this.sem2 = new Semaphore(0);

    }
    public void first() throws InterruptedException {

        System.out.print("first");
        sem.release();
    }

    public void second() throws InterruptedException {
        sem.acquire();
        System.out.print("second");
        sem2.release();
    }

    public void third() throws InterruptedException {
        sem2.acquire();
        System.out.print("third");

    }
}


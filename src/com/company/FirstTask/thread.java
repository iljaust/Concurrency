package com.company.FirstTask;

import com.company.FirstTask.Foo;

import java.util.concurrent.Semaphore;

public class thread implements Runnable{

    private Foo foo = new Foo();
    private Semaphore sem;

    thread(Semaphore s){
        sem = s;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem.release();
    }
}

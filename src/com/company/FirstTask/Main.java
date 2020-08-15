package com.company.FirstTask;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);

        new thread(sem);
        new threadB(sem);
        new threadC(sem);
    }
}

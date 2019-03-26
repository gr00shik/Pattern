package com.gr00shik;

import com.gr00shik.model.Computer;

import java.awt.*;

public class App {
    public static void main( String[] args ) {

        System.out.println("Start project to demonstrate Builder pattern");
        System.out.println("Create first computer");
        Computer computer1 = new Computer.Builder()
                .withProcessor("Intel")
                .withHddSize(1024)
                .withPowerBlock(600)
                .build();

        System.out.println(computer1);

        System.out.println("Create second computer");
        Computer computer2 = new Computer.Builder()
                .withProcessor("Amd")
                .withHddSize(2048)
                .withPowerBlock(800)
                .withMonitor(new Dimension(1980, 1024))
                .withRam("Goodway")
                .build();

        System.out.println(computer2);
    }
}

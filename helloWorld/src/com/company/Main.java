package com.company;


import java.util.Scanner;

public class Main {

    public static void helloName (String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
	    helloName (name);
    }
}

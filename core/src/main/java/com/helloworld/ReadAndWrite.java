package com.helloworld;

import java.util.Scanner;

public class ReadAndWrite {

    private static final Scanner scanner = new Scanner(System.in);

    public ReadAndWrite() {
    }

    public static void write(String message) {
        System.out.println(message);
    }

    public static String read() {
        return scanner.nextLine();
    }
}

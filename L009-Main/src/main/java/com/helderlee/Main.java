package com.helderlee;

public class Main {

    public static void main(String[] args) {
        System.out.format("Args size = %d", args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.format("%nargs[%d] = %s", i, args[i]);
        }
    }
}

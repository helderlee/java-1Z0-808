package com.helderlee;

import static java.lang.Math.*;

public class StaticImport {

    public static void main(String[] args) {
        int m = min(5, 7);
        System.out.format("Min = %d", m);
        System.out.format("%nPI = %f", PI);
    }

}

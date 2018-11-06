package com.helderlee;

public class DecimalNumbers {

    public static void main(String[] args) {
        float myFloat = 24.7f;

        /**
         * Does not compile
         */
        //double before = 10_.5;
        //double after = 10._5;
        //double first = _10.5;
        //double last = 10.5_;

        double myDouble = 10.5;

        double scientific = 5.00012E3;

        System.out.printf("Number: %f", scientific);
    }
}

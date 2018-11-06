package com.helderlee;

public class Literal {

    public static void main(String[] args) {
        long longValue = 12_311_321_312L;

        /**
         * Octal: 0-7
         */
        int octal = 077;

        System.out.printf("Octal to decimal: %d\n", octal);
        System.out.printf("Octal: %s\n", Integer.toOctalString(octal));

        /**
         * Hexadecimal: 0-9 and A-F
         */
        int hexa = 0xF;
        System.out.printf("Hexadecimal to decimal: %d\n", hexa);
        System.out.printf("Hexadecimal: %s\n", Integer.toHexString(hexa));

        /**
         * Binary
         */
        int binary = 0b1001;
        System.out.printf("Binary to decimal: %d\n", binary);
        System.out.printf("Binary: %s\n", Integer.toBinaryString(binary));

    }

}

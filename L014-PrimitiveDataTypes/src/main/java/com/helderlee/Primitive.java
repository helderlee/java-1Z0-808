package com.helderlee;

public class Primitive {

    /**
     * true, false
     */
    private boolean verdade = true;

    /**
     * 8 bits: -128 to 127
     */
    private byte byteValue = -128;
    private byte byteChar = 'A';

    /**
     * 16 bits: -32768 to 32767
     */
    private short shortValue = -32768;
    private short shortChar = 'A';

    /**
     * 16 bits: 0 to 65535
     */
    private char charValue = 65535;
    private char charChar = 'A';

    /**
     * 32 bits: -2147483648 to 2147483647
     */
    private int intValue = -2147483648;

    /**
     * 64 bits: -9223372036854775808 to 9223372036854775807
     */
    private long longValue = -9223372036854775808L;

    /**
     * 32 bits: -3.40282347E+38F to 3.40282347E+38F
     * (6-7 significant decimal digits)
     */
    private float floatValue = 3.40282347E+38F;

    /**
     * 64 bits: -1.79769313486231570E+308 to 1.79769313486231570E+308
     * (15 significant decimal digits)
     */
    private double doubleValue = 1.79769313486231570E+308;


}

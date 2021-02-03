package com.anasmannaa.digits;

public class DigitConverter {

    /**
     * This method is used to convert an array of digits representing a specific
     * binary number  into the equivalent decimal number and returns the decimal.
     * @param binaryDigit This is the parameter to pass an array of digits representing the binary number specified
     * @return int This returns the equivalent decimal value number of the specified binary number.
     */
    public int binaryToDecimal(int[] binaryDigit) {
        int totalValue = 0;
        int exponent = 0;
        for (int i = binaryDigit.length-1; i >= 0; i--) {
            totalValue += binaryDigit[i] *  (int) Math.pow(2,exponent) ;
            exponent++;
        }
        return totalValue;
    }

    /**
     * This method is used to convert an array of digits representing a specific
     * octal number  into the equivalent decimal number and returns the decimal.
     * @param octalDigits This is the parameter to pass an array of digits representing the octal number specified
     * @return int This returns the equivalent decimal number of the specified octal number.
     */
    public int octalToDecimal(int[] octalDigits) {
        int totalValue = 0;
        int exponent = 0;
        for (int i = octalDigits.length-1; i >= 0; i--) {
            totalValue += octalDigits[i] *  (int) Math.pow(8,exponent) ;
            exponent++;
        }
        return totalValue;
    }

    /**
     * This method is used to convert an array of digits representing a specific
     * octal number  into the equivalent decimal number and returns the decimal.
     * @param hexaDigits This is the parameter to pass an array of digits representing the octal number specified
     * @return int This returns the equivalent decimal number of the specified octal number.
     */
    public int hexaToDecimal(int[] hexaDigits) {
        int totalValue = 0;
        int exponent = 0;
        for (int i = hexaDigits.length-1; i >= 0; i--) {
            totalValue += hexaDigits[i] *  (int) Math.pow(16,exponent) ;
            exponent++;
        }
        return totalValue;
    }
}

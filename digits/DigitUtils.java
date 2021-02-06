package com.anasmannaa.digits;

public class DigitUtils {

    /**
     * This method is used to convert a string representation parallel to a number (binary, octal, decimal, hexadecimal)
     * into an int array of its individual digits with the length of the number string itself.
     * @param numericString This is the parameter to pass the string specified.
     * @return int[] This returns the equivalent array of integers.
     */
    public int[] createNumericArray(String numericString) {
        int length = numericString.length();
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(numericString.charAt(i))) {
                char digit = numericString.charAt(i);
                newArray[i] = Character.getNumericValue(digit);
            } else {
                String digit = String.valueOf(Character.toUpperCase(numericString.charAt(i)));
                switch(digit) {
                    case "A":
                        newArray[i] = 10;
                        break;
                    case "B":
                        newArray[i] = 11;
                        break;
                    case "C":
                        newArray[i] = 12;
                        break;
                    case "D":
                        newArray[i] = 13;
                        break;
                    case "E":
                        newArray[i] = 14;
                        break;
                    case "F":
                        newArray[i] = 15;
                        break;
                }
            }
        }
        return newArray;
    }

    /**
     * This method is used to convert an array of digits
     * into an a String with the digits arranged left to right respectively.
     * @param numberArray This is the parameter to pass the digits array.
     * @return String This returns the integer represents the array of digits.
     */
    public String digitsArrayToNumber(int[] numberArray) {
        String numberString = null;
        for (int i = 0; i < numberArray.length; i++) {
            numberString += numberArray[i];
        }
        return numberString;
    }

}

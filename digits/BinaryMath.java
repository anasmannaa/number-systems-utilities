package com.anasmannaa.digits;

public class BinaryMath {

    /**
     * This method is used to convert a string of a specific number digits (binary, octal, decimal, hexadecimal)
     * into an int array of its individual digits with the length of the number string itself.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @return String This returns the sum of the two binaries in a string form of a result binary number.
     */
    public String addTwoBinaries(String firstBinary, String secondBinary){
        var digitUtils = new DigitUtils();
        var digitConverter = new DigitConverter();
        int[] digitArrayOne = digitUtils.createNumericArray(firstBinary);
        int[] digitArrayTwo = digitUtils.createNumericArray(secondBinary);
        int firstDecimal = digitConverter.binaryToDecimal(digitArrayOne);
        int secondDecimal = digitConverter.binaryToDecimal(digitArrayTwo);
        int decimalResult = firstDecimal + secondDecimal;
        return(digitConverter.decimalToBinary(decimalResult)) ;
    }
}

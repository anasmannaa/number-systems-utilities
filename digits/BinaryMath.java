package com.anasmannaa.digits;

public class BinaryMath {

    /**
     * This method is used to add two binaries and return a string representation of the result in a binary form.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @return String This returns the sum of the two binaries in a string form of the result binary number.
     */
    public String addTwoBinaries(String firstBinary, String secondBinary){
        return calculateBinaries(firstBinary, secondBinary, "add");
    }

    /**
     * This method is used to subtract two binaries and return a string representation
     * of the difference between the two values in a binary form.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @return String This returns the result of subtraction of the two binaries in a string form of the result binary number.
     */
    public String subtractTwoBinaries(String firstBinary, String secondBinary){
        return calculateBinaries(firstBinary, secondBinary, "subtract");

    }

    /**
     * This method is used to multiply two binaries and return a string representation of the result in a binary form.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @return String This returns the sum of the two binaries in a string form of the result binary number.
     */
    public String multiplyTwoBinaries(String firstBinary, String secondBinary){
        return calculateBinaries(firstBinary, secondBinary, "multiply");
    }

    /**
     * This method is used to divide two binaries and return a string representation of the result in a binary form.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @return String This returns the sum of the two binaries in a string form of the result binary number.
     */
    public String divideTwoBinaries(String firstBinary, String secondBinary){
        return calculateBinaries(firstBinary, secondBinary, "divide");
    }

    /**
     * This method is the underneath method of all binary math other methods.
     * @param firstBinary This is the parameter to pass the first binary number in a string form.
     * @param secondBinary This is the parameter to pass the second binary number in a string form.
     * @param operation This is the parameter to determine which math operation is going to be performed.
     * @return String This returns the sum of the two binaries in a string form of the result binary number.
     */
    private String calculateBinaries(String firstBinary, String secondBinary, String operation){
        var digitUtils = new DigitUtils();
        var digitConverter = new DigitConverter();
        int[] digitArrayOne = digitUtils.createNumericArray(firstBinary);
        int[] digitArrayTwo = digitUtils.createNumericArray(secondBinary);
        int firstDecimal = digitConverter.binaryToDecimal(digitArrayOne);
        int secondDecimal = digitConverter.binaryToDecimal(digitArrayTwo);
        int decimalResult = 0;
        switch (operation) {
            case "add" :
                decimalResult = firstDecimal + secondDecimal;
                break;
            case "subtract":
                decimalResult = firstDecimal - secondDecimal;
                break;
            case "multiply":
                decimalResult = firstDecimal * secondDecimal;
                break;
            case "divide":
                decimalResult = firstDecimal / secondDecimal;
                break;
        }
        return(digitConverter.decimalToBinary(decimalResult)) ;
    }


}

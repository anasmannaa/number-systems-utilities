package com.anasmannaa;


import com.anasmannaa.digits.DigitConverter;
import com.anasmannaa.digits.DigitUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String digits = in.nextLine();
        var digitUtil = new DigitUtils();
        var digitsConverter = new DigitConverter();

        // example: convert Hexadecimal into Decimal
        System.out.println("Insert Hexadecimal Digit:");
        int[] hexaArray = digitUtil.createNumericArray(digits);
        System.out.println(digitsConverter.hexaToDecimal(hexaArray));

        // example: convert Octal into Decimal
        System.out.println("Insert Octal Digit:");
        digits = in.nextLine();
        hexaArray = digitUtil.createNumericArray(digits);
        System.out.println(digitsConverter.octalToDecimal(hexaArray));

        // example: convert Binary into Decimal
        System.out.println("Insert Binary Digit:");
        digits = in.nextLine();
        hexaArray = digitUtil.createNumericArray(digits);
        System.out.println(digitsConverter.binaryToDecimal(hexaArray));

    }
}

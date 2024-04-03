package com.olive.gatlingdemo;

import java.util.Random;

public class Test {

    public static String generaterrn() {
        // Generate a random 6-digit number
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000; // Generates a random number between 100000 and 999999
        System.out.println(randomNumber);
        return String.valueOf(randomNumber);
    }
    
    public static void main(String[] args) {
    	generaterrn();
	}

}

package com.bestbuy.utils;

import java.util.Random;

public class TestUtils {

	public static String getRandomValue(){
		Random random = new Random();
		double randomInt = random.nextDouble(100000);
		return Double.toString(randomInt);
	}

	public static String getRandomName(){
		String saltChars = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder name = new StringBuilder();
		Random random = new Random();
		while (name.length() < 7) {
			int index = (int) (random.nextFloat() * saltChars.length());
			name.append(saltChars.charAt(index));
		}
		String saltStr = (name.toString());
		return saltStr;
	}
}

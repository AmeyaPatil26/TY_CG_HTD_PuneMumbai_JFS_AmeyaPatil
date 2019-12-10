package com.capg.exception.first;

import java.io.File;
import java.io.IOException;

public class TestD {

	public static void main(String[] args) {

		System.out.println("main started");
		File f = new File("viky.txt");
		try {
			f.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			System.out.println("unable to create file");
		}
		System.out.println("main ended");

	}

}

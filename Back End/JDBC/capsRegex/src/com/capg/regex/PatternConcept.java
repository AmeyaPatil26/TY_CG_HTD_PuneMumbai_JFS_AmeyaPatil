package com.capg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {
	static Pattern pattern;
	static Matcher matcher;

	public static void main(String[] args) {
		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher("2");
		System.out.println("pattern \\d: " + matcher.matches());

		pattern = Pattern.compile("\\d+");
		matcher = pattern.matcher("233562314");
		System.out.println("pattern \\d: " + matcher.matches());

		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher("c");
		System.out.println("pattern \\D: " + matcher.matches());

		pattern = Pattern.compile("\\w");
		matcher = pattern.matcher("c");
		System.out.println("pattern \\w: " + matcher.matches());

		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher("cgjfkbm");
		System.out.println("pattern \\w: " + matcher.matches());

		pattern = Pattern.compile("\\W");
		matcher = pattern.matcher("6");
		System.out.println("pattern \\W: " + matcher.matches());

	}

}

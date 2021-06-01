package com.testsonar;

public class TestJavaSourceFile {
	
	static int a=10;
	static int b=20;

	public static void main(String string) {
		System.out.println("Welcome to SonarQube");
		if(a>b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}

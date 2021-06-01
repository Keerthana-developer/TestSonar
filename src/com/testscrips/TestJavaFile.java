package com.testscrips;

import org.testng.annotations.Test;

import com.testsonar.TestJavaSourceFile;

public class TestJavaFile {

@Test
	public void testSonar() {
	
	TestJavaSourceFile t=new TestJavaSourceFile();
	t.main("Demo");
		
	}
	
}

package jxt.utils;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestGetPath {
	
	@Test
	public void testGetPath() throws IOException {
		String path = new File("").getCanonicalPath();
		System.out.println(path);
	}
	
}

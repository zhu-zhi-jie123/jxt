package jxt.utils;

import org.junit.Test;

import com.jxt.utils.QRCode;

public class TestQRCode {

	@Test
	public void testQRCode() throws Exception {
		String path = QRCode.generateQRCode("哈哈哈", 150, 150, "png");
		System.out.println(path);
	}
	
}

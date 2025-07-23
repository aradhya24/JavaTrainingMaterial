package com.aurionpro.strreverse;

public class HiddenOps {
      
	private String secretCode(String input) {
		StringBuffer buffer = new StringBuffer(input);
		return buffer.reverse().toString();
	}
}

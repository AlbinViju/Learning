package com.quest.qtim.load.core;

public class StripNonAlphaNumericFromString {

	public static void main(String[] args) {
		String value = " Chlamydia_spp. IgG, IgM & IgA Abs (8006) ";
		
		System.out.println(value.replaceAll("[^A-Za-z0-9]", ""));

	}

}

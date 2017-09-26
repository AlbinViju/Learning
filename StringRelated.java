package com.quest;

import java.util.HashSet;

public class StringRelated {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + (s1 == s2));
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		
		String str = null;
		String str1="abc";
		System.out.println(str1.equals("abc") | str.equals(null));
		
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		
		int x1 = 10*10-10;
		
		System.out.println(x1);
		
		String s4="nrk";
        String s5="nrk";
        String s6=new String("nrk");
        if(s4==s5){
                      System.out.println("s4 & s5 equal");
         }
         else{
                      System.out.println("s4 & s5 not equal"); 
         }
         if(s5==s6){
                      System.out.println("s5 & s6 equal");
         }
           else{
                       System.out.println("s5 & s6 not equal");
          }
         
         String a = "var1";
         String b = "var2";
         a = a+b;
         b = a.substring(0, b.length());
         a = a.substring(b.length(), a.length());
         System.out.println(a);
         System.out.println(b);
        		 
	}

}

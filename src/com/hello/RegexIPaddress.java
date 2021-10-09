package com.hello;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexIPaddress {
	public static void main(String args[]) {
		System.out.println("Enter the ip address");
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String pattern = "((00[0-9]|[0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}"
				+ "(00[0-9]|[0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
		//OR you can also write above pattern as:
		/*String pattern = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.+ 
		  "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."
				+ "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."
				"([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
				*/
		Pattern patterns = Pattern.compile(pattern);
		Matcher matcher = patterns.matcher(ip);
		System.out.println(matcher.matches());
		
				
	}

}

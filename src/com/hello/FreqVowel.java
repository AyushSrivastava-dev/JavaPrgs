package com.hello;
import java.util.*;
import java.io.*;
public class FreqVowel {
	String str;
	int freq;
	FreqVowel(){
		str = "";
		freq = 0;
	}
	void freqOfVowel() {
		String v = "AEIOUaeiou";
		StringTokenizer st = new StringTokenizer(str);
		int m = st.countTokens();
		for(int i = 1; i<=m; i++) {
			String s = st.nextToken();
			int c = 0;
			for(int j = 0; j<s.length(); j++) {
					char ch = s.charAt(j);
					if(v.indexOf(ch)!=-1) {
						c++;
					}
				}
			
			if(c>=2)
				++freq;
		}
	}
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FreqVowel f = new FreqVowel();
	    System.out.println("Enter any sentence");
	    f.str = br.readLine();
	    f.freqOfVowel();
	    System.out.println(" "+f.freq);
	}

}

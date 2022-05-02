package com.posidex.test;

public class NoofSubStringsPolindroms {
	public static void main(String[] args) {
		String str="aabb";
		
		char []chararr=str.toCharArray();
		
		for(int i=1;i<=chararr.length;i++) {
			
			for(int j=0; j<=chararr.length-i;j++) {
				
				int k=i+j-1;
				String substr="";
				for(int l=j;l<=k;l++) {
					substr=substr+chararr[l];
					//System.out.print(chararr[l]);
				}
								
				if(substr.equals(reverseString(substr))) {
					
					System.out.println(substr);
					//System.out.println(substr+"  palindrome");
				}
				else {
					System.out.println("==="+substr);
					//System.out.println(substr+" notpolindrome");
					reArrangingString(substr);
					
				}
				
			}		
		}		
	}
	static void reArrangingString(String substr) {
		
		
		for(int i=0;i<substr.length();i++) {
		
		String asdf=substr.charAt(substr.length()-1)+substr.substring(0, substr.length()-1);
		
		if(asdf.equals(reverseString(asdf))) {
			System.out.println("rearranged : "+asdf);
			//System.out.println(asdf+" rearrangedpolindrom");	
			break;
		}
		else {		
		substr=asdf;
		}		
		}		 
	}
	
	static String reverseString(String substr){
		String reverse="";		
		for(int rev=substr.length()-1;rev>=0;rev--) {
			
			reverse=reverse+substr.charAt(rev);
		}		
		
		return reverse;
	}
	
 }

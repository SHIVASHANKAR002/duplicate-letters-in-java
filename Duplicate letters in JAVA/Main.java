package com.packages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String dupeCheck;
    int i,j,c;
        Scanner dupeinput = new Scanner(System.in);
        System.out.println("enter the string to check duplicated letters:");
        dupeCheck = dupeinput.nextLine();
        char s[]= dupeCheck.toCharArray();
        for (i = 0;i< dupeCheck.length();i++) {
            c = 1;
            for (j=i+1;j<dupeCheck.length();j++){
                if(s[i]==s[j] ) {
                    if (s[j]!=' ') {
                        c++;
                        s[j] = '0';
                    }
                }
            }
            if (c>1 ){
                if (s[i] != '0'){
                    System.out.println(s[i]);
                }
            }
        }
    }
}



package ru.ignatovichanastasiia.testexam;

import java.io.*;

public class Testexam5 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
 
        String J = r.readLine();
        String S = r.readLine();
 
        int result = 0;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (J.indexOf(ch) >= 0) {
                ++result;
            }
        }
        System.out.println(result);
    } 
}

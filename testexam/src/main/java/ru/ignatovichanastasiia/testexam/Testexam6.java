
package ru.ignatovichanastasiia.testexam;

import java.util.Scanner;

public class Testexam6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String j = sc.nextLine();
        
        char[] arrS = s.toCharArray();
        char[] arrJ = j.toCharArray();

        int score = 0;        
        for(int x = 0; x<arrJ.length;x++){
            for(int y = 0; y<arrS.length; y++){
                if(arrJ[x]==arrS[y]){
                    ++score;
                    break;
                }
            }
        }
        
        System.out.println(score);
    }
}

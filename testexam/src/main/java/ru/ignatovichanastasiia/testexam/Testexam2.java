package ru.ignatovichanastasiia.testexam;

import java.io.*;

public class Testexam2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("output.txt"));
            String line = br.readLine();
            String[] inputArr = line.trim().split(" ");
            int[] intArr = new int[2];
            for (int x = 0; x < inputArr.length; x++) {
                intArr[x] = Integer.parseInt(inputArr[x]);
            }
            int m = intArr[0] + intArr[1];
            wr.write(""+m);
            br.close();
            wr.close();
    }
}
//работает только после закрытия ресурса
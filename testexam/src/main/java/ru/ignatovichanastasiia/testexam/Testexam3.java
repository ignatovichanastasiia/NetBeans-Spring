package ru.ignatovichanastasiia.testexam;
import java.io.*;
//multy line
public class Testexam3 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
    String everything = sb.toString();
    }
}


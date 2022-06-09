
package ru.ignatovichanastasiia.testexam;
import java.io.*;

public class Testexam4 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        String[] inputArr = input.trim().split(" ");
        int[] intArr = new int[2];
        for(int x = 0; x < inputArr.length; x++){
                intArr[x] = Integer.parseInt(inputArr[x]);
        }
        int result = intArr[0]+intArr[1];
        System.out.println(result);
    }
}

//Ввод и вывод прошли тест в системе. Стандартный ввод, стандартный вывод. Быстрее на 20мс

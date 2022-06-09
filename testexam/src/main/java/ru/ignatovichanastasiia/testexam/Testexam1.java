package ru.ignatovichanastasiia.testexam;
import java.util.Scanner;
public class Testexam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] inputArr = input.trim().split(" ");
        int[] intArr = new int[2];
        for(int x = 0; x < inputArr.length; x++){
                intArr[x] = Integer.parseInt(inputArr[x]);
        }
        
        System.out.println(intArr[0]+intArr[1]);
    }
}

//Ввод и вывод прошли тест в системе. Стандартный ввод, стандартный вывод.
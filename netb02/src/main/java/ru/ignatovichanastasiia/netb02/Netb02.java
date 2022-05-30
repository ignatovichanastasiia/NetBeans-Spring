/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb02;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb02 {

    public static void main(String[] args) {
        System.out.println("Введите год рождения\n");
        Scanner scanner = new Scanner(System.in);
        int bornYear = scanner.nextInt();
        int thisYear = LocalDate.now().getYear();
        System.out.println("Этот год "+ thisYear);
        System.out.println("В этом году вам исполнится/исполнилось "+ (thisYear - bornYear));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperature;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Temperature {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Number of Days: ");
    int days = obj.nextInt();
    int [] tempreture = new int[days];
    int sum = 0;
    int lastindex = tempreture.length - 1;
   
    
    
    for(int i = 0 ; i < days; i++){
        System.out.print("Day "+ (i+1) + " high temp"+":");
        tempreture[i] = obj.nextInt();
        sum += tempreture[i];
       
       
        
    }
    
    double average = (double)sum/days;
    System.out.println("This is the total Average: " + String.format("%.1f", average));
    Arrays.sort(tempreture);
    System.out.print("This is the Coldest Tempreture: ");
    System.out.println( tempreture[0]);
    
    System.out.print("This is the hottest Tempreture: ");
    System.out.print(tempreture[lastindex]);
    }
}

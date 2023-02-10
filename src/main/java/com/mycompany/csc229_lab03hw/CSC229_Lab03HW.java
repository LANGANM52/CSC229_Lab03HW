/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229_lab03hw;

import java.util.Scanner;

/**
 *
 * @author mattl
 */
public class CSC229_Lab03HW {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Binary search example
        int arr[] = {7, 16, 25, 39, 43, 54, 88, 92, 106, 117, 132, 151, 167, 184};        
        System.out.print("(Binary Search) Enter the search number: ");
        int x = in.nextInt();        
        int start = 0, end = arr.length - 1, index = -1;
        while (start <= end) {
            int m = (start + end) / 2;
            if (arr[m] < x)
                start = m + 1;
            else if (arr[m] > x)
                end = m - 1;
            else {
                index = m;
                break;
            }                
        }        
        if (index == -1) {
            System.out.println("Number searched was not found");
        }
        else {
            System.out.println(x + " was found at the position " + index);
        }
        
        //Linear search example
        int arr2[] = {142, 14, 384, 127, 12, 53, 22, 45, 23, 56, 132, 88};        
        System.out.print("(Linear Search) Enter the search number: ");
        int y = in.nextInt();        
        int i = 0, n = arr2.length - 1, location;
        while (i <= n && y != arr2[i]) {
            i = i + 1;
        }
        if (i <= n) {
            location = i;
            System.out.println(y + " was found at the position " + location);
        } else {
            System.out.println("Number searched was not found");
        }
        
        
        
            
    }
}

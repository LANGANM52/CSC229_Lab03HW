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
        
        //Binary search initialization
        int arr[] = {7, 14, 384, 127, 54, 97, 47, 73, 96, 25, 65, 88, 42};        
        System.out.print("(Binary Search) Enter the search number: ");
        int x = in.nextInt();        
        int start = 0, end = arr.length - 1, index = -1;
        
        //Selection sort example
        int outer, inner, min, size = arr.length;
        for (outer = 0; outer < size - 1; outer++) {
        min = outer;
        for (inner = outer + 1; inner < size ; inner++) {
        if (arr[inner] < arr[min]) {
        min = inner;
}
}
        int temp = arr[outer];
        arr[outer] = arr[min];
        arr[min] = temp;
}
        
        //Binary search example
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
        
        //Selection sort print example
        int outer2, inner2, min2, size2 = arr2.length;
        for (outer2 = 0; outer2 < size2 - 1; outer2++) {
        min2 = outer2;
        for (inner2 = outer2 + 1; inner2 < size2 ; inner2++) {
        if (arr2[inner2] < arr2[min2]) {
        min2 = inner2;
}
}
        int temp2 = arr2[outer2];
        arr2[outer2] = arr2[min2];
        arr2[min2] = temp2;
}
        System.out.println("Array sorted! now printing...");
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2] + " " + arr2[3] + " " + arr2[4] + " " + arr2[5] + " " + arr2[6] + " " + arr2[7] + " " + arr2[8] + " " + arr2[9] + " " + arr2[10] + " " + arr2[11]);


        
    }
}

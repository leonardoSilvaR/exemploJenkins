/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.coding.teste;

import java.util.Scanner;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scan.nextInt();
    
        }

        for (int j = array.length-1; j >= 0; j--) {
            System.out.printf("%d ", array[j]);
        }

        scan.close();

    }

}

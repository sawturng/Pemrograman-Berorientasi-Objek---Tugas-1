/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Tugas2 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int uang;
        boolean hujan;

        System.out.print("Masukkan jumlah uang : ");
        uang = myObj.nextInt();

        System.out.print("Apakah hujan (true/false) : ");
        hujan = myObj.nextBoolean();

        if ((uang > 5000) && (!hujan)) {
            System.out.println("Saya jadi membeli gorengan");
        } else {
            System.out.println("Saya tidak membeli gorengan");
        }

    }
}

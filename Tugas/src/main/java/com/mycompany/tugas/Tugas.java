/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Tugas {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int bil1, bil2, bil3;
        int tambah, kurang, kali, bagi;

        System.out.print("Masukkan bilangan pertama : ");
        bil1 = myObj.nextInt();

        System.out.print("Masukkan bilangan kedua : ");
        bil2 = myObj.nextInt();

        System.out.print("Masukkan bilangan ketiga : ");
        bil3 = myObj.nextInt();

        tambah = bil1 + bil2 + bil3;
        kurang = bil1 - bil2 - bil3;
        kali = bil1 * bil2 * bil3;
        bagi = bil1 / bil2 / bil3;

        System.out.println("Hasil Penjumlahan : " + tambah);
        System.out.println("Hasil Pengurangan : " + kurang);
        System.out.println("Hasil Perkalian : " + kali);
        System.out.println("Hasil Pembagian : " + bagi);
    }
}

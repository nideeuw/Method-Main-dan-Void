/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Void {
    //deklarasi variabel
    String nama,tempat,jawab,jawab1;
    String jawaban = "Ya";
    int kaki,makanan,berkembang;
    
    void data (){
        //membuat scanner
        Scanner input = new Scanner (System.in);
        //menginput data
        System.out.println(" ");
        System.out.print("Masukkan nama hewan: ");
        nama = input.nextLine();
        System.out.print("Jumlah kaki: ");
        kaki = input.nextInt();
        System.out.print("Hewan hidup di Darat, Air atau Amfibi? ");
        tempat = input.next();
        System.out.println("Hewan tersebut memakan apa? Pilih dibawah ini");
        System.out.println("1.Tumbuhan");
        System.out.println("2.Daging");
        System.out.println("3.Tumbuhan dan Daging");
        System.out.print("Angka pilihan anda: ");
        makanan = input.nextInt();
        //percabangan yang akan keluar sesuai dengan pilihan user
        if (makanan==1){
            jawab = "Herbivora";
            System.out.println("Hewan tersebut adalah "+jawab);
        }
        else if (makanan==2){
            jawab = "Karnivora";
            System.out.println("Hewan tersebut adalah "+jawab);
        }
        else if (makanan==3){
            jawab = "Omnivora";
            System.out.println("Hewan tersebut adalah "+jawab);
        }else{
            System.out.println("Tidak termasuk dalam pilihan");
        }
        
        System.out.println("Bagaimana hewan tersebut berkembang biak?");
        System.out.println("1. Bertelur");
        System.out.println("2. Melahirkan");
        System.out.println("3. Bertelur dan Melahirkan");
        System.out.print("Angka pilihan anda: ");
        berkembang = input.nextInt();
        //percabangan yang akan keluar sesuai pilihan user
        if (berkembang==1){
            jawab1 = "Ovipar";
            System.out.println("Merupakan hewan "+jawab1);
        }    
        else if (berkembang==2){
            jawab1 = "Vivipar";
            System.out.println("Merupakan hewan "+jawab1);
        }
        else if (berkembang==3){
            jawab1 = "Ovovivipar";
            System.out.println("Merupakan hewan "+jawab1);
        }else{
            System.out.println("Tidak termasuk dalam pilihan");
        }    
    }
    void hasil(){
        //menampilkan hasil dari method void data
        System.out.println(" ");
        System.out.println("===HASIL DATA HEWAN===");
        System.out.println("Nama hewan: "+nama);
        System.out.println("Jumlah kaki: "+kaki);
        System.out.println("Habitat hewan: "+tempat);
        System.out.println("Jenis hewan berdasarkan makanan: "+jawab);
        System.out.println("Jenis hewan berdasarkan cara berkembang biak: "+jawab1);
    }
    void perulangan(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        //menanyakan untuk membuat data ulang atau tidak
        System.out.println("Ingin membuat data hewan kembali? Ya/Tidak?");
        System.out.print("Jawaban anda: ");
        jawaban = input.next();
        //perulangan membuat data jika user menjawab ya
        while (jawaban.equalsIgnoreCase("Ya")){
            data();
            hasil();
            perulangan();
        }
    }
}

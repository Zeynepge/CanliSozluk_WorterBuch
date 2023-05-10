package main.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sozluk {

        public static void main(String[] args) {
            Scanner oku=new Scanner(System.in);
            TreeMap<String,String> sozluk=new TreeMap<>();
            sozluk.put("elma","bir meyva cesididir.");
            sozluk.put("armut","Anadoluda yetisen meyva cesidi");
            int secim;
            do {
                menu();
                secim=oku.nextInt();
                if (secim==1)
                    ekleme(sozluk);
                if(secim==2) {
                    listele(sozluk);
                    duzelt(sozluk);}
                if (secim==3)
                    listele(sozluk);
                if (secim==4)
                    arama(sozluk);
                if (secim==5){
                    listele(sozluk);
                    sil(sozluk);}
            }while (secim!=6);
        }
        public static void menu() {
            System.out.println("\n*** SÖZLÜK ***");
            System.out.println("1- Ekleme");
            System.out.println("2- Düzeltme");
            System.out.println("3- Listeleme");
            System.out.println("4- Arama");
            System.out.println("5- Silme");
            System.out.println("6- Cikis");
            System.out.print("Secimniz : ");
        }
        public static void ekleme(TreeMap<String,String> a){
            Scanner oku_str=new Scanner(System.in);
            String kelime,anlam;
            System.out.print("Kelime : ");
            kelime=oku_str.nextLine();
            System.out.print("Anlami : ");
            anlam=oku_str.nextLine();
            a.put(kelime,anlam);
        }
        public static void listele(TreeMap<String,String> a){
            System.out.println("\nKelime       Anlami        ");
            System.out.println("----------------------------");
            for (Map.Entry<String,String> deger: a.entrySet()) {
                System.out.println(deger.getKey() +" : " + deger.getValue());
            }
        }
        public static void duzelt(TreeMap<String,String> a){
            Scanner oku_str=new Scanner(System.in);
            String kelime,anlam;
            System.out.print("\nHangi kelimenin anlamini degistirmek istiyorsunuz : ");
            kelime=oku_str.nextLine();
            if(a.containsKey(kelime)) {
                System.out.println(kelime+" : "+a.get(kelime));
                System.out.print("Anlami : ");
                anlam=oku_str.nextLine();
                a.put(kelime,anlam);
                System.out.println("\""+kelime+"\" kelimesinin anlami degistirilmistir.");
            }
            else   System.out.println("\""+kelime+"\" "+" bulunamadi!");
        }
        public static void arama(TreeMap<String,String> a){
            Scanner oku_str=new Scanner(System.in);
            String kelime,anlam;
            System.out.print("Aranacak kelime : ");
            kelime=oku_str.nextLine();
            if (a.containsKey(kelime))
                System.out.println(kelime+" : "+a.get(kelime));
            else System.out.println("\""+kelime+"\" "+" bulunamadi!");
        }
        public static void sil(TreeMap<String,String> a){
            Scanner oku_str=new Scanner(System.in);
            String kelime;
            System.out.print("\nSilinecek kelime : ");
            kelime=oku_str.nextLine();
            if(a.containsKey(kelime))
            {
                a.remove(kelime);
                System.out.println("\""+kelime+"\" silinmistir.");
            }
            else System.out.println("\""+kelime+"\" "+" bulunamadi!");
        }
    }

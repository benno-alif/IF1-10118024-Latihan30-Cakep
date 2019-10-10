package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Percabangan ya atau tidak dengan warna
     */

public class Main {

    private static final String RESET = "\u001B[0m";

    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String konfirmasi, kondisi;
        Scanner scanner = new Scanner(System.in);

        System.out.println(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + BLUE + "latihan 30 ini?");
        System.out.print(BLUE + "Jawab " + RED + "(Yoi/Enggak) : ");
        konfirmasi = scanner.nextLine();
        kondisi = konfirmasi.toUpperCase();

        if (kondisi.equals("YOI")) {
            System.out.println(RED + "\nCakep bener. " + PURPLE + "Good Job");
        } else {
            System.out.println("\nTetep cakep sih." + RED);
            System.out.println(CYAN + "Sing penting paham konsep nya ye" + RESET);
            System.out.println("Keep the code works dude");
        }
    }
}

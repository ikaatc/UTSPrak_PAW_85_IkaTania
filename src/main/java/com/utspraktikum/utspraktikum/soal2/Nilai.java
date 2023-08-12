package com.utspraktikum.utspraktikum.soal2;

public class Nilai {
    public static void main(String[] args) {
        int[] nilaiArray = { 83, 70, 55, 90, 0 };

        for (int nilai : nilaiArray) {
            String grade = Grade(nilai);

            System.out.println("Score : " + nilai);
            System.out.println("Grade mahasiswa : " + grade);
            System.out.println("======================");
        }
    }

    public static String Grade(double nilai) {
        String grade = "";

        if (nilai >= 80.00 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 77.50 && nilai <= 79.99) {
            grade = "A-";
        } else if (nilai >= 75.00 && nilai <= 77.49) {
            grade = "AB";
        } else if (nilai >= 72.50 && nilai <= 74.99) {
            grade = "B+";
        } else if (nilai >= 70.00 && nilai <= 72.49) {
            grade = "B";
        } else if (nilai >= 67.50 && nilai <= 69.99) {
            grade = "B-";
        } else if (nilai >= 65.00 && nilai <= 67.49) {
            grade = "BC";
        } else if (nilai >= 62.50 && nilai <= 64.99) {
            grade = "C+";
        } else if (nilai >= 60.00 && nilai <= 62.49) {
            grade = "C";
        } else if (nilai >= 55.00 && nilai <= 59.99) {
            grade = "C-";
        } else if (nilai >= 50.00 && nilai <= 54.99) {
            grade = "CD";
        } else if (nilai >= 45.00 && nilai <= 49.99) {
            grade = "D+";
        } else if (nilai >= 40.00 && nilai <= 44.99) {
            grade = "D";
        } else if (nilai < 40.00) {
            grade = "E";
        }

        return grade;
    }
}

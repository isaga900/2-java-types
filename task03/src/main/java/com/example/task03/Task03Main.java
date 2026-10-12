package com.example.task03;

public class Task03Main {

    public static int getMetreFromCentimetre(int centimetre) {
        return centimetre / 100;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(243);
        System.out.println(result); // Выведет 2

        result = getMetreFromCentimetre(91);
        System.out.println(result); // Выведет 0
    }

}

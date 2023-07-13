package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Berikut adalah Test dasar");

        //1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CountTheSum count = new CountTheSum();
        int result1 = count.calculateSum(numbers);
        System.out.println("hasil dari kalkulasi semua elemen dalam array : " + result1);

        //2
        int input = 102;
        FindElement f = new FindElement();
        int result2 = f.findSpecificElement(input);
        System.out.println("return index specific element : " + result2 + "\n");

        //3
        Occurrences o = new Occurrences();
        o.countOccurences();
    }
}

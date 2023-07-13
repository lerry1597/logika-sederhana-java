package com.example;

public class Occurrences {
    public void countOccurences(){
        int[] arrayInteger = {5, 100, 12, 4, 5, 2, 12, 13};
        boolean[] counted = new boolean[arrayInteger.length];

        for(int i = 0; i < arrayInteger.length; i++) {
            if(counted[i]) {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < arrayInteger.length; j++){
                if(arrayInteger[i] == arrayInteger[j]) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println("Element " + arrayInteger[i] + " occurs " + count + " time(s)");
        }
    }
}

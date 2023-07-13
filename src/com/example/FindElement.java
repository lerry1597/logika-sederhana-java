package com.example;

public class FindElement {
    public int findSpecificElement(int number) {

        int l = 0;
        int[] arrayInteger = {10, 23, 45, 92, 101, 102, 103, 10001};

        for(int i = 0; i < arrayInteger.length; i++){
            if(number == arrayInteger[i]){
                l = i;
            }
        }

        return l;

    }
}

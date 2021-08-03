package com.company.primeNumber;

public class PrimeNumber {
    public int checkPrime(int num){
        int counter =0;
        for (int j = 0 ; j < num ; j++) {
            Boolean flag = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                counter++;
            }
        }
        return counter;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        int i;
        String k = "";

        int j = 800%3;
//        System.out.println(j);

        for (i=1; i<=100; i++){

            k = "";

            if (i%3==0){
                k = "Crackle";
            }
            if(i%5==0){
                k = "Pop";
            }
            if (i%3==0 && i%5==0){
                k = "CracklePop";
            }

            System.out.println(i + k);
        }


	  }
}

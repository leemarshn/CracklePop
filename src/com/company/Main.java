package com.company;

public class Main {

    public static void main(String[] args) {

        int i;
        String k = "";


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
            if (k.equals( "Crackle") || k.equals("Pop") || k.equals("CracklePop")){

                System.out.println(k);

            }else System.out.println(i);

        }


    }
}


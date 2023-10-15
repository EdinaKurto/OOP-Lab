package org.lab02;

public class task9 {
    public static void drawStarsPiramid(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawStarsPiramid(10);
    }
}


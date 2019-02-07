package com.codingblocks.Hackerblocks;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i = 0;
        int m=0;
        while (i <= 2 * n) {
            int j = 0;
            if (i <= n-1) {
                while (j <= n * 2 - i) {
                    int k = n - j;
                    if (j <= n) {
                        if (j >= i) {
                            System.out.print(k + " ");
                        } else {
                            System.out.print("  ");
                        }
                    } else {
                        System.out.print(j - n + " ");
                    }
                    j++;
                }
            } else {

                 if(i>=n){
                while (j<= n + m) {
                    int b=n-j;
                    if(j<=n){
                    if (j <= n-m-1) {
                        System.out.print("  ");
                    } else {
                       System.out.print( b+" ");
                    }
                    }
                    else
                    {
                        System.out.print((-b)+" ");
                    }

                    j++;

                }
              m++;
            }}
                System.out.println();

            i++;



            }
        }
    }


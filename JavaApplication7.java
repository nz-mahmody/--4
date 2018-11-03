/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner b=new Scanner (System.in);
        int a=b.nextInt();
        int s=0;
        for(int i=1;a>i;i++)
        {
            if(a%i==0)
             s+=i;
        }
        if(a==s)
        System.out.print("yes");
        else
        System.out.print("no");
    }
    
}

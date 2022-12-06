/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.Scanner;
import java.math.BigInteger;
public class boi_so_chung_nho_nhat {
    

    public static BigInteger USC(BigInteger a,BigInteger b){
        BigInteger s0=new BigInteger("0");
        while(!(a.multiply(b).equals(s0))){
            if(a.compareTo(b)==1)
                a=a.mod(b);
            else if(b.compareTo(a)==1)
                b=b.mod(a);
            }
        
        return a.add(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger mul=a.multiply(b);
            System.out.println(mul.divide(USC(a, b)));
        }
    }
}


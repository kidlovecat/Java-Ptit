/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.math.BigInteger;
import java.util.*;
public class chia_het {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
        
            if(a.remainder(b) == BigInteger.valueOf(0) || b.remainder(a) == BigInteger.valueOf(0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

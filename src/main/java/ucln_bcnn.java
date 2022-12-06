/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.Scanner;

public class ucln_bcnn {
    
     public static long USCLN(long a, long b) {
        long temp1 = a;
        long temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        long uscln = temp1;
        return uscln;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print((a*b)/USCLN(a,b) + " ");
            System.out.println(USCLN(a, b));
            
            t--;
        }
    }
}

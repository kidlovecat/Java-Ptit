
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class uoc_so_nguyen_lon_nhat {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
           long n = sc.nextLong();
           long res = n;
           while(n%2==0){
               n/=2;
               res=2;
           }
           for(int j=3;j<=Math.sqrt(n);j+=2){
               while(n%j==0){
                   n/=j;
                   res=j;
               }
           }
           if(n!=1) res=n;
           System.out.println(n);
            t--;
        }
//        System.out.print(sum);
    }
}

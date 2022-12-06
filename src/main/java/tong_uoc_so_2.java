
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class tong_uoc_so_2 {
    public static int[] ar =new int[2000001];
    public static int check(int n){
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i; 
                sum += (n/i);
            }
        }
        if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) sum -= Math.sqrt(n);
        if(sum > n) return 1;
        else return 0;
    }
    public static void main(String[] args) {
 
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a;i<=b;i++){
            
            if(check(i) == 1) cnt++;
        }
        System.out.println(cnt);
    }
}

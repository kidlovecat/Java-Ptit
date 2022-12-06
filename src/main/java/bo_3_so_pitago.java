/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class bo_3_so_pitago {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long[] a = new long[n+1];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a,0,n);
//            for(int i = 0; i< n;i++){
//                System.out.print(a[i]+ " ");
//            }
            int x =0,y=n-2,z=n-1;
            int check=0;
            while(z >= 2){
                if(a[x]*a[x]+a[y]*a[y]>a[z]*a[z]) y--;
                else if(a[x]*a[x]+a[y]*a[y]<a[z]*a[z]) x++;
                else{
                    check=1;
                    break;
                }
                if(x==y){
                    x=0;
                    z--;
                    y=z-1;
                }
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

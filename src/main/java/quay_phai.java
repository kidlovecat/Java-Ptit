/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class quay_phai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
//            for(int i = 0; i < n; i++) System.out.print(a[i]+" ");
            int min = (int)Collections.min(Arrays.asList(a));
//            System.out.println(min);
            int index1 = 0;
            for(int i = 0; i < n; i++){
                if(a[i] == min) {
                    index1 = i; break;
                }
            }
//            Arrays.sort(a,0,n);
//            int index2 = Arrays.binarySearch(a, min);
//            if(index - min == )
            System.out.println(index1);
            t--;
        }
    }
}

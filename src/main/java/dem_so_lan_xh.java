/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class dem_so_lan_xh {
    public static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();
  
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i])) 
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } 
            else
            {                                                                 
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for(int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){
                System.out.print(arr[i] + " xuat hien " + mp.get(arr[i]) +" lan"+"\n");
                mp.remove(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int id = 1; id <= t; id++){
            int n = sc.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            int[] a = new int[100];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + id + ":");
             countFreq(a, n);
            
        }
    }
}
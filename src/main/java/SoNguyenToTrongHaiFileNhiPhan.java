/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
import java.io.*;
public class SoNguyenToTrongHaiFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int N = 9999;
        boolean[] check = new boolean[N + 1];
        
        for (int i = 2; i <= N; i++) {
          check[i] = true;
        }

        for (int i = 2; i <= N; i++) {
          if (check[i] == true) {
            for (int j = 2 * i; j <= N; j += i) {
              check[j] = false;
            }
          }
        }
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) sc.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls2 = (ArrayList<Integer>) sc2.readObject();
        int a[] = new int[10000];
        int b1[] = new int[10000];
        int b2[] = new int[10000];
        Collections.sort(ls1);
        for(Integer i:ls1){
            b1[i]++;  
        }
        for(Integer i:ls2){
            b2[i]++;  
        }
        for(Integer i:ls1){
            if(check[i] && b1[i] > 0 && b2[i] > 0 && a[i]==0){
                System.out.println(i+" "+b1[i]+" "+b2[i]);
                a[i]++;
            }
        }
    }
}


import java.io.FileInputStream;
import java.io.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class CapSoNguyenToTrongFile1 {
    public static boolean isPrime(Integer n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int N = 999999;
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
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls2 = (ArrayList<Integer>) sc2.readObject();
        int a[] = new int[1000000];
        int b[] = new int[1000000];
        Collections.sort(ls1);
        for(Integer i:ls2){
            
                b[i]++;
            
        }
        for(Integer i:ls1){
           
                if(i < 1000000-i && check[i] && check[1000000-i] && a[i] == 0 && b[1000000-i]>0){
                    a[i]++;
                    System.out.println(i + " " + (1000000-i));
                }
            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.*;
import java.util.*;
public class SoNguyenToLonNhatTrongFile {
    public static boolean isPrime(Integer n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ls = (ArrayList<Integer>) sc.readObject();
        int a[] = new int[1000000];
        for(Integer i:ls){
            if(isPrime(i)){
                a[i]++;
            }
        }
        Collections.sort(ls);
        int cnt = 0;
        for(int i = 999999; i >= 0 ; i--){
            if(a[i] > 0 && cnt < 10){
                System.out.println(i+" "+a[i]);
                cnt++;
            }
        }
    }
}

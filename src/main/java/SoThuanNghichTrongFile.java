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
public class SoThuanNghichTrongFile {
    public static boolean checkTn(Integer n){
        String tmp = String.valueOf(n);
        if(tmp.length() %2 ==0 || tmp.length() == 1) return false;
        for(int i = 0; i <= tmp.length()/2; i++){
            if(tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)) return false;
        }
        while(n > 0){
            if((n%10)%2 == 0) return false;
            n/=10;
        }
      
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls2 = (ArrayList<Integer>) sc2.readObject();
        int a[] = new int[1000000];
        int b1[] = new int[1000000];
        int b2[] = new int[1000000];
        Collections.sort(ls1);
        for(Integer i:ls1){
            b1[i]++;  
        }
        for(Integer i:ls2){
            b2[i]++;  
        }
        int cnt = 0;
        for(Integer i: ls1){
            if(checkTn(i) && b1[i] > 0 && b2[i] > 0 && cnt < 10 && a[i]==0){
                a[i]++;
                System.out.println(i + " " + (b1[i]+b2[i]));
                cnt++;
            }
        }
    }
}

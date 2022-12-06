
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MATRIX.in");
        Scanner sc =  new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] tmp = s1.split(" ");
            int n = Integer.parseInt(tmp[0]);
            int m = Integer.parseInt(tmp[1]);
            int k = Integer.parseInt(tmp[2]);
            int[][] a = new int[n][m];
            String[] arr = s2.split(" ");
            int c = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = Integer.parseInt(arr[c++]);
                }
            }
            ArrayList<Integer> b = new ArrayList<>();

            for(int j = 0; j < n; j++ ){
                b.add(a[j][k-1]);
            }
        //        for(int x:b){
        //            System.out.print(x+" ");
        //        }
        //        System.out.println();
            Collections.sort(b);
            int id = 0;
            for(int x: b){  
                a[id++][k-1] = x;      
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrabuoi1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class MaTranVuong {
    private int[][] a;
    private int n;
    public MaTranVuong(){
    }
    public void Nhap(Scanner sc, int n){ 
        this.n = n;
        int[][] tmp = new int[100][100];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                tmp[i][j] = sc.nextInt();
            }
        }
        this.a = tmp;
    }
    public int getLength(){
        return n;
    }
    public int[][] Cong(MaTranVuong x){
        int[][] c = new int[100][100];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                c[i][j] = this.a[i][j] + x.a[i][j];
            }
        }
        return c;
    }
}

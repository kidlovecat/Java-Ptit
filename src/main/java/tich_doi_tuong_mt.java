/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class Matrix{
    private int n,m;
    private int[][] mt;
    public Matrix(int n,int m){
        this.n = n;
        this.m = m;
        this.mt = new int[n][m];
    }
    public int getN() {
        return n;
    }
    public int getM(){
        return m;
    }
    public Matrix nextMatrix(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) mt[i][j] = sc.nextInt();
        }
        return new Matrix(n,m);
    }
    public int getV(int i, int j){
        return mt[i][j];
    }
    public void setV(int i, int j, int v){
        this.mt[i][j] = v;
    }
    public Matrix mul(Matrix b){
        Matrix c = new Matrix(n,b.getM());
        for(int i = 0; i < n; i++){
            for(int j = 0; j < b.getM(); j++){
                int sum = 0;
                for(int k = 0; k < m; k++){
                    sum += mt[i][k]*b.getV(k, j);
                }
                c.setV(i,j,sum);
            }
        }
        return c;
    }
    @Override
    public String toString(){
        for(int i = 0; i < n; i++){
            String res = "";
            for(int j = 0 ; j < m; j++){
                res = res +" "+ String.valueOf(getV(i,j));
            }
            System.out.println(res);
        }
        return "";
    }
}
public class tich_doi_tuong_mt {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

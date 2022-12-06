/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class matranvuong {
    private int n,m;
    private int[][] matrixs;
    private int[][] cv;
    public matranvuong(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrixs=new int[n][m];
    }

    public matranvuong() {
    }
    
    public matranvuong(int[][] matrixs) {
        this.n=matrixs.length;
        this.n=matrixs[0].length;
        this.matrixs = matrixs;
    }
    
    public void nhap(Scanner sc){
        this.n=sc.nextInt();
        this.m=sc.nextInt();
        int [][] arr=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        this.matrixs=arr;
    }
    public void MaTranChuyenVi(){
        int [][] c=new int [m][n];
        for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    c[j][i]=matrixs[i][j];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public int nMAxTong(){
        int sum=0;
        int hang=0;
        for(int i=0;i<n;i++){
            int sum1=0;
            for(int j=0;j<m;j++){
                sum1+=this.matrixs[i][j];
            }
            if(sum1>sum){
                hang=i;
            }
        }
        return hang;
    }
    public int mMAxTong(){
         int sum=0;
        int hang=0;
        for(int i=0;i<m;i++){
            int sum1=0;
            for(int j=0;j<n;j++){
                sum1+=this.cv[i][j];
            }
            if(sum1>sum){
                hang=i;
            }
        }
        return hang;
    }
    public String amx(){
        int [][] c=new int [m][n];
        for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    c[j][i]=matrixs[i][j];
        this.cv=c;
        int max=Math.max(nMAxTong(), mMAxTong());
        if(max==n&&max==m)
             return (n+" "+m);
        else return String.valueOf(max);
    }
}
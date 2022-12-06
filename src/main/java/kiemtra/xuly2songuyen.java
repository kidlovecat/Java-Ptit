/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

/**
 *
 * @author ASUS2020
 */
import java.util.Scanner;
public class xuly2songuyen {
    private int n,m;

    public xuly2songuyen() {
        
    }

    public xuly2songuyen(int n, int m) {
        this.n = n;
        this.m = m;
    }
    
    public void Nhap(Scanner sc){
        int x=sc.nextInt();
        this.n = x;
        int y=sc.nextInt();
        this.m = y;
    }
    
    public void SNT(){
        for(int i=n;i<=m;i++){
            boolean ok=true;
            if(i<2) ok=false;
            if(ok)
                for(int j=2;j<=(int)Math.sqrt(i)+1;j++)
                    if(i%j==0){
                        ok=false;
                        break;
                    }
            if(ok)
                System.out.println(i+" ");
        }
        System.out.println("");
    }

    public int getM() {
        return m;
    }
    
    public int UCLN() {
        int a=n,b=m;
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    
    public int BCNN() {
        return (n*m)/UCLN();
    }
}
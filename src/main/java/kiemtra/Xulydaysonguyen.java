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

public class Xulydaysonguyen {
    private int[] a;

    public Xulydaysonguyen(int[] a) {
        this.a = a;
    }

    public Xulydaysonguyen() {
    }
    public void dayso(int[] a) {
        this.a = a;
    }
    public void nhap(Scanner sc){
        int so=sc.nextInt();
        int [] arr=new int[so];
        for(int i=0;i<so;i++){
            arr[i]=sc.nextInt();
        }
        this.a=arr;
    }
    public int getmax(){
        int max1=0;
        for(int i=0;i<a.length;i++){
            max1=Math.max(max1,a[i]);
        }
        return max1;
    }
        public int getmin(){
        int min1=999999999;
        for(int i=0;i<a.length;i++){
            min1=Math.min(min1,a[i]);
        }
        return min1;
    }
        
        public void SoLanXuatHien(){
            boolean[] b = new boolean[a.length];
            for(int i=0;i<a.length;i++){
                b[i]= false;
            }
            for(int i=0;i<a.length;i++){
                if(b[i]==false){
                    int count =1;
                    b[i]=true;
                    for(int j=i+1;j<a.length;j++){
                        if(a[i]==a[j]){
                            b[j]=true;
                            count++;
                        }
                    }
                    System.out.println(a[i]+" xuat hien " + count + " lan");
                }
            }
        }  
     }

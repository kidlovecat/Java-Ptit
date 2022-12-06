/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.File;
import java.io.IOException;
import java.util.*;

class IntSet{
    private int[] a;
    public IntSet(int[] a){
        this.a = a;
    }
    public int[] getArr(){
        return a;
    }
    public IntSet union(IntSet arr){
        Set<Integer> s =  new TreeSet<>();
        for(int x: a){
            s.add(x);
        }
        for(int x: arr.getArr()){
            s.add(x);
        }
        int[] res=new int[s.size()];
        int i=0;
        for(int x:s){
            res[i++]=x;
        }
        return new IntSet(res);
        
    }
    public IntSet intersection(IntSet arr){
        Set<Integer> s =  new TreeSet<>();
        for(int x:a){
            for(int i:arr.getArr()){
                if(x==i){
                    s.add(i);
                    break;
                }
            }
        }
        int[] res=new int[s.size()];
        int i=0;
        for(int x:s){
            res[i++]=x;
        }
        return new IntSet(res);
    }
    @Override
    public String toString(){
        String s="";
        for(int x:a)
            s+=String.valueOf(x)+" ";
        return s;
    }
}
public class lop_insert {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

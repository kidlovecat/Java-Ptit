/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class Giao_2_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> A=new TreeSet<Integer>();
            Set<Integer> B=new TreeSet<Integer>();
            for(int j=0;j<n;j++){
                A.add(sc.nextInt());
            }
            for(int i=0;i<m;i++){
                int x= sc.nextInt();
                if(A.contains(x))
                    B.add(x);
            }
        Iterator<Integer>it=B.iterator();
            while(it.hasNext())
                System.out.print(it.next() + " ");
    }
}

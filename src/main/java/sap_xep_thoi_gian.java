/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class Time{
    private int h,m,s;
    public Time(int h,int m, int s){
        this.h = h;
        this.s = s;
        this.m = m;
    }
    public int getH(){
        return h;
    }
    public int getM(){
        return m;
    }
    public int getS(){
        return s;
    }
    @Override
    public String toString() {
        return h + " " + m + " " +s; 
    }
}
public class sap_xep_thoi_gian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new Time(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(ls, Comparator.comparingInt(Time::getH).thenComparingInt(Time::getM).thenComparingInt(Time::getS));
        for(Time x: ls){
            System.out.println(x);
        }
    }
}

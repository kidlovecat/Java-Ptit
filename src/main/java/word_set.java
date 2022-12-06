/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class WordSet{
    private String s;
    public WordSet(String s){
        this.s = s;
    }
    public String getS(){
        return s;
    }
    public String union(WordSet s2){
        Set<String> s = new TreeSet<>();
        String[] arr1 = s2.getS().split(" ");
        String[] arr2 = this.s.split(" ");
        for(String x:arr1){
            s.add(x.toLowerCase());
        }
        for(String x:arr2){
            s.add(x.toLowerCase());
        }
        String res = "";
        for(String x: s){
            res = res+" " + x;
        }
        return res;
    }
    public String intersection(WordSet s2){
        Set<String> s = new TreeSet<>();
        String[] arr1 = s2.getS().split(" ");
        String[] arr2 = this.s.split(" ");
        for(String x:arr1){
            for(String i:arr2){
                if(x.toLowerCase().compareTo(i.toLowerCase()) == 0){
                    s.add(i.toLowerCase());
                    break;
                }
            }
        }
        
        String res = "";
        for(String x: s){
            res = res+" " + x;
        }
        return res;
    }
}
public class word_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

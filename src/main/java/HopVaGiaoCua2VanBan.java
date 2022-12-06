/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
class WordSet{
    private ArrayList<String> word = new ArrayList<>();
    public WordSet(String s) throws FileNotFoundException {
        String[] tmp = s.trim().split("\\s+");
        for(String x:tmp){
            word.add(x);
        }
    }
    
    public String intersection(WordSet s){
        Set<String> A = new TreeSet<>();
        Set<String> B = new TreeSet<>();
        A.addAll(this.word);
        for(String x:s.word){
            if(A.contains(x)){
                B.add(x);
            }
        }
        String res="";
        for(String x:B){
            res=res+x+" ";
        }
        return res;
    }
    public String union(WordSet s){
        Set<String> A = new TreeSet<>();
        
        A.addAll(this.word);
        A.addAll(s.word);
        
        String res="";
        for(String x:A){
            res=res+x+" ";
        }
        return res;
    }
}
public class HopVaGiaoCua2VanBan {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main1294151(String[] args) throws IOException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

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
import java.util.*;
class sv{
    private String ten;
    private int n,m;

    public sv(String ten, int n, int m) {
        this.ten = ten;
        this.n = n;
        this.m = m;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    @Override
    public String toString(){
        return ten+" "+n+" "+m;
    }
          
}
public class luyentaplaptrinh {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("LUYENTAP.in");
        Scanner sc = new Scanner(f);
        ArrayList<sv> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ten = sc.nextLine();
            String line = sc.nextLine();
            String[] token = line.split("\\s+");
            int n = Integer.parseInt(token[0]);
            int m = Integer.parseInt(token[1]);
            ls.add(new sv(ten,n,m));
        }
        ls.sort(Comparator.comparing(sv::getN).reversed().thenComparing(sv::getM).thenComparing(sv::getTen));
        for(sv x: ls){
            System.out.println(x);
        }
        sc.close();
    }
}

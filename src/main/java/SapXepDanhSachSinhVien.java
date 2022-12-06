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
class Sv{
    private String ma,ten,sdt,mail,ho,tendem,fullten;
    public Sv(String ma,String ten,String sdt, String mail){
        this.ma =  ma; 
        String[] tokens = ten.split(" ");
        this.ten = tokens[tokens.length-1];
        this.ho = tokens[0];
        String res = "";
        for(int i = 1; i < tokens.length-1; i++){
            res = res + tokens[i] + " ";
        }
        this.tendem = res;
        this.sdt = sdt;
        this.mail = mail;
        this.fullten = ten;
    }
    public String getHo(){
        return ho;
    }
    public String getTD(){
        return tendem;
    }
    public String getTen(){
        return ten;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma +" "+ fullten +" "+sdt+" "+mail;
    }
}
public class SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sv> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new Sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls, Comparator.comparing(Sv::getTen).thenComparing(Sv::getHo).thenComparing(Sv::getTD).thenComparing(Sv::getMa));
        for(Sv x: ls) System.out.println(x);
    }
}

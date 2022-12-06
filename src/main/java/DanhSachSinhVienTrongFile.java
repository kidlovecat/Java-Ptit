
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
class sv{
    private String name,cls,birth;
    private double gpa;
    private String id;
    public sv(int id,String a,String b,String c, double d){
        this.name = a;
        this.cls = b;
        this.id = "B20DCCN" + String.format("%03d", id);
        this.birth = c;
        this.gpa = d;
    }
      public void setBirth(){
        if(birth.charAt(1) == '/') this.birth = "0" + birth;
        if(birth.charAt(4) == '/') this.birth = birth.substring(0,3) + "0" + birth.substring(3);
    }
    @Override
    public String toString(){
        setBirth();
        return id + " " +name + " " + cls + " " + birth + " " + String.format("%.2f",gpa);
    }
}
//public class DanhSachSinhVienTrongFile {
//    public static void main(String[] args) throws FileNotFoundException{
//        File f = new File("SV.in");
//        Scanner sc = new Scanner(f);
//        int t = Integer.parseInt(sc.nextLine());
//        ArrayList<sv> ls = new ArrayList<>();
//        for(int i = 1; i <= t; i++){
//            ls.add(new sv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
//        }
//        for(sv x: ls){
//            System.out.println(x);
//        }
//        sc.close();
//    }
//}

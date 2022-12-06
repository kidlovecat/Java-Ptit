/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class sv{
    private String ma,ten,lop,mail;

    public sv(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getLop() {
        return lop;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
}
public class liet_ke_sv_theo_lop {
  
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<sv>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sv v=new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(v);
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine().toLowerCase();
            String res;
            if(s.equals("ke toan")) res="DCKT";
            else if(s.equals("cong nghe thong tin")) res="DCCN";
            else if(s.equals("an toan thong tin")) res="DCAT";
            else if(s.equals("vien thong")) res="DCVT";
            else res="DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH "+ s.toUpperCase() +":");
            for(sv x:a){
                if(x.getMa().contains(res)){
                    if((res.equals("DCCN")||res.equals("DCAT"))){
                        if(x.getLop().charAt(0)!='E')
                            System.out.println(x);
                    }
                    else
                        System.out.println(x);
                }
            }
        }
    }
}

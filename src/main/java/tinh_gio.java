/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class time{
    private int gvao,pvao,gra,pra;
    private String ten,ma;
    public time(String ma,String ten,int gvao,int pvao,int gra,int pra){
        this.gvao = gvao;
        this.pvao = pvao;
        this.gra = gra;
        this.pra = pra;
        this.ma = ma;
        this.ten = ten;
    }
    public int gchoi(){
        if(pvao > pra) return gra-1-gvao;
        return gra-gvao;
    }
    public int pchoi(){
        if(pvao > pra) return 60 - Math.abs(pvao - pra);
        return Math.abs(pvao - pra);
    }
    @Override
    public String toString(){
        return ma + " " + ten +" "+gchoi()+" "+"gio "+pchoi()+" phut";
    }
}
public class tinh_gio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<time> ls = new ArrayList<>();
        while(t-- > 0){
            String m = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine(); int gvao = Integer.parseInt(vao.substring(0,2)); int pvao = Integer.parseInt(vao.substring(3));
            String ra = sc.nextLine(); int gra = Integer.parseInt(ra.substring(0,2)); int pra = Integer.parseInt(ra.substring(3));
            time a = new time(m,ten,gvao,pvao,gra,pra);
            ls.add(a);
            
        }
        Collections.sort(ls,Comparator.comparingInt(time::gchoi).thenComparingInt(time::pchoi).reversed());
        for(time x: ls) System.out.println(x);
    }
}

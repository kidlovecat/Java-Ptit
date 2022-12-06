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
class Kh{
    private String ma,ten,loai;
    private long dau,cuoi,vat;
    public Kh(int i,String ten,String s){
        ten = ten.trim().toLowerCase();
        String[] token = ten.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.ten = res;
        this.ma = "KH"+String.format("%02d",i);
        String[] token2 = s.split(" ");
        this.dau = Long.parseLong(token2[1]);
        this.cuoi = Long.parseLong(token2[2]);
        this.loai = token2[0];
    }
    public long getTienTrongDM(){
        if(loai.equals("A")){
            if(cuoi - dau <= 100){
                return (cuoi - dau)*450;
            }
            else return 100*450;
        }
        else if(loai.equals("B")){
            if(cuoi - dau <= 500){
                return (cuoi - dau)*450;
            }
            else return 500*450;
        }
        else{
            if(cuoi - dau <= 200){
                return (cuoi - dau)*450;
            }
            else return 200*450;
        }
    }
    public long getTienVuotDM(){
        if(loai.equals("A")){
            if(cuoi - dau <= 100){
                this.vat = 0;
                return 0;
            }
            else {
                this.vat = (cuoi-dau-100)*1000*5/100;
                return (cuoi-dau-100)*1000;
            }
        }
        else if(loai.equals("B")){
            if(cuoi - dau <= 500){
                this.vat = 0;
                return 0;
            }
            else {
                this.vat = (cuoi-dau-500)*1000*5/100;
                return (cuoi-dau-500)*1000;
            }
        }
        else{
            if(cuoi - dau <= 200){
                this.vat = 0;
                return 0;
            }
            else {
                this.vat = (cuoi-dau-200)*1000*5/100;
                return (cuoi-dau-200)*1000;
            }
        }
        
    }
    public long getSum(){
        return getTienTrongDM()+getTienVuotDM()+vat;
    }
    @Override 
    public String toString(){
        return ma+" "+ten+getTienTrongDM()+" "+getTienVuotDM()+" "+vat+" "+getSum();
    }
}
public class TInhTienDien {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("KHACHHANG.in");
        Scanner sc  =new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Kh> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new Kh(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(Kh::getSum).reversed());
        for(Kh x:ls) System.out.println(x);
    }
}

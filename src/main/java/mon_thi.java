/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.File;
import java.io.IOException;
import java.util.*;
class MonThi{
    private String maMon, tenMon, hThuc;
    public MonThi(String a,String b, String c){
        this.maMon = a;
        this.tenMon = b;
        this.hThuc = c;
    }
    public String getMa(){
        return maMon;
    }
    public String getTen(){
        return tenMon;
    }
     @Override
    public String toString() {
        return maMon+" "+tenMon+" "+hThuc;
    }
}
public class mon_thi {
    
    public static void main(String[] args) throws IOException{

        File file=new File("MONHOC.in");
        Scanner sc=new Scanner(file);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MonThi>list=new ArrayList<>();
        while(sc.hasNextLine()){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int check = 0;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getTen().equals(ten)){
                    check = 1;
                    break;
                }
            }
            if(check ==0) list.add(new MonThi(ma,ten,sc.nextLine()));
            
        }
        Collections.sort(list, Comparator.comparing(MonThi::getMa));
        for(MonThi x:list){
            System.out.println(x);
        }
        sc.close();
        
        
    }
}

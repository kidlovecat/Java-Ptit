/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class xulixau {
    private String s;
    public void Nhap(String s){
        this.s = s;
    }
    public int SoTu(){
        String tmp = this.s.trim().toLowerCase();
        String[] tokens = tmp.split("\\s+");
        return tokens.length;
    }
    public void ChuanHoa(){
            String tmp = this.s.trim().toLowerCase();
            String[] token = tmp.split("\\s+");
            String res="";
            for(String x:token){
                res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
            }
            System.out.println(res);
    }
}

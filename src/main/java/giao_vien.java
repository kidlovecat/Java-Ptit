/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class giao_vien {
    private String Position;
    private String Name;
    private int bSalary;
    public giao_vien(String Position, String Name,int bSalary){
        this.Position = Position;
        this.Name = Name;
        this.bSalary = bSalary;
    }
    public String getPosition(String Position){
        return Position.substring(0,2);
    }
    public String getCode(){
        return Position;
    }
    public String getName(){
        return Name;
    }
    public int getCoe(){
        return Integer.parseInt(Position.substring(2));
    }
    public int getAllowance(String pos){
//        System.out.print(" "+pos+" ");
        if(pos.compareTo("HT") == 0) return 2000000;
        else if(pos.compareTo("HP") == 0) return 900000;
        else return 500000;
    }
    public int getSalary(int coe,String pos,int sal){
//        System.out.print(" "+pos+" ");
        if(pos.compareTo("HT") == 0) return coe*sal+2000000;
        else if(pos.compareTo("HP") == 0) return coe*sal+900000;
        else return coe*sal+500000;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String name = sc.nextLine();
        int sal = sc.nextInt();
        giao_vien a = new giao_vien(code,name,sal);
        System.out.print(a.getCode()+" "+a.getName()+" "+a.getCoe()+" "+a.getAllowance(a.getPosition(code))+" "+a.getSalary(a.getCoe(),a.getPosition(code),sal));
    }
}

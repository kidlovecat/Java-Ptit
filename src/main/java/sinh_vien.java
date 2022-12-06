/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class sinh_vien {

    private final String name;
    private final String id;
    private String birth;
    private float gpa;
    public sinh_vien(String name,String id, String birth,float gpa){
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getBirth(){
        return birth;
    }
    public Float getGpa(){
        return gpa;
    }
    public void setBirth(){
        if(birth.charAt(1) == '/') this.birth = "0" + birth;
        if(birth.charAt(4) == '/') this.birth = birth.substring(0,3) + "0" + birth.substring(3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sinh_vien a = new sinh_vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat());
        a.setBirth();
        System.out.print("B20DCCN001"+" " + a.getName() +" "+ a.getId() +" " +a.getBirth()+" ");
        System.out.format("%.2f",a.getGpa());
    }
}

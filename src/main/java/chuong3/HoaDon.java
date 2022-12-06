/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class HoaDon {
    private String ma,ngay,hoten;
    private double tien;

    public HoaDon(String ma, String ngay, String hoten, double tien) {
        this.ma = ma;
        this.ngay = ngay;
        this.hoten = hoten;
        this.tien = tien;
    }

 
    public String getMa() {
        return ma;
    }


    public void setMa(String ma) {
        this.ma = ma;
    }

 
    public String getNgay() {
        return ngay;
    }

  
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

 
    public String getHoten() {
        return hoten;
    }


    public void setHoten(String hoten) {
        this.hoten = hoten;
    }


    public double getTien() {
        return tien;
    }

 
    public void setTien(double tien) {
        this.tien = tien;
    }
    @Override
    public String toString(){
        return ma+" "+ngay+" "+hoten+" "+tien;
    }
}

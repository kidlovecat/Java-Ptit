/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class bai_toan_lop3 {
    public static String s,str;
    public static boolean check;
    
    public void in(){
        
    }
    public static boolean Solve(){
        int a=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');
	int b=(str.charAt(5)-'0')*10+(str.charAt(6)-'0');
	int c=(str.charAt(10)-'0')*10+(str.charAt(11)-'0');
	char x=str.charAt(3);
        if(a<10||b<10||c<10) return false;
            if(x=='+') 
                if(a+b==c) return true;
            if(x=='-') 
                if(a-b==c) return true;
            if(x=='*') 
            if(a*b==c) return true;
                if(x=='/'&&b!=0&&a%b==0) 
            if(a/b==c) return true;
        return false;
    }
    public static void Try(int i){
        if(check) return;
        if(i==3){  
            if(str.charAt(i)=='?'){              
                str = str.substring(0,i)+"+"+str.substring(i+1);
                Try(i+1);
                str = str.substring(0,i)+"-"+str.substring(i+1);
                Try(i+1);
                str = str.substring(0,i)+"*"+str.substring(i+1);
                Try(i+1);
                str = str.substring(0,i)+"/"+str.substring(i+1);
                Try(i+1);
                str = str.substring(0,i)+"?"+str.substring(i+1);
            }
            else Try(i+1);
        }
        else {
            if(i==11 && str.charAt(i)!='?'){
                if(Solve()){
                    check=true;
                    s=str;
                }
            }
            else if(str.charAt(i)=='?'){
                for(int j='0';j<='9';j++){
                    str = str.substring(0,i)+String.valueOf((char)j)+str.substring(i+1);
                    Try(i+1);
                    str = str.substring(0,i)+"?"+str.substring(i+1);
                }
            }
            else Try(i+1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            s = "WRONG PROBLEM";
            str = sc.nextLine();
            check = false;
            Try(0);
            System.out.println(s);
        }
        
    }
}

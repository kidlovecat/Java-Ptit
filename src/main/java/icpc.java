/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */

import java.util.*;

public class icpc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String test = sc.nextLine();
        String[] token = test.split(" ");
        String s = sc.nextLine();
        int t = Integer.parseInt(token[1]);
        while(t-- > 0){
            int a = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            if(a == 1){      
               int tmp = r-l;
                String res = "";
                res= s.substring(0,l-1);
                while(tmp-- >= 0){
                    res= res+ String.valueOf(b);
//                    
                }
                s=res+s.substring(r);
                
            
            }
            else{
                int check = 1;
                String tmp = s.substring(0,b);
                for(int i = b; i < s.length()-b; i+=b){
                    if(!s.substring(i,i+b).equals(tmp) ){
                        check = 0;
                        break;
                    }
                }
                if(check == 1) System.out.println("YES");
                else System.out.println("NO");
            }
            
        }
    }
}

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
public class dathuc {
    private String s;
    public dathuc(){ 
    }
    public void Nhap(String s){
        this.s = s;
    }
     static long derivativeTerm(String pTerm, long val){
 
    String coeffStr = "";
    int i;
    for (i = 0; pTerm.charAt(i) != 'x' ; i++){
      if(pTerm.charAt(i)==' ')
        continue;
      coeffStr += (pTerm.charAt(i));
    }
 
    long coeff = Long.parseLong(coeffStr);
 
    
    String powStr = ""; 
    for (i = i + 2; i != pTerm.length() && pTerm.charAt(i) != ' '; i++)
    {
      powStr += pTerm.charAt(i);
    }
 
    long power=Long.parseLong(powStr);
 
   
    return coeff * power * (long)Math.pow(val, power - 1);
  }
  static long derivativeVal(String poly, int val)
  {
    long ans = 0;
 
    int i = 0;
    String[] stSplit = poly.split("\\+");
    while(i<stSplit.length)
    {
      ans = (ans +derivativeTerm(stSplit[i], 1));
      i++;
    }
      System.out.println(ans);
    return ans;
  }

}

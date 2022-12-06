/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class thu_gon_day_so {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        boolean ok=true;
        while(ok){
            ok=false;
            int x=0;
            for(int i=0;i<ls.size()-1;i++){
                if(i+1<=ls.size()-1-x){
                    if((ls.get(i)+ls.get(i+1))%2==0){
                    ok=true;
                    x+=2;
                    ls.remove(i);
                    ls.remove(i);
                    }
                }
            }
            if(ok==false)   break;
        }
        System.out.println(ls.size());
    }
}

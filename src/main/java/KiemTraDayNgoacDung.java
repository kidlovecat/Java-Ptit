/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class KiemTraDayNgoacDung {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int check = 0;
            String s = sc.nextLine();
            Stack st = new Stack();
            for(int i = 0; i < s.length(); i++){
                if(st.empty()){
                    if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                        st.push(s.charAt(i));	
                    }
                    else{
                        check=1;
                        break;
                    }
                }
                else{
                    if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                        st.push(s.charAt(i));
                    }
                    else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                        if(s.charAt(i)==')' && (char)st.peek()=='(' || s.charAt(i)==']' &&(char) st.peek()=='[' || s.charAt(i)=='}' && (char)st.peek()=='{'){
                            st.pop();
                        }
                        else{
                            check=1;
                            break;
                        }
                    }
                }    
            }
            if(check==1 || !st.empty()) System.out.println("NO");
            else{
                if(st.empty()) System.out.println("YES");
        }
        
        }
    }
}

import java.util.*;
public class rut_bo_xau_ki_tu {
   
   
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == (char)st.peek()) st.pop();
                else st.push(s.charAt(i));
            }
        }
        String res = "";
        while(st.empty() == false){
            res = st.peek() + res;
            st.pop();
        }
        if(res.length() != 0) System.out.println(res);
        else System.out.println("Empty String");
    }
}
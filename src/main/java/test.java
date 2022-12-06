import java.util.*;


public class test{
	public static void main(String[] args) {
            String reg = "^[0-9]{1,2}/$";
            Scanner sc = new Scanner(System.in);
            while(true){
                String s = sc.nextLine();
                if(s.matches(reg)){
                    System.out.println("ok");
                    break;
                }else{
                    continue;
                } 
            }
	}
}
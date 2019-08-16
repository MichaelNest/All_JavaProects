
package simplegame;

import java.util.Scanner;


public class InputNum {
    
    public String getInputNum(String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        return num; 
    }
    
}

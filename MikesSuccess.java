/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AMCAT;

/**
 *
 * @author saiteja21
 */
public class MikesSuccess {
    public static void checkSuccess(String check[]){
        boolean flag=true;
        for (String check1 : check) {
            for (int j = 0; j < check1.length()-2; j++) {
                if (check1.charAt(j) != check1.charAt(j+2)) {
                    flag=false;
                }
            }
            if(flag){
                System.out.println("YES");
            }else
                System.out.println("NO");  
        }
    }          // ababab 
               // 012345
}

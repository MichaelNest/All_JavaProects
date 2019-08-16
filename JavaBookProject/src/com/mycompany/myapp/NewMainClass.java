
package com.mycompany.myapp;


public class NewMainClass {

   
    public static void main(String[] args) {
      //  GuessGame g1 = new GuessGame();
       // g1.startGame();
       
       Echo e1 = new Echo();
       Echo e2 = new Echo();
       
       int x = 0;
       
       while(x<4){
           e1.hello();
           e1.cont = e1.cont + 1;
                   
           if(x == 3){
               e2.cont = e2.cont + 1;
           }  
           if(x>0){
               e2.cont = e2.cont = e1.cont;
           }
           x++;
       }
       System.out.println(e2.cont);
    }
    
}



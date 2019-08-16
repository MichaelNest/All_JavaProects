
package simplegame;


public class SimpleGame {

    
    public static void main(String[] args) {
       int numofSteps = 0;
       boolean isActive = true;
       SimpleDotCom dot1 = new SimpleDotCom();
       
       int rand = (int)(Math.random()*5);
       int[] randArray = new int[3];
       for(int i = 0; i<randArray.length;i++){
           randArray[i] = rand;
           rand++;
          
       }
       
       dot1.setLocalCells(randArray);
       
       while(isActive){
           InputNum inp = new InputNum();
           String userVar = inp.getInputNum("Введите число: ");
           
           String result = dot1.checkYourself(userVar);
           numofSteps++;
           
           if(result.equals("Потопил")){
               isActive = false;
               System.out.println("Сайт потоплен за "+numofSteps+" попыток");
           }
           
           
       }
    }
    
}

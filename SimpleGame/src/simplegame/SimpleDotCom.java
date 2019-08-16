
package simplegame;


public class SimpleDotCom {
    private int[] localCells = new int[3];
    private int numofHits = 0;
    
    public void setLocalCells(int[] localCells){
        this.localCells = localCells; 
    }
   
    
    public String checkYourself(String userVariant){
        int intUserVariant = Integer.parseInt(userVariant);
        String result = "Мимо";
        
        /*for(int loc : localCells){
            if(intUserVariant == loc){
                numofHits++;
                result = "Попал";
                break;         
            }
            
            }*/
        
        for(int i=0; i<localCells.length;i++){
            if(intUserVariant == localCells[i]){
                numofHits++;
                result = "Попал";
                localCells[i] = -1;
                break;
            }
        }
        if(numofHits == localCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
    
    
}

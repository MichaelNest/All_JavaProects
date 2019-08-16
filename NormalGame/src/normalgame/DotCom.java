
package normalgame;

import java.util.ArrayList;


public class DotCom {
    private String name;
    private ArrayList<String> locationCells;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setLocationCells(ArrayList<String> locationCells){
        
        this.locationCells = locationCells;
        
    }
    
    public String checkYouself(String userInput){
        String result = "Мимо!!";
        int index = locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Ой!! Вы потопили  "+name+" )))");
            }else{
                result = "Попал";
            }
        }
        return result;
    }
    
}

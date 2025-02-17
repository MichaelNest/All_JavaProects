
package normalgame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GameHelper {
    
    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;
    
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt+" ");
        Scanner sc = new Scanner(System.in);
        inputLine = sc.nextLine();
        if(inputLine.length()==0) return null;
        return inputLine.toLowerCase();
    }
      
    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphaCoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean soccess = false;
        int location = 0;
        
        comCount++;
        int incr = 1;
        if(comCount%2 == 1){
            incr = gridLenght;
        }
        
        while (!soccess && attempts++ <200){
            location = (int)(Math.random()*gridSize);
          int x = 0;
          soccess = true;
          while(soccess && x<comSize ){
              if(grid[location]==0){
                  coords[x++] = location;
                  location +=incr;
                  if(location >=gridSize){
                      soccess = false;
                  }
                  if(x>0 && (location%gridLenght == 0)){
                      soccess = false;
                  }
              } else {
                  //System.out.println("Use"+location);
                  soccess = false;
              }
          }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while(x<comSize){
            grid[coords[x]] = 1;
            row = (int)(coords[x]/gridLenght);
            column = coords[x]%gridLenght;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
           // System.out.println(" coord"+x+" = "+alphaCells.get(x-1));
           
           
        }
        return alphaCells;
    }
}

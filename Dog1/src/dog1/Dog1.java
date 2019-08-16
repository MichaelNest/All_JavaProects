
package dog1;


public class Dog1 {

    private int size;
    private String name;
    
    public void setSize(int size){
        if(size>=0){this.size = size;} 
        else{System.out.println("Uncorrect size!!");}
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSize(){
        return size;
    }
    
    public String getName(){
        return name;
    }
    void bark(int size){
        setSize(size);
        if(this.size >= 60){
            System.out.println(name+" говорит Вуф-Вуф");
        } else if(30<=this.size && this.size<60){
            System.out.println(name+" говорит Гав-Гав");
        } else{
            System.out.println(name+" говорит Тяфф-Тяфф");
        }
         
    }
    
    void countBark(int count){
        System.out.println("");
        for(int i=0;i<count;i++){
            if(size >= 60){
            System.out.println("Вуф-Вуф");
        } else if(30<=size && size<60){
            System.out.println("Гав-Гав");
        } else{
            System.out.println("Тяфф-Тяфф");
        }
        }
        
    }
   
    
}

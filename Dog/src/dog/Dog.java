
package dog;


public class Dog {
    
    String name;
    
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       dog1.bark();
       dog1.name = "Bart";
      
       
       Dog[] myDogs = new Dog[3];
       myDogs[0] = new Dog();
       myDogs[1] = new Dog();
       myDogs[2] = dog1;
       
       myDogs[0].name = "Tommy";
       myDogs[1].name = "Jimmy";
       
       System.out.print("Last dog`s name is - ");
       System.out.println(myDogs[2].name);
       
       for(int i = 0; i<myDogs.length; i++){
           myDogs[i].bark();
       }
    }
    
    void bark(){
        System.out.println(name+" say Gau-Gau");
    }
    
}

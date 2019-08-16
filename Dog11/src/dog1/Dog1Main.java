
package dog1;

 
public class Dog1Main {
     public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.setName("Staff");
        d1.setSize(88);
        d1.bark(d1.getSize());
        
        Dog1 d2 = new Dog1();
        d2.setName("Jeck");
        d2.setSize(44);
        d2.bark(d2.getSize());
        
        Dog1 d3 = new Dog1();
        d3.setName("Tim");
        d3.setSize(22);
        d3.bark(d3.getSize());
        
        d1.countBark(3);
        d2.countBark(4);
        d3.countBark(5);
        
    }
}



package main;

public class Main {
    public static void main (String [] args ){

        By2 by2 = new By2();
        By3 by3 = new By3();

        InterfaceShui ifs;

        ifs = by2;
        ifs = by2;

        by2.aTestMethod();

    }

}














/*

package main;


public class Main {

    public static void main (String []args){

        IInventory inventory = new Inventory();
        IInventory inventory2 = new PlayerInventory();

        addSomeItem(new Inventory());
        addSomeItem(new PlayerInventory());
        
        inventory.addItem(new Item("blood", "jadjf", "adsfjfd"));
        inventory2.addItem(new Item("asdjfl", 2));
    }

    public static void addSomeItem(IInventory inventory){
        inventory.addItem(new Item("tool", "blood", "cloths"));
        
        
    }


}

*/

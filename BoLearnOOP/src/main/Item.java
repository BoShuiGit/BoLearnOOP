
package main;

public class Item implements {

    private String name;
    private String color;
    private int length;

    public Item (String name, String color, int length){
        this.name = name;
        this.color = color;
        this.length = length;
    }

    public String getName (){
        return name;
    }
    public String color (){
        return color;
    }
    public int getLength(){
        return length;
    }

    public void setName (String name){
        this.name = name;

    }
    public void setColor (String color){
        this.color = color;
    }
    public void setLength (int length){
        this.length = length;
    }

    @Override
    public void addItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

















/*
package main;

public class Item {

    String tool;
    String blood;
    String cloths;

    public Item (String tool, String blood, String cloths){
        this.tool = tool;
        this.blood = blood;
        this.cloths = cloths;
    }

    

   

} 

*/

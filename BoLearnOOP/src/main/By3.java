

package main;

public class By3 implements InterfaceShui{

    private int value;
    private boolean stopp = false;

    public By3 (){
        this.value = 0;
    }

    @Override
    public int aTestMethod() {
        
        for (int i = 0; i < 5; i++){
            value += 3;
            System.out.println(value);
            
        } return value;
        
    }

    @Override
    public void bTestMethod() {
        
        throw new UnsupportedOperationException("Unimplemented method 'bTestMethod'");
    }

}

package main;

public class By2 implements InterfaceShui {

    private int value;

    public By2() {
        this.value = 0;

    }

    @Override
    public int aTestMethod() {
        for (int i = 0; i < 6; i++) {
            value += 2;
            System.out.println(value);
            if (value > 10) {
                System.out.println("max up to number 10");
                break;
            }
        }return value;
    }

    @Override
    public void bTestMethod() {

    }

}

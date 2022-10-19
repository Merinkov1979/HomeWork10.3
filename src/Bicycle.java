

public class Bicycle extends Transport {


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
    @Override
    public void service(){
        updateTyre();

    }
}

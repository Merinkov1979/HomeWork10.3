public class  Car extends Transport {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }
    @Override
    public  void  service(){
        updateTyre();
        checkEngine();

    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}

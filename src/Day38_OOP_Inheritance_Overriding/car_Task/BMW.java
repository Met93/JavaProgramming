package src.Day38_OOP_Inheritance_Overriding.car_Task;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down ever 100 miles");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing car");
    }
}

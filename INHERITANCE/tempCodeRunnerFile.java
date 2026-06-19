package Inheritance;
class Father{
    void bike(){
        System.out.println("Father has a bike");
    }
}
class Son extends Father{
    
}

public class Main {
    public static void main(String[] args) {
        Son s =new Son();
        s.bike();
    }
    
}
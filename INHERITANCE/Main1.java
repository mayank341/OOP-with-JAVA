class Father{
    void bike(){
        System.out.println("Father has a bike");
    }
}
class Son extends Father{
    
}

public class Main1 {
    public static void main(String[] args) {
        Son s =new Son();
        s.bike();
    }
    
}

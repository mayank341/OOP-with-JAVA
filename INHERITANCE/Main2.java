class Animals{
    void sound(){
        System.out.println("cat say meow and dog sounds buh buh  ");
    }
}
class Dog extends Animals{

}

public class Main2 {
    public static void main(String[] args) {
     Dog ani=new Dog();
        ani.sound();
        
    }
    
}


class Mother{
    void girl(){
        System.out.println("Mother is most lovely person in the world ");
    }
}
class Daughter extends Mother{
    void good(){
        System.out.println("Daughter is the most lovely perosn to the parents ");

    }
}
public class Main3 {
    public static void main(String[] args) {
        Daughter d=new Daughter();  // making object here 
        d.girl();  // callling function ,daughter extends mother
        d.good();  // daughter function calling 
        
    }
    
}

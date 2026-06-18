public class BuiltInFunction {
    public static void main(String[] args) {
      
    System.out.println("Built in function in java ");
     

    //  change character to ascii value :
      char chr= 'A';
      int ascii =(int)(chr);
      System.out.println("convert charcter to ascii value ");
      System.out.println(ascii);

    //  change ascii value to chaarcter :
    // int asci_value=99;
    // char ch=(char)asci_value;
    // System.out.println("convert ascci number to charcter ");
    // System.out.println(ch);

    //  convert :
    char cha = 'अ';
System.out.println((int)cha); 

// converts numbers into charcter :
System.out.println("it prints the charcter of number ");
for(int i=48;i<58;i++){
    System.out.println(i+"->"+ (char)(i));
}

//  convert into uppercase from lower case :
System.out.println("convert into UpperCase");
char cchh='a';
System.out.println((char)(cchh-32));

// convert Uppercase into LowerCse :
char cchha='A';
System.out.println("convert UpperCASE into LowwerCAse ");
System.out.println((char)(cchha+32));

// charcter to digit :
char  xh='7';
System.out.println(xh-'0');

// 



    }
    
}

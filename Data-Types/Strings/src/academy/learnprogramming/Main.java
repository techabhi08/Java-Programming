package academy.learnprogramming;

public class Main {

    public static void main(String[] args){
    String myString = "This is my string";
    System.out.println("myString is equal to, " + myString);
    myString = myString + ", and this is more";
    System.out.println("my string is equal to " + myString);
    myString = myString + " \u00A9 2019";
    System.out.println("myString is equal to " + myString);
    String numberString = "250.55";
    numberString = numberString + "45.55";
    System.out.println(numberString);
    }
}

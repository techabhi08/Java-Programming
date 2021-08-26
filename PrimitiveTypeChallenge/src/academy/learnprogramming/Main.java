package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte myByteNumber = 10;
	short myShortNumber = 20;
	int myIntNumber = 50;
	long myLongNumber = 50000 + (10 * (myByteNumber + myShortNumber + myIntNumber));
	System.out.println(myLongNumber);

	short myShortValue = (short) (10000 + (10 * (myByteNumber + myShortNumber + myIntNumber)));
	System.out.println(myShortValue);
    }
}

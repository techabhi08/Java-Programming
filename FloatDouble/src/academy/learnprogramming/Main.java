package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
	System.out.println("Float Min Value = " + myMinFloatValue);
	System.out.println("Float Max Value = " + myMaxFloatValue);

	double myMinDoubleValue = Double.MIN_VALUE;
	double myMaxDoubleValue = Double.MAX_VALUE;
	System.out.println("Double Min Value = " + myMinDoubleValue);
	System.out.println("Double Max Value = " + myMaxDoubleValue);

	int myIntValue = (5 * 10 / 3);
	float myFloatValue = 5.33f / 3f;
	double myDoubleValue = 5.33d / 3d;

	System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);



	//Challenge Float and Double
	double myPounds = 34;
	double myKilograms = myPounds * 0.45359237;
	System.out.println(myKilograms);




    }
}





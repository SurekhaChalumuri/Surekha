package svkp;
import java.util.Scanner;
public class Biggest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
	    double x=in.nextDouble();
		System.out.println("Input the Second number: ");
	    double y=in.nextDouble();
        System.out.println("Input the Third number: ");
	    double z=in.nextDouble();
        System.out.println("The smallest number is: "+ smallest(x,y,z));
	}
	public static double smallest(double x, double y, double z)
	{
		return Math.min(Math.min(x,y),z);
	}
}

	    


	    
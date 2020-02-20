import Interest.*;
import constructioncost.*;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class ClientApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.print("Enter choice: \n"
	    		+ "1)Simple Interest \n"
	    		+ "2)Compund Interest \n"
	    		+ "3)House Construction Cost \n");
	    int choice=sc.nextInt();
	    switch(choice) {
	    	case 1:
	    		SimpleInterest si=new SimpleInterest();
	    		break;
	    	case 2:
	    		CompoundInterest ci=new CompoundInterest();
	    		break;
	    	case 3:
	    		HouseConstructionCost hcc=new HouseConstructionCost();
	        	break;
		

	}
	}

}

package constructioncost;
import java.util.*;
import java.io.*;

public class HouseConstructionCost {
	public HouseConstructionCost()
	{Scanner sc=new Scanner(System.in);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.print("Enter material standard: \n"
	    		+ "1)Standard Material \n"
	    		+ "2)Above Standard Material \n"
	    		+ "3)High Standard Material \n"
	    		+ "4)Fully Automated House \n");
	    int choice=sc.nextInt();
	    int materialcost = 0;
	    switch(choice) {
	    case 1:
	    	materialcost=1200;
	    	break;
	    case 2:
	    	materialcost=1500;
	    	break;
	    case 3:
	    	materialcost=1800;
	    	break;
	    case 4:
	    	materialcost=2500;
	    	break;
	    }
	    PrintStream myout1 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout1.print("Enter Area Of The House \n");
	    int area=sc.nextInt();
	    int cost=area*materialcost;
	    PrintStream myout2 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout2.print("House Construction Cost is: \n Rs"+cost+"\n");
	}

}

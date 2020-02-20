package Interest;

import java.util.*;
import java.io.*;
public class CompoundInterest {
public CompoundInterest()
{
	double principle,rate, timeperiod, CompoundInterest;
    Scanner sc=new Scanner (System.in);
    PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    myout.print("Enter amount: \n");
    principle=sc.nextDouble();
    PrintStream myout1 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    myout1.print("Enter number Of Years \n");
    timeperiod=sc.nextDouble();
    PrintStream myout2 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    myout2.print("Enter Rate Of Interest: \n");
    rate=sc.nextDouble();
    CompoundInterest=principle * Math.pow(1.0+rate/100.0,timeperiod) - principle;
    PrintStream myout3 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    myout3.print("The Compound Interest is:  \n Rs"+CompoundInterest+"\n");
}
}

package Interest;
import java.util.*;
import java.io.*;
public class SimpleInterest {
public SimpleInterest()
{
	double principle,rate, timeperiod, SimpleInterest;
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
    SimpleInterest=(principle * timeperiod * rate)/100;
    PrintStream myout3 =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    myout3.print("The Simple Interest is:  \n"+SimpleInterest+"\n");
}
}

package packExceptionData;

import java.io.IOException;

public class Data {
int d;
public Data(int num) {
	// TODO Auto-generated constructor stub
	d=num;
}
public int getD() //throws NegativeDataException (do not really handle the exception but only suppresses the warning at compile time
//this throws tells the compiler that if any given exception occurs it will be handled
{
	try
	{
	if(d<0)
	throw new NegativeDataException();
	
	}
	catch (NegativeDataException e) {
		e.printStackTrace();  //will print the name of exception ,description and line no in method where it occured with the help of stack trace
	//e.getMessage();	
	//	e.toString();
		//System.out.println(e.toString());
	}
	return d;
}
//why  use throws demonstration 
//IF we have class with multiple methods which may throw an exception then creating try and catch block
//for every individual method will be time consuming ,unnecessary long and will be less-readable.
//so we use throws which delegate the work of exception handling to caller.while calling the method ,the caller will have to handle it
public void method1(int m)
{
	if(m==1)
        throw new ArithmeticException("Arithmetic Exception Occurred");
     else
        throw new 	NullPointerException("FoundIOException");
}
public void method2(int m)
{
	if(m==1)
        throw new ArithmeticException("Arithmetic Exception Occurred");
     else
        throw new 	NullPointerException("FoundIOException");
}
}

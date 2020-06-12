package packExceptionData;

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

}

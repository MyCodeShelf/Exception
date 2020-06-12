package packExceptionData;

import java.io.IOException;

public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data dd=new Data(-8);
System.out.println(dd.getD());
//throws delegates the handling of exception to main
try
{
	dd.method1(1);
	
}
catch (ArithmeticException e) {
	e.printStackTrace();
}
catch (NullPointerException ee) {
	ee.printStackTrace();
}
try
{
dd.method2(2);
}
catch (NullPointerException e) {
	// TODO: handle exception
	System.out.println("No null allowed");
}
}
	
}

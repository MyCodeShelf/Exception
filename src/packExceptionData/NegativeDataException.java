package packExceptionData;

public class NegativeDataException extends Exception {
public String toString()  //converts an object to string type ,in current scenario new NegativeDataException() object
{
	return "no negative data allowed";
}
}

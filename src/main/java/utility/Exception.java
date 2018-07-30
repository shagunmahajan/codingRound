package utility;

public class Exception extends RuntimeException {

	  public Exception(String message) {
		  super(message);
	  }
	  
	  public Exception(Throwable t) {
		  super(t);
	  }
}

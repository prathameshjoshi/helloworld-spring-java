package helloworld;

/**
 * @author laufer
 */
public class HelloWorld {
  
  private static final String DEFAULT_MESSAGE = "Hello World";
  
  private String msg;
  
  public void setMessage(String msg) {
    this.msg = msg;
  }

  public String getMessage() {
    return msg;
  }
}

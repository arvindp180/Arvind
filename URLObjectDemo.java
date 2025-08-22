 import java.net.*;
 public class URLObjectDemo {
 public static void main(String args[])   {
 try {
 URL u=new URL("https://www.oracle.com/in/tools/technologies/netbeans-ide.html");
 System.out.println("Protocol: " + u.getProtocol());
 System.out.println("Hostname: " + u.getHost());
 System.out.println("Port: "+ u.getDefaultPort());
 System.out.println("Path: " + u.getPath());
 System.out.println("File: " + u.getFile());
 System.out.println("Query: " + u.getQuery());//parameter passed along with ? in URL
 }catch(Exception x) {System.out.println(x);}
 }
}
 
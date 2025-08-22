import java.net.*;
 class InetAddressTest
 {
 public static void main(String args[])
 {
 try  {             
System.out.println("Address of local host is: "+InetAddress.getLocalHost());
 }
 catch (UnknownHostException u){}   
}
 }
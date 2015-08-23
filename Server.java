//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import java.io.*;
import java.net.*;

//import javax.swing.JFrame;
//import javax.swing.KeyStroke;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.lang.reflect.*;
//import java.util.*;


class Server{
	
	
	public static void main(String args[]) {
	      Thread t= new Thread( new ServerThread() );
	      t.start();
	      
	      
		   	}
	
		
}

class ServerThread  implements Runnable{
	
   public void run(){
	      try {

	    	 ServerSocket srvr = new ServerSocket(5444);
	         System.out.print("Server Running!\n");
	         Socket skt = srvr.accept();
	         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
	         int level = 0; 
	         while(true)
	         {
	         
	         System.out.print("Server has connected!\n");
	         
	         //BufferedReader in = new BufferedReader(new
	         //InputStreamReader(skt.getInputStream()));
	               
	         //while (!in.ready()) {}
	         
	         //String data = in.readLine();
	         //String data = "1";
	         
	         //System.out.print(i+"#  ");
	         //System.out.println(data);
	         //System.out.println("\n");
	         //char dt = key.getKeyChar();
	         
	         //System.out.print(key.getKeyCode());
	         
	         
	        System.out.print("\n"); 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        char up_dwn = (char)br.read();
	        
	        if (up_dwn=='a')
	        	level+=2;
	        
	        if (up_dwn=='d')
	        	level-=2;
	         
	        System.out.print("Sending string: " + up_dwn + " Volume Level: "+level+"\n");
	         
	         out.print(up_dwn+"\n");
	         out.flush();
	         
	         
	         
	        }
	      }
	      catch(Exception e) {
	         System.out.print("Whoops! It didn't work!\n");
	      }
		 }
}

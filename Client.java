import java.lang.*;
import java.io.*;
import java.net.*;

import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import sun.audio.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.*;


class Client {
	
	static Player player;
	
	public static void Play(){
		
		try{
			player = Manager.createPlayer(new URL("file:./res/bp1.wav"));
			//player.start();
			
			
				
	   		}
			catch(NoPlayerException e){}
			
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
public static void Play1(){
		
		try{
			player = Manager.createPlayer(new URL("file:./res/bp2.wav"));
			//player.start();
			
			
				
	   		}
			catch(NoPlayerException e){}
			
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


public static void Play2(){
	
	try{
		player = Manager.createPlayer(new URL("file:./res/bp3.wav"));
		//player.start();
		
		
			
   		}
		catch(NoPlayerException e){}
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}



public static void Playv1(){
	
	try{
		player = Manager.createPlayer(new URL("file:./res/bp2v1.wav"));
		//player.start();
		
		
			
   		}
		catch(NoPlayerException e){}
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}


public static void Playv2(){
	
	try{
		player = Manager.createPlayer(new URL("file:./res/bp2v2.wav"));
		//player.start();
		
		
			
   		}
		catch(NoPlayerException e){}
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}


public static void Playv3(){
	
	try{
		player = Manager.createPlayer(new URL("file:./res/bp2v3.wav"));
		//player.start();
		
		
			
   		}
		catch(NoPlayerException e){}
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}





   public static void main(String args[]) {
      
    	  //InetAddress serverAddr = InetAddress.getByName("128.223.198.79");
    	 char ch=' ';
    	 
    	 
	     
    	  
    	
    		  try {	  
    			  Socket skt = new Socket("127.0.0.1", 5444);
    			  BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
    			  while(true)
    	    	  {
    			  
         
         System.out.print("Received string:");

    	  /*
         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
         out.print("Sending from RPC Client");
         out.close();
         skt.close();
         */
         String c = in.readLine();
         
         System.out.print(c); 

         if (c.charAt(0)=='d')
         {
        	 System.out.print(c); 
        player.stop();	
        
         
         }
         
         
         
         if (c.charAt(0)=='a')
         {
        	 
        	 Play();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         if (c.charAt(0)=='s')
         {
        	 
        	 Play1();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         if (c.charAt(0)=='d')
         {
        	 
        	 Play2();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         
         
         if (c.charAt(0)=='j')
         {
        	 
        	 Playv1();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         
         if (c.charAt(0)=='k')
         {
        	 
        	 Playv2();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         if (c.charAt(0)=='l')
         {
        	 
        	 Playv3();
        	 System.out.print(c); 
            player.start();	 
            
         }
         
         
         
         System.out.print("\n");
         //in.close();
         //skt.close();
  
    	    	  }
         //while (!.ready()) {}
         //System.out.print(in.readLine()); // Read one line and output it

         //System.out.print("'\n");
         //in.close();
      }

         
      catch(Exception e) {
         System.out.print("Whoops! It didn't work!\n "+e.toString());
         
      }
   }

   }


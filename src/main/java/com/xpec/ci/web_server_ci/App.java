package com.xpec.ci.web_server_ci;

import org.eclipse.jetty.server.Server;

import com.xpec.ci.web_server_ci.handler.SumHandler;

public class App 
{
	//Server main RMP 2
    public static void main( String[] args )
    {
    	try{
	        Server server = new Server(9090);
	        server.setHandler(new SumHandler());
	        server.start();
	        server.join();
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    }
}

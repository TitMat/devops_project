package fr.insa.soap; 


import jakarta.xml.ws.Endpoint; 

public class calculatorlauch {
	
	public static String host="localhost";
	public static short port=8089; 
	
	public void start() {
		
		String url="http://"+host+":"+port+"/";
		Endpoint.publish(url, new calcule());
	}
	
	public static void main(String[] args) {
		new calculatorlauch().start();
		System.out.println("service lauch"); 
	}
}
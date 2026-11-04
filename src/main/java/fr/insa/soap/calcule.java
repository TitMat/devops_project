package fr.insa.soap;

import jakarta.jws.WebMethod; 
import jakarta.jws.WebParam;
import jakarta.jws.WebService; 

	/*
	private int a; 
	private int b ;
	
	
	*/
	
	
	@WebService(serviceName = "Calculator")
	public class calcule {
		
		
		public static class Add {
			private int a ; 
			private int b ; 
		}
		public static class Substract {
			private int a ; 
			private int b ; 
		}
		public static class Multiply {
			private int a ; 
			private int b ; 
		}
		public static class Divide {
			private int a ; 
			private int b ; 
		}
		
		@WebMethod(operationName="Add")
		public int Add(@WebParam(name="op") Add parameters) {
			return parameters.a + parameters.b ; 
		}
		
		@WebMethod(operationName="Sou")
		public int Add(@WebParam(name="op") Substract parameters) {
			return parameters.a - parameters.b ; 
		}
		@WebMethod(operationName="Mul")
		public int Add(@WebParam(name="op") Multiply parameters) {
			return parameters.a * parameters.b ; 
		}
		@WebMethod(operationName="Div")
		public int Add(@WebParam(name="op") Divide parameters) {
			return parameters.a / parameters.b ; 
		}
		
		
	}
	
		
	
	


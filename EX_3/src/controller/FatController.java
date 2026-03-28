package controller;

import model.PilhaInt;

public class FatController {
       public FatController() {
    	   super();
       }
       
       public long fatorial (int num ) throws Exception{
    	   
    	   // intanciar o smetodos da biblioteca pilhaInt

           PilhaInt metodo = new PilhaInt();
           
           long fat = 1 ;
           
           for (int cont = 1; cont <=num;cont++) {
        	   metodo.push(cont);
        	   
           }
       
           for (int cont = 0; cont <num;cont++) {
        	   try {
        		   fat*=metodo.pop();
        		   
        		   
        	   }catch (Exception exc) {
        		   throw exc;
        	   }
           }
           return fat;
       }   
}

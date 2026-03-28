package view;
import controller.FatController;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// criando metodo leitura
       Scanner ler = new Scanner (System.in);
       
       // instanciando os metodos
       FatController metodo = new FatController();
        int num;
       
       do {
    	   System.out.print("digite um numero que seja de 0 a 10 : ");
           num = Integer.parseInt(ler.nextLine());
              
       }while(num<0 || num>10);
       
       try {
    	   System.out.print("o fatorial de " +num+ " é :"+metodo.fatorial(num));
           
       }catch (Exception exc) {
    	   System.out.print(exc.getMessage());

       }
       ler.close();
	}

}

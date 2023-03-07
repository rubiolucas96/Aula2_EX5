/*Escrever uma função recursiva que, dado uma posição da série, a função
retorne seu valor. Entrada limitada a 20.*/
package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
   Controller fib = new Controller ();
   int a = 8;
   int numero = fib.numero(a);
   System.out.println(numero);
		 

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUGO;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Familiar
 */
public class fl {
    
    public static ArrayList<Integer> generarAleatoriosNoRepetidos (int cantidad) {
		ArrayList<Integer> respuesta = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			 respuesta.add(gen(respuesta));
		}	
      
               
		return respuesta;
	}

   public static int gen(ArrayList<Integer>a) {
		Random ra = new Random();	
		int numero = ra.nextInt(10);
		if (!a.contains(numero)) {
			return numero;
		}else {
			return gen(a);
		}
	}
    public static void imprimir (ArrayList<Integer>num) {
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
    public static void main(String[] args) {
		Random random = new Random();
         //imprimir(generarAleatoriosNoRepetidos(10));
        Set<Integer> alreadyUsedNumbers = new HashSet<>();

        int nm[]=new int[6];
         
         int c=0;
// Vamos a generar 10 números aleatorios sin repetición
while (alreadyUsedNumbers.size()<6) {

   // Número aleatorio entre 0 y 40, excluido el 40.  
   int randomNumber = random.nextInt(6);

   // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
   if (!alreadyUsedNumbers.contains(randomNumber)){
        System.out.print( nm[c]=randomNumber);
      //System.out.println(" "+randomNumber);
      alreadyUsedNumbers.add(randomNumber);
      
      
   }
    
    
    
   }
        

       


	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase1 {
	
	//Hacer una calculadora con capidad de sumar, restar, multiplicar y dividir
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Comentario
		/*Otro tipo de comentario*/
		
		//Ejercicio1 = Mostrar por pantalla: 3+2
		  System.out.println("3+2");
		
		//Ejercicio2 = Mostrar por pantalla 3+2= 5 (Resultado)
		System.out.println("3+6=" + (3+6));
		
		//Ejercicio3 = Mostrar por pantalla el resultado de dos numeros dentro de una variable. A + B = C
        int primerNumero = 4;
        int segundoNumero = 4;
		System.out.println(primerNumero+segundoNumero);

		//Recogida de datos por pantalla
		//System.out.println("¿Como te llamas?");
	    //String nombre = br.readLine();
	    //System.out.println("¿Cual es tu apellido?");
	    //String apellido = br.readLine();
	    //System.out.println("Hola " + nombre + " "+ apellido);
	    
	    //Ejercicio4: Pedir dos numeros y mostrarlo por pantalla en modo de suma
		System.out.println("Dime el primer número");
		int n1 = Integer.parseInt (br.readLine());
		System.out.println("Dime el segundo número");
		int n2 = Integer.parseInt (br.readLine());
		int resultado = n1 + n2;
	
		
		/*if (resultado == 5 ) 
		{
		System.out.println("jajajaj por el culo te la hinco");
		}*/
		//else 
		//{
	//		System.out.println("Ese numero no me hace gracia");
		//}
		
	//	if (n1%n2 == 0) 
		//{
	//		System.out.println("El resultado de la division es 0, por lo tanto es una division exacta");
		//}
			
		// Cuando el resultado sea 8 que en lugar de 8 aparezca 9
		// Cuando el resultado acaba en 5 te dirá por el culo te hinco 5,55,15,35
		
		if (resultado == 8)
		{
			System.out.println(n1 + "+" + n2 + "=" + 9  );
		}
		else
		{
			System.out.println(n1 + "+" + n2 + "=" + resultado  );
		}
		
		if (resultado % 5 == 0 && resultado%10 != 0)
		{
			System.out.println("jajajaj por el culo te la hinco");

		}
	
}

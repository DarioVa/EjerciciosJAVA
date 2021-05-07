import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.attribute.standard.Media;

public class BUCLES {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ejercicios de bucles");

		int numeroEjercicio = 0;

		while (numeroEjercicio != -1) {
			numeroEjercicio = (int)PedirNumero(true, "Dime el numero de ejercicio");

			switch (numeroEjercicio) {
			case 1: {
				System.out.println("Ejercicio 1: Escribir los numero del 10 al 20");
				Ejercicio1();
			}
				break;

			case 2: {
				System.out.println("Ejercicio 2: Escribir los numero impares del 1 al 10");
				Ejercicio2(1);
			}
				break;

			case 3: {
				System.out.println("Ejercicio 3: Escribir los 10 primeros numero pares");
				Ejercicio3();
			}
				break;

			case 4: {
				System.out.println(
						"Ejercicio 4: Escribir los 10 primeros numeros pares " + "o impares segun indique el usuario");
				Ejercicio4();
			}
				break;

			case 5: {
				System.out.println(
						"Ejercicio 5: Escribir las tablas de multiplicar de un numero que el usuario nos diga");
				Ejercicio5();
			}
				break;

			case 6: {
				System.out.println("Ejercicio 6: Escribe todos los numeros comprendidos entre dos numeros");
				Ejercicio6();
			}
				break;

			case 7: {
				System.out.println(
						"Ejercicio 7: Escribe un programa que te pide dos números. Si el primero es menor que el segundo,\r\n"
								+ "	escribe todos los números comprendidos entre ambos en orden ascendente. Si el\r\n"
								+ "	primero es mayor que el segundo, escribe todos los números comprendidos entre\r\n"
								+ "	ambos en orden descendente.");
				Ejercicio7();
			}
				break;

			case 8: {
				System.out.println(
						"Ejercicio 8: Escribir todos los números impares entre dos números A y B introducidos por teclado.\r\n"
								+ "	Antes habrá que comprobar cuál de los dos números A y B es mayor");
				Ejercicio8();
			}
				break;

			case 9: {
				System.out.println(
						"Ejercicio 9: Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998\r\n"
								+ "	+ 1000.");
				Ejercicio9();
			}
				break;

			case 10: {
				System.out.println(
						"Ejercicio 10: Calcula el valor medio de una serie de valores enteros positivos introducidos por el teclado, para terminar de introducir valores introduce un numero negativo.");
				Ejercicio10();
			}
				break;

			case 11: {
				System.out.println(
						"Ejercicio 11: El usuario de este programa sera un profesor, que introduzca las notas de sus 30 alumnos de una en una. El atgoritmo debe decir cuantos han suspendido. ");
				Ejercicio11();
			}
				break;

			case 12: {
				System.out.println("Ejercicio 12: Calcula el valor maximo de una serie de 3 numeros.");
				Ejercicio12();
			}
				break;
				
			case 13: {
				System.out.println("Ejercicio 13: Calcular en el mismo bucle el valor maximo, el valor minimo y la media de una serie de 3 numeros introducidos por el teclado ");
				Ejercicio13();
			}
			break;
			
			case 14: {
				System.out.println("Ejercicio 14: Calcula el valor medio de una serie de valores enteros positivos introducidos por teclado. Para terminar la secuencia se deve introducir un numero negativo. ");
				Ejercicio14();
			}
			break;

			case -1: {
				System.out.println("Adios");
			}
				break;

			default: {
				System.out.println("No tenemos ningun ejercicio con ese numero");
			}
				break;

			}

		}
	}

	public static float PedirNumero(boolean esElPrimero, String texto) throws IOException {
		return PedirNumero(esElPrimero, texto, false);
	}

	public static float PedirNumero(boolean esElPrimero, String texto, boolean tieneDecimales) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (texto.equals("")) {
			if (esElPrimero) {
				System.out.println("Dime un numero");
			} else {
				System.out.println("Dime otro numero");
			}
		} else {
			System.out.println(texto);
		}


		if (tieneDecimales) 
		{
			float numeroDelEjercicio = -1;
			try {

				numeroDelEjercicio = Float.parseFloat(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("el valor no es numerico");
			}
			return numeroDelEjercicio;
			
		} else {
			int numeroDelEjercicio = -1;
			try {
				numeroDelEjercicio = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("el valor no es numerico");
			}
			return numeroDelEjercicio;
		}

	}

	public static void Ejercicio1() {
		// Realizar ejercicio
		// int numero = 10;
		// while (numero <= 20 )
		// {
		// System.out.println(numero);
		// numero = numero +1;
		// }

		// FOR

		for (int i = 10; i <= 20; i++)
			System.out.println(i);

	}

	public static void Ejercicio2(int numero) {
		// Realizar ejercicio
		/*
		 * while (numero <= 10 ) { System.out.println(numero); numero = numero + 2 ; }
		 */
		for (numero = numero; numero <= 10; numero = numero + 2) {
			System.out.println(numero);
		}
	}

	public static void Ejercicio3() {
		// Realizar ejercicio
		// int numero = 1;
		// int i = 0;
		/*
		 * while (i < 10) { if (numero%2 == 0) { System.out.println((i + 1)+ ":" +
		 * numero); i++; } numero++; }
		 */
		for (int numero = 1, i = 0; i < 10; numero++) {
			if (numero % 2 == 0) {
				System.out.println((i + 1) + ":" + numero);
				i++;
			}

		}
	}

	public static void Ejercicio4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Realizar ejercicio
		System.out.println("Elige numeros pares(1), o imparaes(2)");
		String opcion = br.readLine();
		switch (opcion) {
		case "1": {
			System.out.println("Los numeros pares son:");
			Ejercicio2(2);
		}
			break;

		case "2": {
			System.out.println("Los numeros impares son:");
			Ejercicio2(1);
		}
			break;

		default: {
			System.out.println("La opcion que has elegido no corresponde con ninguna de las ofrecidas anteriomente");
		}
			break;
		}
	}

	public static void Ejercicio5() throws IOException {
		// pedir numero
		int numero = (int)PedirNumero(true, "");
		// Primero es pedir el numero
		// Escribir 1 X, 2 X ..

		for (int i = 0; i <= 10; i++) {
			if (numero == 4) {
				System.out.println(i + "X" + numero + "=" + "!");
			} else {
				System.out.println(i + "X" + numero + "=" + numero * i);
			}
		}
	}

	public static void Ejercicio6() throws IOException {
		int n1 = (int)PedirNumero(true, "");
		int n2 = (int)PedirNumero(false, "");

		CompruebaValidacion(n1, n2);

	}

	public static void CompruebaValidacion(int n1, int n2) throws IOException {
		while (n1 > n2) {
			System.out.println("Error, el primer numero es mas grande que el segundo.");
			n1 = (int)PedirNumero(true, "");
			n2 = (int)PedirNumero(false, "");
		}

		PintaElResultado(n1, n2);
	}

	public static void PintaElResultado(int n1, int n2) {
		while (n2 >= n1) {
			System.out.println(n1);
			n1++;
		}

	}

	public static void Ejercicio7() throws IOException {
		/*
		 * int n1 = PedirNumero(true, ""); int n2 = PedirNumero(false, ""); if (n1<n2) {
		 * //si n1= 1 y n2 = 3 no deben de aparecer ni el 1 ni el 3 n1++; while(n1<n2) {
		 * System.out.println(n1); n1++; } } else if (n2<n1) { while(n2+1<n1) { n1--;
		 * System.out.println(n1); } } else {
		 * System.out.println("Los dos numeros son iguales"); }
		 */
		int n1 = (int)PedirNumero(true, "");
		int n2 = (int)PedirNumero(false, "");
		if (n1 < n2) {
			n1++;
			for (; n1 < n2; n1++) {
				System.out.println(n1);

			}
		} else if (n2 < n1) {
			for (; n2 + 1 < n1; n1--) {
				System.out.println(n1);
			}
		} else {
			System.out.println("Los dos numeros son iguales");
		}

	}

	public static void Ejercicio8() throws IOException {
		/*
		 * int n1 = PedirNumero(true, ""); int n2 = PedirNumero(false, ""); if (n1<n2) {
		 * while (n1<=n2) { // si solo es impar que me lo muestre por pantalla if (n1%2
		 * != 0) { System.out.println(n1); } n1++; } } else if (n1>n2) { while (n1>=n2)
		 * {
		 * 
		 * if (n2%2 != 0) { System.out.println(n2); } n2++; } } else {
		 * System.out.println("Los numeros non iguales"); }
		 */
		int n1 = (int)PedirNumero(true, "");
		int n2 = (int)PedirNumero(false, "");
		if (n1 < n2) {
			while (n1 <= n2)
				for (; n1 <= n2; n1++) {
					if (n1 % 2 != 0) {
						System.out.println(n1);
					}
				}
		} else if (n1 > n2) {
			for (; n1 >= n2; n2++) {

				if (n2 % 2 != 0) {
					System.out.println(n2);
				}
			}
		} else {
			System.out.println("Los numeros non iguales");
		}
	}

	public static void Ejercicio9() throws IOException {
		/*
		 * int n1 = 0; int n2 = 10; int resultado = 0; while (n1<=n2) { if (n1%2 == 0) {
		 * //resultado++ == resultado = resultado +1 resultado = resultado + n1; } n1++;
		 * } System.out.print("El resultado es" + resultado);
		 */
		int n1 = 0;
		int n2 = 10;
		int resultado = 0;
		for (; n1 <= n2; n1++) {
			if (n1 % 2 == 0) {
				resultado = resultado + n1;
			}
		}
		System.out.print("El resultado es" + resultado);

	}

	public static void Ejercicio10() throws IOException {
		int n1 = 0;
		int i = 0;
		float sumaNumeros = 0;
		// n1 = -3;
		// i = 3; //2
		// sumaNumero = 4; //7
		while (n1 >= 0) // mientras sea mayor que 0 o igual que 0
		{
			n1 = (int)PedirNumero(false, "Dime un numero para calcular la media");
			if (n1 >= 0) {
				i = i + 1;
				sumaNumeros = sumaNumeros + n1;
			}
		}
		System.out.println("El resultado es " + (sumaNumeros / i));
	}

	public static void Ejercicio11() throws IOException {
		// Rango de la notas
		float nota = 0;
		int i = 0;
		int numeroSuspensos = 0;
		while (i < 5) {
			nota = PedirNumero(false, "Dime una nota", true);
			if (0<=nota && nota<=10)
			{
				if (nota < 5) 
				{
					numeroSuspensos++;
				}
				i++;
			}
			else 
			{
				System.out.print("Nota no valida, ");
			}
		}
		System.out.println("Han suspendido " + numeroSuspensos + " aumnos");

	}

	public static void Ejercicio12() throws IOException {
		
		int numero;
		int numeroMaximo = Integer.MIN_VALUE;
		for (int i = 0; i < 10; i++) 
		{
			numero = (int)PedirNumero(false,"Dime un numero");
			if (numeroMaximo<numero) 
			{
				numeroMaximo=numero;
			}
		}
		
		System.out.println("El numero mas alto es " + numeroMaximo);
	}
public static void Ejercicio13() throws IOException {
		
	int numero;
	int numeroMaximo = Integer.MIN_VALUE;
	int numeroMinimo = Integer.MAX_VALUE;
	int SumaTodosLosNumeros = 0;
	int i ;
	for (i = 0; i < 3; i++) 
	{
		numero = (int)PedirNumero(false, "Dime un numero");
		if (numeroMaximo<numero) 
		{
			numeroMaximo=numero;		
		}
		
		if (numeroMinimo>numero) 
		{
			numeroMinimo=numero;
		}
		 
		SumaTodosLosNumeros = SumaTodosLosNumeros + numero;
		
	}
	System.out.println("La media es " + (SumaTodosLosNumeros/i));
	System.out.println("El valor maximo es " + numeroMaximo);
	System.out.println("El valor minimo es " + numeroMinimo);
	
}
public static void Ejercicio14() throws IOException {
	
	
}

	// ctrl+shif+f => ordenar codigo

}

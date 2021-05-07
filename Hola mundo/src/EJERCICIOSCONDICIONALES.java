import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJERCICIOSCONDICIONALES {
	public static void main(String[] parametro) throws IOException 
	{
		//== -> igual 
		//!= -> distinto 
		//<
		//>
		//<=
		//>=
		
		//Dos condiciones juntas que se cumplan las dos
		// if(condicion1 && condicion2)
		//Dos condiciones juntas y que se cumpla solo 1 como minimo
		// if(condicion1 || condicion2)
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("EJERCICIOS DE CONCICIONALES");
		System.out.println("1.- Resta dos números teniendo en cuenta cual es el mayor y "
				+ "cual es el menor para que el resultado siempre sea positivo.");

		System.out.println("2.- Di si un año introducido por la consola es bisiesto o no.");
		
		System.out.println("QUE EJERCICIO QUIERES ELEGIR");
		int numeroEjercicio = Integer.parseInt (br.readLine());
		
		if(numeroEjercicio == 1)
		{
			System.out.println("Dime un numero");
			int n1 = Integer.parseInt (br.readLine()); //1
			System.out.println("Dime otro numero");
			int n2 = Integer.parseInt(br.readLine());  //5
			
			
			if(n2>=n1)
			{
				System.out.println("El resultado es: " + (n2-n1));	
			}
			else if (n1>n2)
			{
				System.out.println("El resultado es: " + (n1-n2));
			}
			
			int resultado = n1-n2;
			if(resultado>0) 
			{
				System.out.println("El resultado es: " + resultado);
			}
			else 
			{
				System.out.println("El resultado es: " + resultado*-1);
			}
			
			//System.out.println("El resultado es: " + ((resultado<0)?resultado *-1 : resultado));

		}
		else if(numeroEjercicio == 2) 
		{
		System.out.println("Dime un año");
		int year = 	Integer.parseInt (br.readLine());
		if (year%4 == 0 && year%400 == 0)
		{
			System.out.println("El año es bisiesto");
		}
		else
		{
		  System.out.println("El año no es bisiesto");	
		}
			
		}
		else if(numeroEjercicio == 3) 
		{
			//Un programa que le indiques si quieres pasar de euros a peseta o de peseta a euro y luego te pida la cantidad
			//y luego te lo pasa a lo que no has elegido 
			
			//¿Qué quieres pasar de euro a peseta(1) o de peseta a euro (2)?
			//Introduce la cantidad de pesetas
			// Son X euros
			System.out.println("¿Qué quieres pasar de euro a peseta(1) o de peseta a euro (2)?");
			//Introduzco el numero 3 cuando me pide las opciones	
			int opcion = Integer.parseInt (br.readLine());
			int cantidad = 0;
			if (opcion == 1)
			{
				System.out.println("Introduce la cantidad de euros");
				cantidad = Integer.parseInt (br.readLine());
				System.out.println(cantidad*166);
			}
			else if (opcion == 2)
			{
				System.out.println("Introduce la cantidad de pesetas");
				cantidad = Integer.parseInt (br.readLine());
				System.out.println(cantidad/166);
			}
			else
			{
				System.out.println("Esa opcion no es válida");
			} 
				
			
			

		}
		else if(numeroEjercicio == 4) 
		{
			System.out.println("Introduce tres numeros");
			int n1= Integer.parseInt (br.readLine());
			int n2= Integer.parseInt (br.readLine());
			int n3= Integer.parseInt (br.readLine());
			
			if (n1==n2 && n2 ==n3)
			{
				System.out.println("Los numeros son iguales");
			}
			
			else if (n1<=n2 && n2<=n3) 
			{
				System.out.println("Los numeros estan en orden de menor a mayor");
			}
			else
			{
				System.out.println("Los numeros no estan en orden de menor a mayor");
			}	
		}
	else if(numeroEjercicio == 5)
			{
			System.out.println("Introduce tres numeros");
			int n1= Integer.parseInt (br.readLine());
			int n2= Integer.parseInt (br.readLine());
			int n3= Integer.parseInt (br.readLine());
			
			if ((n1+1 == n2 && n2+1 == n3) || (n3+1==n2 && n2+1 == n1 )) 
			{
				System.out.println("Los numeros si son consecutivos");
			}
			else
			{
				System.out.println("Los numeros no son consecutivos");
			}
			
		}
		else if(numeroEjercicio == 6) 
	{
		System.out.println("Introduce un numero");
		int n1= Integer.parseInt (br.readLine());
		
		if (n1>=-9 && n1<=9)
		{
			System.out.println("El numero tiene una cifra");
		}
		else if (n1>=-99 && n1<=99)
		{
			System.out.println("El numero tiene dos cifras");
		}
		else if (n1 >= -999 && n1<= 999)
		{
			System.out.println("El numero tiene tres cifras");
		}
		else if (n1 >= -9999 && n1<= 9999)
		{
			System.out.println("El numero tiene cuatro cifras");
		}
		else if (n1 >= -99999 && n1<= 99999)
		{
			System.out.println("El numero tiene cinco cifras");
		}
		else if (n1 >= -999999 && n1<= 999999)
		{
			System.out.println("El numero tiene mas de cinco cifras pero no sabria decir cuantas");
		}
	}
		else if (numeroEjercicio == 7) 
		{
			System.out.println("Digame la operacion que quiere realizar: sumar(1), restar(2), multiplicar(3), dividir(4), elevar al cuadrado(5),resolver una ecuacion de segundo grado(6)");
			int operacion = Integer.parseInt (br.readLine());
			
			if (operacion == 1 ) 
			{
				System.out.println("Dime los numeros que quieras sumar");
				int n1 = Integer.parseInt (br.readLine());
				int n2 = Integer.parseInt (br.readLine());
				ResolverOperacion(n1, n2, n1+n2, "+");
			}
			else if (operacion == 2) 
			{
				System.out.println("Dime los numeros que quieras restar");
				int n1 = Integer.parseInt (br.readLine());
				int n2 = Integer.parseInt (br.readLine());
				int resultado = n1-n2;
				System.out.println(n1 + "-" + n2 + "=" + resultado);
			}
			else if (operacion == 3)
			{
				System.out.println("Dime los numeros que quieras multiplicar");
				int n1 = Integer.parseInt (br.readLine());
				int n2 = Integer.parseInt (br.readLine());
				int reultado = n1*n2;
				System.out.println(n1 + "x" + n2 + "=" + reultado);
			}
			else if (operacion == 4)
			{
				System.out.println("Dime los numeros que quieras dividir");
				int n1 = Integer.parseInt (br.readLine());
				int n2 = Integer.parseInt (br.readLine());
				//double resultado = n1%n2; // resto de la division
				double resultado = n1/n2; // resultado de la division
				System.out.println(n1 + "/" + n2 + "=" + resultado);
			}
			else if (operacion == 5)
			{
				System.out.println("Dime el numero que quieres elevar al cuadrado");
				int n1 = Integer.parseInt (br.readLine());
				double resultado = Math.pow(n1,2);
				System.out.println(" El " + n1 + " ^2 es igual a " + resultado);
			}
			else if (operacion == 6)
			{
				System.out.println("A continuacion vamos a resolver ecuaciones de segundo grado");
				System.out.println("Introduce los valores de x^2");
				int a= Integer.parseInt (br.readLine());
				System.out.println("Introduce los valores de x");
				int b= Integer.parseInt (br.readLine());
				System.out.println("Introduce los valores de numero");
				int c= Integer.parseInt (br.readLine());
				double raiz = Math.sqrt((b*b) - (4*a*c));
				System.out.println("El resultado de la raiz es");
				System.out.println(raiz);
				System.out.println("y por lo tanto los resultados son:");
				System.out.println((-b + raiz)/(2*a));
				System.out.println((-b - raiz)/(2*a));
			}
		}
		 else if (numeroEjercicio == 8) 
		 {
			 System.out.println("Hola");
			 int number =0;
			 while (number<10) 
			 {
				 
				 if (number%2 == 0)
				 {
					 System.out.println(number);
				 }
				 else 
				 {
					 System.out.println("El siguente numero es impar por lo tanto no se muestra");
				 }
				 number = number + 1;
			 }
		 }
		 else if (numeroEjercicio == 9)
		 {
			 String userSay = br.readLine();
			 while (userSay.equals("Adios")) 
			 {
				 System.out.println("Hola");
				 userSay = br.readLine();
			 }
			 
		 }
		
		
		
		
		
		/* Crear una calculadora la cual tengua las siguentes opciones: elevar al cuadrado(1)
			 sumar ,restar,multiplicar y dividir y que resuelva ecuaciones de segundo grado*/
			 
			
			//switch()
			//Math.pow(numero,potencia);
		}
	
		public static void ResolverOperacion (int num1, int num2, double resultado, String simbolo) 
		{
			System.out.println(num1 + simbolo + num2 + "=" + resultado);

		}
	}


package eclipsegit;
import java.util.Scanner;
public class calculadoraSimple {
	
	//Hago una funcion
	public static double sumar(double a, double b) {
		//Retorno una operacion matematica
		return a + b;
	}
	//Hago una funcion
		public static double restar(double a, double b) {
			//Retorno una operacion matematica
			return a - b;
	}
		//Hago una funcion
		public static double multiplicar(double a, double b ) {
			//Retorno una operacion matematica
			return a*b;
	}
		//Hago una funcion principal
		public static void main(String[] args) {
		
			
			//Creo un scanner
			Scanner scanner = new Scanner(System.in);
		
			//Hago dos sysos
			System.out.println("Calculadora Simple:");
			System.out.print("Introduce el primer número: ");
		
			double numero1 = scanner.nextDouble();      
		
			//Hago un syso
			System.out.print("Introduce el segundo número: ");
		
			//Llamo a las funciones
			double numero2 = scanner.nextDouble();      
			double resultadoSuma = sumar(numero1, numero2);
			double resultadoResta = restar(numero1, numero2);
			double resultadomult = multiplicar(numero1, numero2);
		
			//Enseño por pantalla los resultados de las operaciones
			System.out.println("Resultado de la suma: " + resultadoSuma);
		
			System.out.println("Resultado de la resta: " + resultadoResta);
			
			System.out.println("Resultado de la multiplicacion: " + resultadomult);
			scanner.close();
			
			//Hay suma, resta y multiplicacion
			//Codigo modificado con exito por un colaborador en github
		}
}

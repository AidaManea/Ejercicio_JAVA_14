package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		

	}

	public static int menu(Scanner sc)
	{
		int opcion;
		
		do
		{
			System.out.println("1 -- Agregar productos");
			System.out.println("2 -- Listar productos");
			System.out.println("3 -- Buscar un producto");
			System.out.println("4 -- Actualizar stock");
			System.out.println("5 -- Eliminar un producto");
			System.out.println("6 -- Salir");
		
			System.out.println("Opcion: ");
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e)
			{
				opcion= 0;
			}
			
			sc.nextLine();
			if (opcion<1 || opcion>6)
				System.out.println("Opcion incorrecta");
			
		}while (opcion<1 || opcion>6);
		return opcion;
	}
}

import java.util.Scanner;

public class Pila {
	
	public static void Pila() 
	{
		int z = 0;
		int i = 0;
		int[] pila = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		while(z!=1) 
		{
			System.out.println("¿Que acción quieres ejecutar?");
			
			if(i<10)
			{
				System.out.println("A = Añadir");
			}
			
			System.out.println("I = Imprimir");
			
			if(i>0) 
			{
				System.out.println("Q = Quitar");
			}
			
			System.out.println("C = Cerrar");
			
			String aux = entrada.nextLine();
			
			if(aux.equals("A") && i<10) 
			{
				System.out.println("Introduce el valor");
				try 
				{
					pila[i]=Integer.parseInt(entrada.nextLine());
				}
				catch(Exception e) 
				{
					System.out.println("Se ha introducido un valor no válido, por favor vuelva a intentarlo con un valor númerico entero");
					System.exit(0);
				}
				System.out.println("Valor Introducido \n");
				i++;
				
			}
			else if(aux.equals("I")) 
			{
				System.out.println("Pila:");
				for(int a=0; a<i; a++) 
				{
					System.out.println(pila[a]);
				}
				System.out.println("");
			}
			else if(aux.equals("Q") && i>0) 
			{
				int x = i;
				if(x>9) 
				{
					x--;
				}
				pila[x]=0;
				System.out.println("Valor Borrado \n");
				i--;
			}
			else if(aux.equals("C")) 
			{
				z=1;
			}
			else 
			{
				System.out.println("Valor no válido \n");
			}
		}
	}

}

import java.util.Scanner;

public class Cola {
	
	public static void Cola() 
	{
		int z = 0;
		int i = 0;
		int[] cola = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		while(z!=1) 
		{
			System.out.println("�Que acci�n quieres ejecutar?");
			
			if(i<10)
			{
				System.out.println("A = A�adir");
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
					cola[i]=Integer.parseInt(entrada.nextLine());
				}
				catch(Exception e) 
				{
					System.out.println("Se ha introducido un valor no v�lido, por favor vuelva a intentarlo con un valor n�merico entero");
					System.exit(0);
				}
				System.out.println("Valor Introducido \n");
				i++;
				
			}
			else if(aux.equals("I")) 
			{
				System.out.println("Cola:");
				for(int a=0; a<i; a++) 
				{
					System.out.println(cola[a]);
				}
				System.out.println("");
			}
			else if(aux.equals("Q") && i>0) 
			{
				cola[0]=0;
				for(int x=0;x<i-1;x++) 
				{
					cola[x]=cola[x+1];
				}
				System.out.println("Valor Borrado \n");
				i--;
			}
			else if(aux.equals("C")) 
			{
				z=1;
			}
			else 
			{
				System.out.println("Valor no v�lido \n");
			}
		}
	}

}

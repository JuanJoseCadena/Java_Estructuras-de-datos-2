import java.util.Scanner;

public class Arbol {
	
	static class Nodo
	{
		public Nodo padre;
		public Nodo der;
		public Nodo izq;
		public int indice;
		public Object valor;
		
		
		public Nodo(int index) 
		{
			indice=index;
			padre=null;
			der=null;
			izq=null;
			valor=null;
		}
		
	}
	
	Nodo raiz;
	
	public Arbol() 
	{
		raiz=null;
	}
	
	public void Insert(int i, Object dato)
	{
		Nodo n = new Nodo(i);
		n.valor = dato;
		
		if(raiz==null) 
		{
			raiz = n;
		}
		else
		{
			Nodo aux = raiz;
			while(aux!=null) 
			{
				n.padre = aux;
				if(n.indice >= aux.indice) 
				{
					aux = aux.der;
				}
				else 
				{
					aux = aux.izq;
				}
			}
			
			if(n.indice < n.padre.indice) 
			{
				n.padre.izq = n;
			}
			else 
			{
				n.padre.der = n;
			}
		}
		
	}
	
	public void Read(Nodo n) 
	{
		if(n!=null) 
		{
			Read(n.izq);
			System.out.println("Índice: " + n.indice);
			System.out.println("Dato: " + n.valor + "\n");
			Read(n.der);
		}
	}
	
	public static void Arbol() 
	{
		Arbol tree = new Arbol();
		
		tree.Insert(5, "Rojo");
		tree.Insert(7, "Azul");
		tree.Insert(2, "Verde");
		tree.Insert(4, "Amarillo");
		tree.Insert(6, "Naranja");
		tree.Insert(1, "Blanco");
		tree.Insert(8, "Morado");
		tree.Insert(3, "Rosado");
		tree.Insert(9, "Negro");
		
		int z = 0;
		
		while(z!=1) 
		{
			System.out.println("¿De que manera quiere imprimir el árbol?");
			System.out.println("D = Derecha");
			System.out.println("I = Izquierda");
			System.out.println("R = Nodo Raíz");
			System.out.println("T = Todo");
			System.out.println("C = Cerrar Programa");
			
			Scanner in = new Scanner(System.in);
			String cad = in.nextLine();
			System.out.println("");
			
			if(cad.equals("D")) 
			{
				tree.Read(tree.raiz.der);
			}
			else if(cad.equals("I")) 
			{
				tree.Read(tree.raiz.izq);
			}
			else if(cad.equals("T")) 
			{
				tree.Read(tree.raiz);
			}
			else if(cad.equals("R")) 
			{
				System.out.println("Índice: " + tree.raiz.indice);
				System.out.println("Dato: " + tree.raiz.valor + "\n");
			}
			else if(cad.equals("C")) 
			{
				z = 1;
			}
			else 
			{
				System.out.println("Valor no válido \n");
			}
			
		}
	}

}

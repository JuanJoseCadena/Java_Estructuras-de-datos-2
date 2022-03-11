import java.util.HashMap;

public class Grafo {
	
	HashMap<Character,HashMap<Character, Integer>> Grafo;
	
	public Grafo() 
	{
		Grafo = new HashMap<Character,HashMap<Character, Integer>>();
	}
	
	public void Crear(char vert, HashMap<Character, Integer> rel) 
	{
		Grafo.put(vert, rel);
	}
	
	public HashMap<Character, Integer> Leer(char vert)
	{
		return Grafo.get(vert);
	}
	
	public static void Grafo() 
	{
		Grafo graph = new Grafo();
		char[] vertices = new char[10];
		vertices[0] = 'a';
		vertices[1] = 'b';
		vertices[2] = 'c';
		vertices[3] = 'd';
		vertices[4] = 'e';
		vertices[5] = 'f';
		vertices[6] = 'g';
		vertices[7] = 'h';
		vertices[8] = 'i';
		vertices[9] = 'j';
		
		HashMap<Character, Integer> aux = new HashMap<Character, Integer>();
		aux.put('e', 5);
		aux.put('c', 3);
		graph.Crear('a', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('i', 9);
		aux.put('h', 4);
		aux.put('d', 2);
		graph.Crear('b', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('j', 1);
		aux.put('h', 6);
		graph.Crear('c', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('b', 4);
		aux.put('e', 6);
		aux.put('h', 2);
		aux.put('c', 9);
		graph.Crear('d', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('a', 1);
		aux.put('h', 6);
		aux.put('f', 4);
		graph.Crear('e', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('b', 3);
		graph.Crear('f', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('i', 8);
		aux.put('d', 5);
		graph.Crear('g', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('f', 6);
		aux.put('j', 2);
		graph.Crear('h', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('a', 6);
		aux.put('c', 2);
		aux.put('e', 1);
		graph.Crear('i', aux);
		
		aux = new HashMap<Character, Integer>();
		aux.put('i', 2);
		graph.Crear('j', aux);
		
		System.out.println("Relaciones:");
		
		for(int i=0;i<vertices.length;i++)
		{
			System.out.println(vertices[i] + " --> " + graph.Leer(vertices[i]));
		}
	}

}

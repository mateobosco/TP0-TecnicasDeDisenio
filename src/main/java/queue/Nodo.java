package queue;


public class Nodo {
	
	private Nodo anterior;
	private Object dato;
	
	public Nodo(Object dato, Nodo anterior){
		this.dato = dato;
		this.anterior = anterior;
	}
	
	public Nodo getAnterior(){
		return anterior;
	}
	
	public Object getDato(){
		return dato;
	}
	
	public int getCantidadHijos(){
		return 1 + this.anterior.getCantidadHijos();
	}
	
	public void conectarNodo(Nodo nodo){
		this.anterior = nodo;
	}
	
}

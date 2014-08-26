package queue;

public class Cola implements Queue{
	
	private Nodo ultimoNodo;
	private NodoBase primerNodo;
	
	public Cola(){
		this.primerNodo = new NodoBase();
		this.ultimoNodo = this.primerNodo;
	}

	public boolean isEmpty() {
		return (this.size() == 0);
	}

	public int size() {
		return this.ultimoNodo.getCantidadHijos();
	}

	public void add(Object item) {
		this.ultimoNodo = this.primerNodo.conectarNodo(item, this.ultimoNodo);		
		
	}

	public Object top() {
		return this.ultimoNodo.getDato();
	}

	public void remove() {
		this.ultimoNodo = this.ultimoNodo.getAnterior();
	}

}

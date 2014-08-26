package queue;

public class NodoBase extends Nodo{
	
	private Nodo proximo;
	
	public NodoBase(){
		super(null,null);
	}
	
	public int getCantidadHijos(){
		return 0;
	}
	
	public Object getObject(){
		throw new AssertionError("Cola vacia");
	}
	
	public Nodo getAnterior(){
		throw new AssertionError("Cola vacia");
	}
	
	public Nodo conectarNodo(Object dato, Nodo ultimoNodo) {
		 Nodo node = new Nodo(dato, this);
		 if (ultimoNodo != this){
			 this.proximo.conectarNodo(node);
			 this.proximo = node;
			 return ultimoNodo;
		 }
		 this.proximo = node;
		 return this.proximo;
	}

}

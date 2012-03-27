package es.juntadeandalucia.assda.soporte.web;

import org.richfaces.model.TreeNodeImpl;

/**
 * 
 * @author Sadiel(DAVID.GOMEZ)
 * 
 * @param <T>
 *            El tipo del nodo que contiene el árbol
 */
public class ArbolNodo<T> extends TreeNodeImpl {
	private T dato;
	private TipoNodoArbol tipo;

	/**
	 * Cosntruye un nodo de árbol indicado el dato y identificando el valor que
	 * indica si es un nodo hoja.
	 * 
	 * @param dato
	 *            El nodo
	 * @param tipo
	 *            El valor que indica si un nodo es hoja
	 */
	public ArbolNodo(final T dato, final TipoNodoArbol tipo) {
		super(tipo.equals(TipoNodoArbol.Hoja));
		this.dato = dato;
		this.tipo = tipo;
	}

	/**
	 * Obtiene el valor del codo
	 * 
	 * @return T
	 */
	public T getDato() {
		return dato;
	}

	/**
	 * Modifica el nodo.
	 * 
	 * @param dato
	 *            nuevo valor del nodo
	 * 
	 */
	public void setDato(final T dato) {
		this.dato = dato;
	}

	/**
	 * Obtiene el tipo del nodo.
	 * 
	 * @return TipoNodoArbol
	 */
	public TipoNodoArbol getTipo() {
		return tipo;
	}

	/**
	 * Modifica el tipo del nodo.
	 * 
	 * @param tipo
	 *            nuevo tipo del nodo.
	 */
	public void setTipo(final TipoNodoArbol tipo) {
		this.tipo = tipo;
	}

	/**
	 * Indica si un nodo es hoja o no.
	 */
	@Override
	public boolean isLeaf() {
		return this.tipo.equals(TipoNodoArbol.Hoja);
	}

	/**
	 * Los posibles tipos de un nodo.
	 * 
	 * @author Sadiel(DAVID.GOMEZ)
	 * 
	 */
	public enum TipoNodoArbol {
		Nodo, Hoja, Raiz
	}

}

package es.juntadeandalucia.assda.soporte.web;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import org.richfaces.model.TreeNode;
import org.richfaces.model.TreeNodeImpl;

import es.juntadeandalucia.assda.soporte.web.ArbolNodo.TipoNodoArbol;

/**
 * Clase MenuBean.
 * 
 * @author Sadiel(DAVID.GOMEZ)
 */
@Named
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// private SpMenuOpcion opcionSeleccionada;

	/**
	 * Obtiene el menú de opciones en forma de árbol.
	 * 
	 * @return TreeNode
	 */
	@Produces
	@Named
	public TreeNode getMenuArbol() {
		return creacionArbol();
	}

	private TreeNode creacionArbol() {
		// Debido a la implementación todo los nodos deben conlgar de un unico
		// nodo raiz
		TreeNode nodoOrigen = new TreeNodeImpl();
		String opcionRaiz = "RAIZ";
		ArbolNodo<String> raiz = new ArbolNodo<String>(opcionRaiz, TipoNodoArbol.Raiz);
		raiz.addChild("1_", new ArbolNodo<String>("Opcion 1", TipoNodoArbol.Hoja));
		raiz.addChild("2_", new ArbolNodo<String>("Opcion 2", TipoNodoArbol.Hoja));
		raiz.addChild("3_", new ArbolNodo<String>("Opcion 3", TipoNodoArbol.Hoja));
		nodoOrigen.addChild("0_", raiz);
		return nodoOrigen;
	}

}

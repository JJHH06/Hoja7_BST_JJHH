/**
 * 
 * @author Jose Hurtarte 19707
 * @author // (c) 1998, 2001 duane a. bailey
 * @param <K> tipo de variable de la llave
 * @param <V> tipo de variable de valor
 */

//al final modifique todo el codigo, pero el libro sirvio de inspiracion

public class BinarySearchTree<K extends Comparable<K>,V> {

	private ComparableAssociation<K,V> node;  //palabra y definicion
	private BinarySearchTree<K,V> right;
	private BinarySearchTree<K,V> left;
	
	
	
	
	
	/**
	 * agrega un valor al arbol binario de forma ordenada
	 * @param argument llave que servira para ordenar e ingresar como parametro
	 * @param association valor asosiado de la llave la cual se insertara en un ComparableAssosiation
	 */
    public void add(K argument, V association)
    {
    	if(node == null) {
    		node = new ComparableAssociation<K,V>(argument, association);
    		right = new BinarySearchTree<K,V>();
    		left = new BinarySearchTree<K,V>();
    		
    	}
    	else {
    		if(argument.compareTo(node.getKey())<0){
    			right.add(argument, association);
    		}
    		else {
    			left.add(argument, association);
    		}
    	}
    	
       
    }
    
    
	
	/**
	 * busca la llave en el arbol
	 * @param keyValue 
	 * @return el valor asosiado a la llave buscada y null si no existe
	 */
    public V locate(K keyValue)   
    {
    	
        // found at root: done
        if (node!=null && node.getKey().equals(keyValue))
        	return node.getValue();
        // look left if less-than, right if greater-than
        if (node!=null &&keyValue.compareTo(node.getKey()) < 0)
        {
        	if(right!=null) {
        		return right.locate(keyValue);  // se va a la derecha
        	}
        	else {
        		return null;  //por si no lo encuentra en la derecha
        	}
        } 
        if(left != null) {
        	
        
        	return left.locate(keyValue);
        	
        }
        
            return null;   //por si no encuentra en la izquierda
        
    }
    
    
    
    
    
    
	
	
	
	
	
}

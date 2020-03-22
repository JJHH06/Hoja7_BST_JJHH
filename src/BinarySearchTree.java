
public class BinarySearchTree<K extends Comparable<K>,V> {

	private ComparableAssociation<K,V> node;  //palabra y definicion
	private BinarySearchTree<K,V> right;
	private BinarySearchTree<K,V> left;
	
	
	
	
	
	/**
     * Add a (possibly duplicate) value to binary search tree
     *
     * @post Adds a value to binary search tree
     * 
     * @param val A reference to non-null object
     */
    public void add(K argument, V association)
    {
    	if(node == null) {
    		node = new ComparableAssociation<K,V>(argument, association);
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
     * @pre 
     * @post 
     */
    public V locate(K keyValue)   
    {
    	
        // found at root: done
        if (node.getKey().equals(keyValue))
        	return node.getValue();
        // look left if less-than, right if greater-than
        if (keyValue.compareTo(node.getKey()) < 0)
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

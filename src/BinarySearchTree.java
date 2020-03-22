
public class BinarySearchTree<K extends Comparable<K>,V> {

	private ComparableAssociation<K,V> node;  //palabra y definicion
	private BinarySearchTree<K,V> right;
	private BinarySearchTree<K,V> left;
	
	
	
	/**
     * @pre 
     * @post 
     */
    public V locate(K keyValue)     //creo que va a dar error
    {
    	V child;
        // found at root: done
        if (node.getKey().equals(keyValue)) return node.getValue();
        // look left if less-than, right if greater-than
        if (keyValue.compareTo(node.getKey()) < 0)
        {
            child = right.locate(keyValue);  // se va a la derecha
        } 
        else {
            child = left.locate(keyValue);
        }
        // no child there: not in tree, return this node,
        
        if (child == null) {
            return node.getValue();
        } else {
            return child;
        }
    }
    
    
    
    
    
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
    		node = new ComparableAssociation<K, V>(argument, association);
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
	
	
	
	
	
}


public class BinarySearchTree<K extends Comparable<K>,V> {

	private ComparableAssociation<K,V> node;  //palabra y definicion
	private BinarySearchTree<K,V> right;
	private BinarySearchTree<K,V> left;
	
	
	
	/**
     * @pre root and value are non-null
     * @post returned: 1 - existing tree node with the desired value, or
     *                 2 - the node to which value should be added
     */
    public V locate(K keyValue)
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
	
	
	
	
	
}

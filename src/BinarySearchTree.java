
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
    public void add(E value)
    {
        BinaryTree<E> newNode = new BinaryTree<E>(value,EMPTY,EMPTY);

        // add value to binary search tree 
        // if there's no root, create value at root
        if (root.isEmpty())
        {
            root = newNode;
        } else {
            BinaryTree<E> insertLocation = locate(root,value);
            E nodeValue = insertLocation.value();
            // The location returned is the successor or predecessor
            // of the to-be-inserted value
            if (ordering.compare(nodeValue,value) < 0) {
                insertLocation.setRight(newNode);
            } else {
                if (!insertLocation.left().isEmpty()) {
                    // if value is in tree, we insert just before
                    predecessor(insertLocation).setRight(newNode);
                } else {
                    insertLocation.setLeft(newNode);
                }
            }
        }
        count++;
    }
	
	
	
	
	
}

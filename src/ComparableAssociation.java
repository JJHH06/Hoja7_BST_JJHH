// A class for structuring associations that may be compared.
// (c) 1998, 2001 duane a. bailey
//package structure5;
import java.util.Map;
/**
 * A class implementing a comparable key-value pair.  This class associates an 
 * immutable key with a mutable value.  Useful for many other structures.
 * Example usage:
 * <P>
 * To print out a list of professors sorted by the number of classes
 * a particular student took from each, we could use the following:
 * <pre>
 * public static void main(String[] argv){
 *      //initialize a new fib heap
 *      FibHeap classesTaken = new FibHeap();
 *
 *      //add professors and classes taken to a heap
 *      classesTaken.add(new {@link #ComparableAssociation(Comparable, Object) ComparableAssociation(new Integer(5), "Andrea")});
 *      classesTaken.add(new ComparableAssociation(new Integer(1), "Barbara"));
 *      classesTaken.add(new ComparableAssociation(new Integer(3), "Bill"));
 *      classesTaken.add(new ComparableAssociation(new Integer(2), "Duane"));   
 *      classesTaken.add(new ComparableAssociation(new Integer(1), "Tom"));     
 *
 *      //print out classes taken
 *      while(!classesTaken.isEmpty()){
 *          ComparableAssociation p = (ComparableAssociation)classesTaken.remove();
 *          System.out.println(p.{@link #getValue() getValue()} + " is " + p.{@link #getKey() getKey()} + " years old.");
 *      }
 * }
 * </pre>  
 * @version $Id: ComparableAssociation.java 34 2007-08-09 14:43:44Z bailey $
 * @author, 2001 duane a. bailey
 */
public class ComparableAssociation<K extends Comparable<K>, V> implements Map.Entry<K, V>{
    private K key;
    private V value;
    
    
    
    public int compareTo(K comparingKey) {  //es para comparar las llaves 
        return key.compareTo(comparingKey);
    }
    
    public ComparableAssociation(K k, V v) {
		// TODO Auto-generated constructor stub
    	
    	this.value = v;
    	
    	this.key = key;
	}
    
    
    
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public V setValue(V value) {  //este no se usara ahora ya que el programa no modificara el diccionario
		this.value = value;
		// TODO Auto-generated method stub
		return value;
	}
}

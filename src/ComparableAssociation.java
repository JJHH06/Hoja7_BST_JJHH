/**
 * 
 * @author Jose Hurtarte 19707
 * @author // (c) 1998, 2001 duane a. bailey
 * @param <K> tipo de variable de la llave
 * @param <V> tipo de variable de valor
 */

//al final modifique todo el codigo, pero el libro sirvio de inspiracion

import java.util.Map;

public class ComparableAssociation<K extends Comparable<K>, V> implements Map.Entry<K, V>{
    private K key;
    private V value;
    
    
    
/**
 * constructor de nodo asosiativo
 * @param k valor de llave
 * @param v valor asosiado a la llave
 */
    public ComparableAssociation(K k, V v) {
		// TODO Auto-generated constructor stub
    	
    	this.value = v;
    	
    	this.key = k;
	}
    
    /**
     * 
     * @param comparingKey
     * @return resultado int del compareTo
     */
    public int compareTo(K comparingKey) {  //es para comparar las llaves 
        return key.compareTo(comparingKey);
    }
    
    
    /**
     * obtiene la llave
     */
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	/**
	 * obtiene el valor adjunto a la llave
	 */
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	/**
	 * hace un set al valor
	 */
	@Override
	public V setValue(V value) {  //este no se usara ahora ya que el programa no modificara el diccionario
		this.value = value;
		// TODO Auto-generated method stub
		return value;
	}
}

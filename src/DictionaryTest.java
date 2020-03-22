import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DictionaryTest {

	/**
	 * test de insertar palabra
	 */
	@Test
	void testInsert() {
		BinarySearchTree<String,String> diccionario = new BinarySearchTree<String,String>();
		diccionario.add("run", "correr");
		
		assertEquals("correr", diccionario.locate("run"));
	}
	
	/**
	 * test de buscar palabra
	 */
	@Test
	void testLocate() {
		BinarySearchTree<String,String> diccionario = new BinarySearchTree<String,String>();
		diccionario.add("nine", "9");
		diccionario.add("plus", "+");
		diccionario.add("ten", "10");
		diccionario.add("twentyone", "21"); //Oldschool meme reference 
		
		
		
		assertEquals("21", diccionario.locate("twentyone"));
	}

}

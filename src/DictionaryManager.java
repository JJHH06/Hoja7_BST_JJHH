import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 * 
 * @author Jose Hurtarte 19707
 *
 */
public class DictionaryManager{  //se utilizo esta clase para probar elevar el nivel de abstraccion un poquito y no tener sobrecargada la Main

	
	private BinarySearchTree<String,String> diccionario = new BinarySearchTree<String,String>(); 
	
	/**
	 * llena el diccionario/arbol
	 */
	public void fillDictionary() {
		String barra = File.separator;
		String dir = System.getProperty("user.dir");
		File archivo = new File (dir + barra + "dictionary.txt.txt");
		FileReader fr;
		String linea = "";

		try {
			fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String[] listaLinea = null;

			while((linea = br.readLine()) != null){
				listaLinea = linea.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(" ", "").split(",");
				diccionario.add(listaLinea[0], listaLinea[1]);
				
			}
		}
		
		catch (Exception e) {
		}

	}
	/**
	 * traduce la frase
	 * @return la frase ya traducida
	 */
	public String translation() {
		
		
		String barra = File.separator;
		String dir = System.getProperty("user.dir");
		File archivo = new File (dir + barra + "datos.txt.txt");
		FileReader fr;
		String linea = "";
		String listaLinea = "";
		try {
		fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		
		
		while((linea = br.readLine()) != null){
		listaLinea = linea;
		}
		}
		catch (Exception e) {
		}
		
		
		
		listaLinea = listaLinea.replaceAll("\\.", "");
		String[] words = listaLinea.split(" ");
		String resultado = "";
		String word = "";
		for (String palabra : words) {
			word = diccionario.locate(palabra);
			if(word != null) {
				resultado += " "+ word.toLowerCase();
				
			}
			else if(word == null) {
				resultado += "*"+palabra+"*";
			}
			
		}
		return resultado+".";
		
		
	}
	
	

}

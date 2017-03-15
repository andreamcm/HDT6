//Importamos Set de las clases de java y HashSet una implementaci�n.
import java.util.HashSet;
import java.util.Set;

/**
 * @author josePablo y Andrea Cordon
 * @version 1.0
 * @since 12-03-2017
 * Implementaci�n hashSet de la interfaz Set
 */


public class hashSet<Desarrollador> implements Iset<Desarrollador> {
	/**
	 * Atributos de la clase hashSet
	 */

	Set<Desarrollador> desarrolladorJava;
	Set<Desarrollador> desarrolladorIOS;
	Set<Desarrollador> desarrolladorAndroid;
	Set valores;

	/**
	 * Constructor de la clase hashSet
	 */
	public hashSet(){
		desarrolladores = new HashSet<Desarrollador>();
	}

	public void setValores (Set val){
		this.valores = val;
	}


	@Override
	public boolean Agregar(Desarrollador desa) {
		if(desarrolladoresJava.add(desa)==true)
			return true;
		else
			return false;
			if (desarrolladorIOS.add(desa)==true)
				return true;
			else
				return false;
				if (desarrolladorAndroid.add(desa)==true)
					return true;
				else
					return false;
	}

	@Override
	public boolean contiene(Desarrollador desarrolador) {
		if(desarrolladorJava.contains(desarrolador)==true)
			return true;
		else
				return false;
			if(desarrolladorIOS.contains(desarrolador)==true)
				return true;
			else
				return false;
				if(desarrolladorAndroid.contains(desarrolador)==true)
					return true;
				else
					return false;
	}

	@Override
	public boolean contieneTodos(Set valores) {
		if (desarrolladorJava.containsAll(valores)==true)
			return true;
		else
			return false;
			if (desarrolladorIOS.containsAll(valores)==true)
				return true;
			else
				return false;
				if(desarrolladorAndroid.containsAll(valores)==true)
					return true;
				else
					return false;
	}

	@Override
	public boolean quitar(Object o) {
		if (desarrolladorJava.remove(o)==true)
			return true;
		else
			return false;
			if(desarrolladorIOS.remove(o)==true)
				return true;
			else
				return false;
				if(desarrolladorAndroid.remove(o)==true)
					return true;
				else
					return false;
	}

}

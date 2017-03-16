//Importamos Set de las clases de java y HashSet una implementaci�n.
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author josePablo y Andrea Cordon
 * @version 1.0
 * @since 12-03-2017
 * Implementaci�n hashSet de la interfaz Set
 */


public class hashSet implements Iset<Desarrollador>,Set {
	/**
	 * Atributos de la clase hashSet
	 */

	Set<Desarrollador> desarrolladorJava;

	/**
	 * Constructor de la clase hashSet
	 */
	public hashSet(){
		desarrolladorJava = new HashSet<Desarrollador>();
	}


	@Override
	public boolean Agregar(Desarrollador desa) {
		if(desarrolladorJava.add(desa)==true)
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
	}

	@Override
	public boolean contieneTodos(Set valores) {
		if (desarrolladorJava.containsAll(valores)==true)
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
	}


	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public java.util.Iterator<String> Iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

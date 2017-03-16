/**
 * @author josePablo y Andrea Cord�n
 * @version 1.0
 * @since 12-03-2017
 * Factory que decidir� que implementaci�n usar de acuerdo a lo que decida el usuario
 */

public class factorySet<E>{

	public Iset<Desarrollador> getImplementacion(int n){
		if(n==1)
			return new hashSet<E>();
		else if (n==2)
			return new treeSet<E>();
		else if (n==3)
			return new linkedhashSet<E>();
		else
		return null;
	}

}

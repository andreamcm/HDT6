/**
 * @author josePablo y Andrea Cordón
 * @version 1.0
 * @since 12-03-2017
 * Factory que decidirá que implementación usar de acuerdo a lo que decida el usuario
 */

public class factorySet{
	
	public Iset<Desarrollador> getImplementacion(int n){
		if(n==1)
			return new hashSet();
		else if (n==2)
			return new treeSet();
		else if (n==3)
			return new linkedhashSet();
		else
		return null;
	}

}
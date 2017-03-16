import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author josePablo y Andrea Cord�n
 * @version 1.0
 * @param <E>
 * @since 12-03-2017
 * Factory que decidir� que implementaci�n usar de acuerdo a lo que decida el usuario
 */

public class factorySet{

	public Set getImplementacion(int n){
		if(n==1)
			return new HashSet();
		else if (n==2)
			return new TreeSet();
		else if (n==3)
			return new LinkedHashSet();
		else
		return null;
	}

}

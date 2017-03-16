import java.util.Iterator;

/**
 * @author josePablo y Andrea Cordon
 * @version 1.0
 * @since 12-03-2017
 * Clase que define a un desarrolador
 */

public class Controlador {
	
	public Object relacionTres(Iset<Desarrollador> Java, Iset<Desarrollador> iOS, Iset<Desarrollador> Android){
		Object respuesta = null;
		Iterator<String> iterator1 = Java.Iterator();
		while(iterator1.hasNext()==true){
			Object elementos1 = iterator1.hasNext();
			Iterator<String> iterator2 = iOS.Iterator();
			while(iterator2.hasNext()==true){
				Object elementos2 = iterator2.hasNext();
				if (elementos1.equals(elementos2)){
				Iterator<String> iterator3 = Android.Iterator();
				while (iterator3.hasNext()==true){
					Object elementos3 = iterator3.hasNext();
					if (elementos1.equals(elementos3)){
						respuesta = elementos1;

					}
				}
			}
		 }
	  }
		return respuesta;
  }

}

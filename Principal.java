import java.util.Scanner;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al programa de desarrolladores");
		System.out.println("Seleccione la implementacion que desea utilizar: ");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		int opcion = teclado.nextInt();

		Iset<Desarrollador>  setJava;
		Iset<Desarrollador>  setIOS;
		Iset<Desarrollador>  setAndroid;

		factorySet factory = new factorySet();

		setJava = factory.getImplementacion(opcion);
		setAndroid = factory.getImplementacion(opcion);
		setIOS = factory.getImplementacion(opcion);

		System.out.println("¿A cuántos desarrolladores desea agregar?: ");
		int cantidad = teclado.nextInt();

		while (cantidad != 0){
		System.out.println("Ingrese el nombre del desarrollador al que desea agregar: ");
		String nombre = teclado.nextLine();
		System.out.println("¿En qué se especializa este desarrollador?: ");
		System.out.println("1. Java");
		System.out.println("2. IOS");
		System.out.println("3. Android");
		int especialidad = teclado.nextInt();
		System.out.println("¿Desea agregar otra especialidad a este desarrollador?: ");
		String respuesta = teclado.nextLine();
		if (respuesta == "si"){
			System.out.println("¿En qué se especializa este desarrollador?: ");
			System.out.println("1. Java");
			System.out.println("2. IOS");
			System.out.println("3. Android");
		}
		cantidad--;
		}

		// Funcion para mostrar la interseccion entre los tres conjuntos.
		public void interseccion{
			Iterator<String> iterator1 = setJava.Iterator();
			while(iterator1.hasNext()){
				Object elementos1 = iterator1.hasNext();
				Iterator<String> iterator2 = setIOS.Iterator();
				while(iterator2.hasNext()){
					Object elementos2 = iterator2.hasNext();
					if (elementos1.equals(elementos2)){
					Iterator<String> iterator3 = setAndroid.Iterator();
					while (iterator3.hasNext()){
						Object elementos3 = iterator3.hasNext();
						if (elementos1.equals(elementos3)){
							System.out.print(elementos1);

						}
					}

					}

				}
				}
			}

		// Funcion para mostrar a los que son de Java, pero no de Android.
		public void javaNAndroid(){
			Iterator<String> iterator1 = setJava.Iterator();
			while(iterator1.hasNext()){
				Object elementos1 = iterator1.hasNext();
				Iterator<String> iterator2 = setAndroid.Iterator();
				boolean existe = false;
				while(iterator2.hasNext()){
					Object elementos2 = iterator2.next();
					if(elementos1.equals(elementos2)){
						existe = true;
					}
					if(!existe){
						System.out.println(existe);
					}
					}
			}
		}

		// Funcion para mostrar los que son de Android e IOS, pero no de Java
		public void androidIOSNJava(){
			Iterator<String> iterator1 = setIOS.Iterator();
			while(iterator1.hasNext()){
				Object elementos1 = iterator1.next();
				Iterator<String> iterator2 = setAndroid.Iterator();
				while(iterator2.hasNext()){
					Object elementos2 = iterator2.next();
					if (elementos1.equals(elementos2)){
						boolean existe = false;
						Iterator<String> iterator3 = setJava.Iterator();
						while(iterator3.hasNext()){
							Object elementos3 = iterator3.next();
							if(elementos1.equals(elementos3)){
								existe = true;
							}
							if (!existe){
								System.out.print(elementos1);
							}
						}
					}
				}
			}

		}

		// Funcion para mostrar si el conjunto de Java es subconjunto de Android
		public void JavaSubAndroid(){

		}


}
}

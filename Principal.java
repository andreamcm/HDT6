import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	
	private static Set<String> setJava;
	private static Desarrollador desarrollador;
	private static ArrayList<String> capacidadesDesa = new ArrayList<String>();
	private static Set<String> setIOS;
	private static Set<String> setAndroid;
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al programa de desarrolladores");
		System.out.println("Seleccione la implementacion que desea utilizar: ");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		int opcion = teclado.nextInt();



		factorySet factory = new factorySet();
		setJava = factory.getImplementacion(opcion);
		setAndroid = factory.getImplementacion(opcion);
		setIOS = factory.getImplementacion(opcion);



		System.out.println("¿A cuántos desarrolladores desea agregar?: ");
		int cantidad = teclado.nextInt();

		/**
		 * Existe un error que no pudimos debuggear donde al ingresar m�s de un desarrollador 
		 * al ingresar el segundo nombre debe escribirse dos veces
		 */
		while (cantidad != 0){
		System.out.println("Ingrese el nombre del desarrollador al que desea agregar: ");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		System.out.println("¿En qué se especializa este desarrollador?: ");
		System.out.println("1. Java");
		System.out.println("2. IOS");
		System.out.println("3. Android");
		int especialidad = teclado.nextInt();
		
		if(especialidad==1){
			capacidadesDesa.add("Java");
			desarrollador = new Desarrollador(nombre,capacidadesDesa);
			setJava.add(desarrollador.getNombre());
		}
		else if (especialidad ==2){
			capacidadesDesa.add("IOS");
			desarrollador = new Desarrollador(nombre,capacidadesDesa);
			setIOS.add(desarrollador.getNombre());
		}
		else{
			capacidadesDesa.add("Android");
			desarrollador = new Desarrollador(nombre,capacidadesDesa);
			setAndroid.add(desarrollador.getNombre());
		}
		
		System.out.println("¿Desea agregar otra especialidad a este desarrollador?: ");
		teclado.nextLine();
		String respuesta = teclado.nextLine();
		int cont = 0;
		
		while (respuesta.equals("si") && cont < 2){
			cont++;
			System.out.println("¿En qué se especializa este desarrollador?: ");
			System.out.println("1. Java");
			System.out.println("2. IOS");
			System.out.println("3. Android");
			especialidad = teclado.nextInt();
			
			if(especialidad==1){
				capacidadesDesa.add("Java");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setJava.add(desarrollador.getNombre());
			}
			else if (especialidad ==2){
				capacidadesDesa.add("IOS");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setIOS.add(desarrollador.getNombre());
			}
			else{
				capacidadesDesa.add("Android");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setAndroid.add(desarrollador.getNombre());
			}
			
			System.out.println("¿Desea agregar otra especialidad a este desarrollador?: ");
			teclado.nextLine();
			respuesta = teclado.nextLine();
			if (cont == 2)
				System.out.println("Ya no hay mas plataformas para asignarle al desarrollador");
		}
		
		cantidad--;
		}
		
		
		if(setJava.containsAll(setAndroid)&& setAndroid.containsAll(setIOS)){
			System.out.print("Desarrolladores que comparten las tres plataformas");
			Iterator<String> respu = setJava.iterator();
			while(respu.hasNext()){
				System.out.println("\n" + respu.next()+"\n" );
			}
		}
		
		

		
		
	}

			

		// Funcion para mostrar a los que son de Java, pero no de Android.
		public static void jNa(){
			Iterator<String> iterator1 = setJava.iterator();
			while(iterator1.hasNext()){
				Object elementos1 = iterator1.next();
				Iterator<String> iterator2 = setAndroid.iterator();
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
		public static void iosNj(){
			Iterator<String> iterator1 = setIOS.iterator();
			while(iterator1.hasNext()){
				Object elementos1 = iterator1.next();
				Iterator<String> iterator2 = setAndroid.iterator();
				while(iterator2.hasNext()){
					Object elementos2 = iterator2.next();
					if (elementos1.equals(elementos2)){
						boolean existe = false;
						Iterator<String> iterator3 = setJava.iterator();
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


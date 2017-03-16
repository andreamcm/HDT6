import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	
	private static Iset<Desarrollador>  setJava;
	private static Desarrollador desarrollador;
	private static ArrayList<String> capacidadesDesa = new ArrayList<String>();
	private static Iset<Desarrollador>  setIOS;
	private static Iset<Desarrollador> setAndroid;
	private static Controlador control = new Controlador();
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
			setJava.Agregar(desarrollador);
		}
		else if (especialidad ==2){
			capacidadesDesa.add("IOS");
			desarrollador = new Desarrollador(nombre,capacidadesDesa);
			setIOS.Agregar(desarrollador);
		}
		else{
			capacidadesDesa.add("Android");
			desarrollador = new Desarrollador(nombre,capacidadesDesa);
			setAndroid.Agregar(desarrollador);
		}
		
		System.out.println("¿Desea agregar otra especialidad a este desarrollador?: ");
		teclado.nextLine();
		String respuesta = teclado.nextLine();
		
		while (respuesta.equals("si")){
			System.out.println("¿En qué se especializa este desarrollador?: ");
			System.out.println("1. Java");
			System.out.println("2. IOS");
			System.out.println("3. Android");
			especialidad = teclado.nextInt();
			
			if(especialidad==1){
				capacidadesDesa.add("Java");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setJava.Agregar(desarrollador);
			}
			else if (especialidad ==2){
				capacidadesDesa.add("IOS");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setIOS.Agregar(desarrollador);
			}
			else{
				capacidadesDesa.add("Android");
				desarrollador = new Desarrollador(nombre,capacidadesDesa);
				setAndroid.Agregar(desarrollador);
			}
			
			System.out.println("¿Desea agregar otra especialidad a este desarrollador?: ");
			teclado.nextLine();
			respuesta = teclado.nextLine();
		}
		
		cantidad--;
		}
		
		Object respu = control.relacionTres(setJava, setIOS, setAndroid);
		System.out.print(respu);

	}
	

			
	
	}

		// Funcion para mostrar la interseccion entre los tres conjuntos.
	
		/**
		public void interseccion(){
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
*/

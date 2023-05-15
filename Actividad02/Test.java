package Actividad02;

import Actividad01.ExceptionIsEmpty;

public class Test {
	public static void main(String[] args) {
		try{
			QueueLink<Integer> cola = new QueueLink<Integer>();
			cola.enqueue(1);
			cola.enqueue(2);
			cola.enqueue(3);
			cola.enqueue(4);
			cola.enqueue(5);
			
			System.out.println(cola.toString());
			System.out.println("El principio de la cola es : "+cola.front());
			System.out.println("El final de la cola es : "+cola.back());
			
			System.out.print("\n");
			System.out.println("Eliminar: " +cola.dequeue()); //elimina el primero de la cola
			System.out.println(cola.toString());
			
			System.out.println("El principio de la cola es : "+cola.front());
			System.out.println("El final de la cola es : "+cola.back());
			
			System.out.println("Eliminar: " +cola.dequeue()); //elimina 2
			System.out.println("Eliminar: " +cola.dequeue()); //elimina 3
			//System.out.println("Eliminar: " +cola.dequeue()); //elimina 4
			//System.out.println("Eliminar: " +cola.dequeue()); //elimina 5
			//cola.dequeue(); //saltar excepcion 
			System.out.println("El principio de la cola es : "+cola.front());//saltar excepcion
			System.out.println("El final de la cola es : "+cola.back());	 //saltar excepcion
		}
		catch(ExceptionIsEmpty a){
			System.out.println(a.getLocalizedMessage());
		}
	}
}

package Actividad01;

class StackArray<E> implements Stack<E> {
	private E[] array;
	private int tope;

	public StackArray(int n) {
		this.array = (E[]) new Object[n];
		tope = -1;
	}

	public void push(E x) {
		if(tope == this.array.length-1) {
			tope++;
			this.array[tope] = x;
		}
		else {
			throw new ArrayIndexOutOfBoundsException("El array esta lleno");
		}
	}

	public E pop() throws ExceptionIsEmpty {
		for(int i = 0; i>this.array.length; i++) {
			if(this.array[i+1] == null) {
				this.array[i] = null;
				return array[i];
			}
		}
		return null;
	}

	public E top() throws ExceptionIsEmpty {
		return null;
	}

	public boolean isEmpty() {
		return this.tope == -1;
	}

	public boolean isFull() {
		return true;
	}

	public String toString() {
		return "d";
	}
}

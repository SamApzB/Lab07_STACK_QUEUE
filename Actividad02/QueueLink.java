package Actividad02;

import Actividad01.ExceptionIsEmpty;

class QueueLink<E> implements Queue<E> {
	private Node<E> first;
	private Node<E> last;

	public QueueLink() {
		this.first = null;
		this.last = null;
	}

	public void enqueue(E x){
		Node<E> aux = new Node<E>(x);
		if (this.isEmpty()) {
			this.first = aux;
		}
		else
			this.last.setNext(aux);
		this.last = aux;
	}

	public E dequeue() throws ExceptionIsEmpty{
		Node<E> aux = this.first;
		if(!isEmpty()) {
			if(this.first.getNext() != null) {
				this.first = this.first.getNext();
			}
			else{
				this.first = null;
				this.last = null;
			}
			return aux.getData();
		}
		else {
			throw new ExceptionIsEmpty();
		}
	}

	public E back() throws ExceptionIsEmpty{
		if(!isEmpty()) {
			return this.last.getData();
		}
		else {
			throw new ExceptionIsEmpty();
		}
	}

	public E front() throws ExceptionIsEmpty{
		if(!isEmpty()) {
			return this.first.getData();
		}
		else {
			throw new ExceptionIsEmpty();
		}
	}

	public boolean isEmpty() {
		if(this.first == null && this.last == null) {
			return true;
		}
		else {
			return false;
		}
	}


	public String toString() {
		String s = "{";
		Node<E> aux = this.first;
		while (aux != null) {
			s += "["+aux.getData()+"";
			aux = aux.getNext();
			if(aux != null){
				s += "],";
			}
		}
		s += "]}";
		return s;
	}
}
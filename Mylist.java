package listjava;
import java.util.*;
public class Mylist<E> {
	private int size;
	private static final int DEFAUL_CAPACITY=10;
	private Object elements[];
	public Mylist() {
		elements= new Object[DEFAUL_CAPACITY];
	}
	private void ensureCapa() {
		int newSize=elements.length*2;
		elements=Arrays.copyOf(elements, newSize);
	}
	public void add(E e) {
		if(size==elements.length) {
			ensureCapa();
		}
		elements[size++]=e;
	}
	public E get(int i) {
		if(i>=size || i<0 ){
			throw new IndexOutOfBoundsException("Index"+i+",size "+i);
		}
		return (E) elements[i];
	}
}

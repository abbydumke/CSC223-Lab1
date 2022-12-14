package utilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _list;
	@Override
	public int size() {
		return _list.size();
	}
	@Override
	public boolean isEmpty() {
		return _list.size() == 0;
	}
	@Override
	public boolean contains(Object o) {
		return _list.contains(o);
	}
	@Override
	public Iterator<E> iterator() {
		return _list.iterator();
	}
	@Override
	public Object[] toArray() {
		return _list.toArray();
	}
	@Override
	public <T> T[] toArray(T[] a) {
		return _list.toArray(a);
	}
	@Override
	public boolean add(E e) {
		if (this.contains(e))
		{
			return false;
		}
		return _list.add(e);
	}
	@Override
	public boolean remove(Object o) {
		return _list.remove(o);
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		for (Object item : c)
		{
			if (!this.contains(item))
			{
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean result= true;
		for (E item : c) {
			this.add(item);
			if(this.add(item) == false){
				result = false;
			}
		}
		return result;   //if statement to search whether or not item is in list yet or no. 
	}
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		_list.clear();
	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}

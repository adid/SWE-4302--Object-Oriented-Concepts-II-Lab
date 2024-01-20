import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private T[] genericList;
    private int size;
    private int totalSize;

    MyList(int capacity){
        this.totalSize= capacity;
        this.size= 0;
        genericList= (T[]) new Object[totalSize];
    }

    void addItem(T elt)
    {
        if(size==totalSize){
            System.out.println("List is already Full");
            return;
        }

        genericList[size]=elt;
        size++;
    }

    T getItem(int index)
    {
        return genericList[index];
    }

    T removeItem(int index)
    {
        if(isEmpty()){
            System.out.println("List is already Empty");
            return null;
        }

        T item= genericList[size];

        for(int i=index; i<size-1;i++)
        {
            genericList[i]= genericList[i+1];
            genericList[size]= null;
            size--;
        }

        return item;
    }

    public int size()
    {
        return size;
    }

    boolean isEmpty()
    {
        if(size==0){
            return true;
        }
        return false;
    }

    void clear()
    {
        for(int i=0; i<size; i++){
            genericList[i]= null;
        }
        size=0;
    }

    boolean contains(T elt)
    {
        for(int i=0; i<size; i++){
            if(genericList[i]== elt){
                return true;
            }
        }
        return false;
    }

    T[] toArray()
    {
        return genericList;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author sp20-bse-055
  
 */

public class ABList<T> extends ArrayCollection implements ListInterface<T>,Iterable<T>{
  protected final int DEFCAP =100;
  protected int origCap;
  protected T[]elements;
  protected int numElements =0;
  
  protected boolean found;
  protected int location ;
  public ABList(){
      elements =(T[])new Object[DEFCAP];
      origCap = DEFCAP;
      
  }
  public  ABList(int origCap){
    elements= (T[]) new Object[origCap];
    this.origCap= origCap;
}
   public int size()
    {
        return numElements;}
   
  public T set(int index, T newElements)
  {
      if((index<0 )|| (index >= size()))
          throw new IndexOutOfBoundsException("Illegal index of"+index+"passed to ABList set method.\n");
      T hold = elements[index];
      elements[index]= newElements;
      return hold;
      
  }

 
 
public Iterator<T> iterator()
{
 return new Iterator<T>()
 {
    private int previousPos= -1;
    public boolean hasNext(){
        return (previousPos<(size()-1));
    }
        public T next()
        {
            if(!hasNext())
                throw new IndexOutOfBoundsException("Illegal Ivocation");
            previousPos++;
            return elements[previousPos];
        }
        
        public void remove()
        {
            for (int i = previousPos; i<=numElements-2; i++)
                elements[i] = elements[i+1];
            elements[numElements -1] = null;
            numElements--;
            previousPos--;
        }
        };
    
}

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(T target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
    


    
    

   
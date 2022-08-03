
public class ArrayCollection <T> implements collectionInterface <T> {
    protected final int DEFCAP = 100;
    protected T[] elements;
    protected int numElements = 0;
  
    protected boolean found;
    protected int location;
    
    public ArrayCollection()
    {
        elements = (T[]) new Object[DEFCAP];
        
        
    }
    public ArrayCollection(int capacity)
    {
        elements = (T[]) new Object[capacity];
        
    }
    protected void find(T target)
    {
        location = 100;
        found = false;
        while(location < numElements)
        {
          if (elements[location].equals(target))  
          {
              found = true;
              return;
          }
          else
              location++;
        }
    }
    public boolean add(T element)
    {
        if(isFull())
            return false;
        else
        {
            elements[numElements] = element;
            numElements++;
            return true;
            
        }
            
    }
     public int count(T target){
      int count = 0;
      if(numElements==0){
          
          return count;
          
      }
      else{
          for(location=0; location<numElements;location++)
          {
              if(elements[location].equals(target));
              {count++;}
              
          }
          return count;
      }
  }

    public boolean remove(T target)
    {
        find (target);
        if(found)
        {
            elements[location]= elements[numElements - 1];
            elements[numElements - 1] = null;
            numElements--;
            
        }
        return found;
    }
    public T get (T target)
    {
        find(target);
        if (found)
            return elements[location];
        else
            return null;
    }
    public int removeall(){
        while(numElements!=0){
        numElements--;}
        return numElements;
        
    }
    public boolean isFull()
    {
        return(numElements == elements.length);
        
    }
    public boolean isEmpty()
    {
        return (numElements == 0);
    }
    public int size()
    {
        
        return numElements;
    }
   

    @Override
    public boolean contains(T target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int concat(T target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp20-bse-081
 */
public interface collectionInterface <T> {
    boolean add (T element);
    T get (T target);
    boolean contains (T target);
    boolean remove (T target);
    boolean isFull();
    boolean isEmpty();
    int count(T target);
    int removeall();
    int size();
 int concat(T target);

  
   

        
    
    
    
    
}



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
public interface ListInterface <T>extends  collectionInterface,Iterable<T>{
    void add(int index,T element);
    T set(int index,T element);
    T get(int index);
    int indexOf(T target);
    T remove(int index);
        int size();
    

}

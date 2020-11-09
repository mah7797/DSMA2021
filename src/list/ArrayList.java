/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list;

import java.util.Arrays;

/**
 *
 * @author Mahmoud
 */
public class ArrayList implements NewInterface {
   private Object[]List;
private int effectiveSize=0;
private static final int BUFFER_SIZE=10;
public ArrayList(){
 List= new Object[BUFFER_SIZE];
}
    public void add(Object newElement){
if(List.length==effectiveSize){
List=Arrays.copyOf(List,List.length+BUFFER_SIZE);
}
List[effectiveSize]= newElement;
effectiveSize++;
}
    public int size(){
        return effectiveSize;
    }
    public Object remove(int index){
if(index<0 || index>=effectiveSize){
throw new ArrayIndexOutOfBoundsException("invalid index"+index);
}
final Object ValueToRemove=List[index];
if(effectiveSize%BUFFER_SIZE==0){
List=Arrays.copyOf(List,List.length-BUFFER_SIZE);
}
effectiveSize--;
return ValueToRemove;
}
    public boolean remove(Object element){
    final int indexOfElementToRemove=indexOf(element);
    if(indexOfElementToRemove==-1){
return false;}
remove(indexOfElementToRemove);
return true;
}
    public int indexOf(Object element){
    for(int i=0;i<List.length;i++){
        if(List[i].equals(element)){
            return i;
        }
    }
return -1;
}

    public int size1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

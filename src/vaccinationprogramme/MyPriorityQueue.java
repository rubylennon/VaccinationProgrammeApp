/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

//imports
import java.util.ArrayList;

/*
 * Data Structures & Algorithms CA1 Pt.2
 * @author Ruby Lennon
 * Student Number: x19128355
 * 6th March 2021
 * MyPriorityQueue.java
 */
public class MyPriorityQueue implements PQInterface{
    //ArrayList of type PQElement called thePQueue
    private final ArrayList<PQElement> thePQueue; //declare the arraylist
    
    //create an empty arrayList in constructor
    public MyPriorityQueue() {
        thePQueue = new ArrayList<PQElement>();   //create the arraylist  
    } 
    
    //is empty method
    @Override
    public boolean isEmpty() { 
        return thePQueue.isEmpty(); 
    }
    
    //size method
    @Override
    public int size(){
	  return thePQueue.size();
    }

    //private method to find insert position using priority key
    private int findInsertPosition(int newkey){
          boolean found; //false until new insert position is found
          PQElement elem; //temporary object for PQElement 
          int position;
          found = false;
          position = 0; //set to zero as the PQ may be empty
          while (position<thePQueue.size() && !found){
            elem = thePQueue.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else{
                found = true;
            }
          }
        return position;
    }
    
    //new element with a given key and element information will be added
    @Override
    public void enqueue(int priorkey, Object item){
        PQElement elem = new PQElement(priorkey,(Person)item);
        
        int index = findInsertPosition(priorkey);

        if (index == size())
            thePQueue.add(elem);
        else
            thePQueue.add(index, elem);        
    }

    //dequeue method - the element with index zero has the highest priority
    @Override
    public Object dequeue(int index){
        //if the PQ is not empty, remove the front element
        if(thePQueue.size() > 0){
            return thePQueue.remove(index);
        }else{
            return null;
        }
    }
    
    //print queue method
    @Override
    public String printPQueue(){
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i<thePQueue.size();i++){
            elem = thePQueue.get(i);
            printStr = printStr.concat (elem.printPerson()+", Priority = "+elem.getKey()+".\n");
        }
        return printStr;
    }
}

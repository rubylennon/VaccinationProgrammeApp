/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

/*
 * Data Structures & Algorithms CA1 Pt.2
 * @author Ruby Lennon
 * Student Number: x19128355
 * 6th March 2021
 * PQElement.java
 */
public class PQElement {
    private int key;
    private Person element;
     
    //constructor
    public PQElement(int priority, Person e){
        key = priority;
        element = e;
    }

    //setters & getters
    public int getKey() {
        return key;
    }

    public void setKey(int val) {
        key = val;
    }
	
    public Person getElement() {
        return element;
    }

    public void setElement(Person e) {
	element = e;
    }

    //print method to print out the person element
    public String printPerson() {
          String msg; 
          msg = "Name = "+element.getName()+ ", Age = "+element.getAge()+ ", Medical Condition = "+element.getMedCon();
          return msg;
    }
    
    //to string method to print out the PQ element
    @Override
    public String toString() {
        return "PQElement{" + "element=" + element + '}';
    }
        
} 

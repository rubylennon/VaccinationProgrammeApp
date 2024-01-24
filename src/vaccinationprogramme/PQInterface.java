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
 * PQInterface.java
 */
public interface PQInterface {
    //methods
    public void enqueue(int key, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue(int position);
    public String printPQueue();
}

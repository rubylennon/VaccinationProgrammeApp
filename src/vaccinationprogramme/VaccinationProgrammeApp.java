/*
 * To change this template, choose Tools | Templates
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
 * VaccinationProgrammeApp.java
 */
public class VaccinationProgrammeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        //TEST CODE START
        System.out.println("TEST START\n");
        
        //Create instance of ArrayList Person as list
        ArrayList <Person> list;
        list = new ArrayList<Person>();
        
        //priority instance counters - increase each time patient is added to specific priority group
        int priorityOneCounter = 0;
        int priorityTwoCounter = 0;
        int priorityThreeCounter = 0;
        int priorityFourCounter = 0;
        int priorityFiveCounter = 0;
        int prioritySixCounter = 0;
        int prioritySevenCounter = 0;
        int priorityEightCounter = 0;
        int priorityNineCounter = 0;
        int priorityTenCounter = 0;        
        
        //create and add three Person type elements to the list
        Person p1, p2, p3; //declares

        //create the following Person elements
        p1 = new Person("Jack", 1, false, 0); //create
        p2 = new Person("Emily", 90, false, 0); //create
        p3 = new Person("Harry", 18, true, 0); //create
        
        //add elements to the ArrayList
        list.add(p1);//add
        list.add(p2);//add
        list.add(p3);//add
        
        //print the patient list
        System.out.println("Print the list.toString()..."+list.toString());
               
        //set the priorities the the ArrayList elements and add to the priority queue based on the following conditions 
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            //if patient age is less than 18
            if(p.getAge() < 18) {
                //update the object priority to 1
                p.setPriority(1);
                //increase the priority one counter by one
                priorityOneCounter ++;
            //if patient age is equal to or greater than 18 AND patient age equal to or less than 29 AND no medical conditions
            }else if(p.getAge() >= 18 && p.getAge() <= 29 && (!p.getMedCon())){
                //update the object priority to 2
                p.setPriority(2);
                //increase the priority two counter by one
                priorityTwoCounter ++;
            //if patient age is equal to or greater than 30 AND patient age equal to or less than 44 AND no medical conditions
            }else if(p.getAge() >= 30 && p.getAge() <= 44 && (!p.getMedCon())){
                //update the object priority to 3
                p.setPriority(3);
                //increase the priority three counter by one
                priorityThreeCounter ++;
            //if patient age is equal to or greater than 45 AND patient age equal to or less than 54 AND no medical conditions
            }else if(p.getAge() >= 45 && p.getAge() <= 54 && (!p.getMedCon())){
                //update the object priority to 4
                p.setPriority(4);
                //increase the priority four counter by one
                priorityFourCounter ++;
            //if patient age is equal to or greater than 45 AND patient age equal to or less than 64 AND no medical conditions
            }else if(p.getAge() >= 45 && p.getAge() <= 64 && (!p.getMedCon())){
                //update the object priority to 5
                p.setPriority(5);
                //increase the priority five counter by one
                priorityFiveCounter ++;
            //if patient age is equal to or greater than 18 AND patient age equal to or less than 64 AND has medical conditions
            }else if(p.getAge() >= 18 && p.getAge() <= 64 && (p.getMedCon())){
                //update the object priority to 6
                p.setPriority(6);
                //increase the priority six counter by one
                prioritySixCounter ++;
            //if patient age is equal to or greater than 65 AND patient age equal to or less than 69
            }else if(p.getAge() >= 65 && p.getAge() <= 69){
                //update the object priority to 7
                p.setPriority(7);
                //increase the priority seven counter by one
                prioritySevenCounter ++;
            //if patient age is equal to or greater than 70 AND patient age equal to or less than 79
            }else if(p.getAge() >= 70 && p.getAge() <= 79){
                //update the object priority to 8
                p.setPriority(8);
                //increase the priority eight counter by one
                priorityEightCounter ++;
            //if patient age is equal to or greater than 80 AND patient age equal to or less than 89
            }else if(p.getAge() >= 80 && p.getAge() <= 89){
                //update the object priority to 9
                p.setPriority(9);
                //increase the priority nine counter by one
                priorityNineCounter ++;
            //if patient age is equal to or greater than 90
            }else if(p.getAge() >= 90){
                //update the object priority to 10
                p.setPriority(10);
                //increase the priority ten counter by one
                priorityTenCounter ++;
            }
        }
        
        //print the patient list
        System.out.println("Print the list.toString()..."+list.toString());
        
        MyPriorityQueue myPQueue = new MyPriorityQueue();
        
        //add ArrayList elements to Priority Queue myPQueue
        //for every object in the Person ArrayList
        for (int i = 0; i < list.size(); i++) {
            //get the element
            Person p = list.get(i);
                
            //add it to the priority queue using the enqueue() method
            //add the element and priority key
            myPQueue.enqueue(p.getPriority(),p);
        } System.out.println("\n"+myPQueue.printPQueue());//print the priority queue elements after adding      
        
        //print the total patients count in the priority queue
        System.out.println("There is " + myPQueue.size() + " patient(s) currently in the queue:\n");
        
        //print how many patients are currently in each priority group
        System.out.println("There is " + priorityOneCounter + " patient(s) in priority group one.");
        System.out.println("There is " + priorityTwoCounter + " patient(s) in priority group two.");
        System.out.println("There is " + priorityThreeCounter + " patient(s) in priority group three.");
        System.out.println("There is " + priorityFourCounter + " patient(s) in priority group four.");
        System.out.println("There is " + priorityFiveCounter + " patient(s) in priority group five.");
        System.out.println("There is " + prioritySixCounter + " patient(s) in priority group six.");
        System.out.println("There is " + prioritySevenCounter + " patient(s) in priority group seven.");
        System.out.println("There is " + priorityEightCounter + " patient(s) in priority group eight.");
        System.out.println("There is " + priorityNineCounter + " patient(s) in priority group nine.");
        System.out.println("There is " + priorityTenCounter + " patient(s) in priority group ten.");
        
        //print the priority queue
        System.out.println("\nPriority Queue:");
        System.out.println(myPQueue.printPQueue());        
        
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);

            //if the Person element priority list equals 10 - execute the following code
            if(p.getPriority() == 10){
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                //decrease the priority 10 counter by one
                priorityTenCounter --;
            //if the Person element priority list equals 9 - execute the following code
            } else if(p.getPriority() == 9){
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());
                
                priorityNineCounter --;
            //if the Person element priority list equals 8 - execute the following code
            } else if(p.getPriority() == 8){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                priorityEightCounter --;
            //if the Person element priority list equals 7 - execute the following code
            } else if(p.getPriority() == 7){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());
                
                prioritySevenCounter --;
            //if the Person element priority list equals 6 - execute the following code
            } else if(p.getPriority() == 6){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                prioritySixCounter --;
            //if the Person element priority list equals 5 - execute the following code
            } else if(p.getPriority() == 5){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                priorityFiveCounter --;
            //if the Person element priority list equals 4 - execute the following code
            } else if(p.getPriority() == 4){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                priorityFourCounter --;
            //if the Person element priority list equals 3 - execute the following code
            } else if(p.getPriority() == 3){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());
                
                priorityThreeCounter --;
            //if the Person element priority list equals 2 - execute the following code
            } else if(p.getPriority() == 2){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                priorityTwoCounter --;
            //if the Person element priority list equals 1 - execute the following code
            } else if(p.getPriority() == 1){
                //remove the highest priority element from the priority queue using the dequeue method
                PQElement e = (PQElement)myPQueue.dequeue(0);
                System.out.println("Top of PQ & removed: " +e.getElement());

                priorityOneCounter --;
            //else if the priority queue is empty - print the following    
            } else if(myPQueue.isEmpty()){
                System.out.println("\n\nThere are no more patients left to schedule.");
                break;
            } else{
                System.out.println("test");
                break;
            }           
        }
        
        //print the total patient count in the queue
        System.out.println("\nThere is " + myPQueue.size() + " patient(s) currently in the queue:\n");
        
        //print how many patients are currently in each priority group
        System.out.println("There is " + priorityOneCounter + " patient(s) in priority group one.");
        System.out.println("There is " + priorityTwoCounter + " patient(s) in priority group two.");
        System.out.println("There is " + priorityThreeCounter + " patient(s) in priority group three.");
        System.out.println("There is " + priorityFourCounter + " patient(s) in priority group four.");
        System.out.println("There is " + priorityFiveCounter + " patient(s) in priority group five.");
        System.out.println("There is " + prioritySixCounter + " patient(s) in priority group six.");
        System.out.println("There is " + prioritySevenCounter + " patient(s) in priority group seven.");
        System.out.println("There is " + priorityEightCounter + " patient(s) in priority group eight.");
        System.out.println("There is " + priorityNineCounter + " patient(s) in priority group nine.");
        System.out.println("There is " + priorityTenCounter + " patient(s) in priority group ten.");        
        
        //print the PQ
        if(myPQueue.isEmpty()){
            System.out.println("\nPriority Queue Empty");
        }else{
            System.out.println("\n"+myPQueue.printPQueue());    
        }
        
        //remove the test elements from the ArrayList
        for (int i = 0; i < (list.size() + 1); i++) {
            list.remove(i);
        }

        System.out.println("\nTEST END");
        //TEST CODE END
        
        //declare and create an instance of the GUI
        GUI mygui = new GUI();
        
        //set the GUI to visible
        mygui.setVisible(true);
                
    }
}

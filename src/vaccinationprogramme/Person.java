/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vaccinationprogramme;

/*
 * Data Structures & Algorithms CA1 Pt.2
 * @author Ruby Lennon
 * Student Number: x19128355
 * 6th March 2021
 * Person.java
 */
public class Person {
    public String name;
    public int age;
    private int priority;
    int getAge;
    boolean medCon;

    public Person (String inName, int inAge, boolean inMedCon, int inPriority){
       name = inName;
       age = inAge;
       medCon = inMedCon;
       priority = inPriority;
    }

    public Person() {
    }
    
    public void setName(String newname){
        name = newname;
    }
    
    public String getName(){
        return name;
    }
    
    public void setMedCon(boolean newmedcon){
        medCon = newmedcon;
    }
    
    public boolean getMedCon(){
        return medCon;
    }
    
    public void setAge(int newage){
        age = newage;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setPriority(int newpriority){
        priority = newpriority;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public String printPerson(){
        return (name+" "+age+" "+medCon+" "+priority);
    }

    @Override
    public String toString() {
        return "Person{" + "Name = " + name + ", Age = " + age + ", Medical Condition = " + medCon +", Priority = " + priority +'}';
    }
   
}

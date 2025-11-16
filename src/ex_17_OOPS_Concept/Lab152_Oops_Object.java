package ex_17_OOPS_Concept;

public class Lab152_Oops_Object {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Somya";
        //Creates a new Person object and stores the reference in p1.
        //Sets the name of that person to "Somya".
        Person p2 = new Person();
        p2.name = "Yogesh";
       //Creates another Person object and stores the reference in p2.
        // Sets the name of that person to "Yogesh".
        new Person();
        //This creates a third Person object, but you are not assigning it to any variable.
        //The object is created.
        //Immediately becomes eligible for garbage collection, since no reference points to it.
        //No data is set on it.
        //It’s effectively wasted, unless it has logic in the constructor (like printing something or modifying static data).
    }
}

interface Cricket {
    void bowls();
    void bats();
}

class Sport implements Cricket {
    private String name;
    
    public Sport(String name) {
        this.name = name;
    }
    
    public void bowls() {
        System.out.println(name + " is a bowler.");
    }
    
    public void bats() {
        System.out.println(name + " is a batsmen.");
    }
}

public class Demo {
    public static void main(String[] args) {
        Sport c = new Sport("Maxi");
        c.bowls(); 
        c.bats(); 
    }
}

/*Interface:

An interface is a contract that defines a set of methods that a class must implement.
It cannot have instance variables or constructors.
All methods in an interface are abstract by default, so they have no implementation.
A class can implement multiple interfaces.
It is used to achieve multiple inheritance and to provide a common behavior for unrelated classes.
*/


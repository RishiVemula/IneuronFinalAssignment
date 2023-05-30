abstract class Rcb {
    protected String name;
    
    public Rcb(String name) {
        this.name = name;
    }
    
    public abstract void bowlers();
    
    public void batters() {
        System.out.println(name + " is batsmen.");
    }
}

class Ipl extends Rcb {
    public Ipl(String name) {
        super(name);
    }
    
    public void bowlers() {
        System.out.println(name + " is bowler.");
    }
}

public class Test {
    public static void main(String[] args) {
        Ipl s = new Ipl("Maxwell");
        s.bowlers(); 
        s.batters(); 
    }
}


/*Abstract Class:

An abstract class is a class that cannot be instantiated and serves as a blueprint for derived classes.
It can have both abstract and non-abstract (concrete) methods.
It can have instance variables, constructors, and static methods.
It can provide a default implementation for some or all of its methods.
It can be used to achieve code reuse and to define a common base for related classes.
*/


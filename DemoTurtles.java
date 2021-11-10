//teenage mutant racing turtles & friends
//DemoTurtles.java
public class DemoTurtles {
    public static void main(String[] args) {
        //two instances of Turtles
        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();

        // two instances of RaceTurtle
        RaceTurtle r1 = new RaceTurtle();
        RaceTurtle r2 = new RaceTurtle();

        // setting name of turtles and raceturtles
        t1.setName("Leonardo");
        t2.setName("Donatello");
        r1.setName("Michelangelo");
        r2.setName("Raphael");

        // setting color of turtles and raceturtles
        t1.setColor("Blue");
        t2.setColor("Purple");
        r1.setColor("Orange");
        r2.setColor("Red");
        
        //setting weight of turtles and raceturtles
        t1.setWeight(120);
        t2.setWeight(150);
        r1.setWeight(220);
        r2.setWeight(180);

        // setting birth year of turtles and raceturtles
        t1.setBirthYear(1996);
        t2.setBirthYear(1994);
        r1.setBirthYear(1998);
        r2.setBirthYear(1997);

        // setting number of races for RaceTurtles
        r1.setNumOfRaces(600);
        r2.setNumOfRaces(45);

        // get methods
        System.out.println("Name:"+t1.getName()+"\nColor: "+t1.getColor()+"\nWeight: "+t1.getWeight()+"kg"+"\nBirth Year: "+t1.getBirthYear());
        System.out.println("\nName: "+t2.getName()+"\nColor: "+t2.getColor()+"\nWeight: "+t2.getWeight()+"kg"+"\nBirth Year: "+t2.getBirthYear());
        System.out.println("\nName: "+r1.getName()+"\nColor: "+r1.getColor()+"\nWeight: "+r1.getWeight()+"kg"+"\nBirth Year: "+r1.getBirthYear()+
                "\nNumber of races: "+r1.getNumOfRaces());
        System.out.println("\nName: "+r2.getName()+"\nColor: "+r2.getColor()+"\nWeight: "+r2.getWeight()+"kg"+"\nBirth Year: "+r2.getBirthYear()+
                "\nNumber of races: "+r2.getNumOfRaces());

        System.out.println();
    }
}
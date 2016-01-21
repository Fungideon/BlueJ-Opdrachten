
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    private Leerling lid1;
    private Leerling lid2;
    /**
     * Constructor for objects of class Team
     */
    public Team( Leerling lid1, Leerling lid2 )
    {
        this.lid1 = lid1;
        this.lid2 = lid2;
    }
    
    public void print() {
        System.out.println( "Indeling van dit team:" );
        System.out.println( lid1 );
        System.out.println( lid2 );
        System.out.println( "----------------------" );
    }
}

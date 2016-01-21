

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TeamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TeamTest
{
    private Leerling leerling1;
    private Leerling leerling2;
    private Team team1;
    private Team team2;

    /**
     * Default constructor for test class TeamTest
     */
    public TeamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        leerling1 = new Leerling("Charlotte", "6A", "meisje", 101);
        leerling2 = new Leerling("Heleen", "5B", "meisje", 103);
        team1 = new Team(leerling1, leerling2);
        team2 = new Team(new Leerling("Welmer","6C","jongen",445), new Leerling("Milo","6C","jongen",446));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

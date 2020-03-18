import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoviesTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void TestSetReleaseDate() throws Exception {
        MovieInterface date1 = new Movies();
        System.out.println(date1.ReleaseDate());

        assertTrue(date1.ReleaseDate().contains("20 April 2011"));
    }

    @Test
    public void TestSetSize() throws Exception{
        MovieInterface date2 = new Movies();

        assertEquals(5,date2.ReleaseDate().size());
    }

    @Test
    public void TestSetRemove() throws Exception{
        MovieInterface date3 = new Movies();

        assertTrue(date3.ReleaseDate().remove("1 December 2014"));

    }


    @Test
    public void TestMapActors() throws Exception {

        MovieInterface actor1 = new Movies();
        System.out.println(actor1.Actors());

        assertEquals("Tom Hanks", actor1.Actors().get("TH"));
    }

    @Test
    public void TestMapSize() throws Exception{
        MovieInterface actor2 = new Movies();

        assertEquals(5,actor2.Actors().size());
    }

    @Test
    public void TestMapRemove() throws Exception{
        MovieInterface actor3 = new Movies();

        assertEquals("Will Smith", actor3.Actors().remove("WS"));
    }

    @Test
    public void TestListMovieName() throws Exception{

        MovieInterface name1 = new Movies();
        System.out.println(name1.MovieName());

        assertTrue(name1.MovieName().contains("Gladiator"));
    }

    @Test
    public void TestListSize() throws Exception{
        MovieInterface name2 = new Movies();

        assertEquals(5,name2.MovieName().size());
    }

    @Test
    public void TestListRemove() throws Exception{
        MovieInterface name3 = new Movies();

        assertTrue(name3.MovieName().remove("Titanic"));
    }
}
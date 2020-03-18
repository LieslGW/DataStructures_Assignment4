import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Movies implements MovieInterface{

    public Movies(){

    }

    @Override
    public Set<String> ReleaseDate() {

        Set date = new HashSet();

        date.add("12 Jan 1995");
        date.add("26 Oct 2001");
        date.add("8 May 1983");
        date.add("20 April 2011");
        date.add("1 December 2014");

        return date;
    }

    @Override
    public Map<String, String> Actors() {
        Map actor = new HashMap();

        actor.put("LD","Leonardo DiCaprio");
        actor.put("TH","Tom Hanks");
        actor.put("RC","Russell Crowe");
        actor.put("WS","Will Smith");
        actor.put("SC","Sean Connery");

        return actor;
    }

    @Override
    public List<String> MovieName() {

        List name = new ArrayList();

        name.add("Forrest Gump");
        name.add("Titanic");
        name.add("Gladiator");
        name.add("Men in Black");
        name.add("The Rock");

        return name;
    }
}

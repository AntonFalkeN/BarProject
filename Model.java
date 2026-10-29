import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Model {
    Dictionary<String, Integer> Drinks = new Hashtable<>();

    public static void Add(String name, List<String> ingredients){
        Drinks.put(name, ingredients);
    }
}

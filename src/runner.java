import java.util.ArrayList;
public class runner {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

        // before:
        System.out.println(names);

        // complete code below to traverse the arraylist and insert "HELLO" after any
        // name that contains the letter "i"
        for (int i = 0; i<names.size(); i++)
        {
            String name = names.get(i);
            if(name.contains("i"))
            {
                names.add(i+1, "HELLO");
                i++;
            }
        }

        // after:
        System.out.println(names);

    }
}

package PuzzleQuestions;

import java.util.ArrayList;

/*
we can print the values by converting our ArrayList object into the Array [ al.toArray() ]
also, but in the real time, there may be a chance to add some user defined class objects into the ArrayList,
in that scenario obviously the better approach will be converting to Object type
and then check the type caste and go ahead.
 */

public class MultipleDataTypes {

    public static void main(String... args)
    {
        ArrayList al = new ArrayList();

        al.add("Java4s");
        al.add(12);
        al.add(12.54f);

        for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);

            if(o instanceof String || o instanceof Float || o instanceof Integer)
                System.out.println("Value is "+o.toString());
        }

    }
}

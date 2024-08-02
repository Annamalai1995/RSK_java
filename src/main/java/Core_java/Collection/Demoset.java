package Core_java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demoset {
    public static void main(String[] args)
    {
        TreeSet<Double> Heights=new TreeSet<Double>();

        Heights.add(15.2);
        Heights.add(20.2);
        Heights.add(78.2);
        Heights.add(66.7);
        Heights.add(54.8);
        Heights.add(30.5);
        Heights.add(65.6);
        Heights.add(45.8);

        System.out.println(Heights);

        HashSet<Double> HeightsDemo1=new HashSet<Double>();

        HeightsDemo1.addAll(Heights);

        Iterator<Double> it=HeightsDemo1.iterator();

        while(it.hasNext())//Boolean-True/False
        {
            System.out.println(it.next()+" demo values");
        }
    }
}

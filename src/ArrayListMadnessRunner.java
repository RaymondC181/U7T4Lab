import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListMadnessRunner {
    public static void main(String[] args)
    {
//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
//        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
//        System.out.println(contains);
//        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
//        System.out.println(contains);
//        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
//        System.out.println(contains);
//        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
//        System.out.println(contains);

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);

    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);

        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        ArrayListAlgorithms.replaceWithCaps(stringList2);
        System.out.println(stringList2);

        ArrayList<String> stringList12 = new ArrayList<String>(Arrays.asList("yes", "pass", "buts", "Mets", "Yankees"));
        ArrayListAlgorithms.replaceWithCaps(stringList12);
        System.out.println(stringList12);

        ArrayList<String> stringList13 = new ArrayList<String>(Arrays.asList("yeah", "pat", "but", "Met", "Yankee"));
        ArrayListAlgorithms.replaceWithCaps(stringList13);
        System.out.println(stringList13);

        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int index = ArrayListAlgorithms.indexOfMinimum(intList);
        System.out.println(index);
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(6, 8, 3, 5, 6, 3, 2, 3, 2));
        index = ArrayListAlgorithms.indexOfMinimum(intList5);
        System.out.println(index);
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(10, 12, 9, 9, 8));
        index = ArrayListAlgorithms.indexOfMinimum(intList6);
        System.out.println(index);
    }
}

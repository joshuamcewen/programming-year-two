import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        // Initialise array and convert array to list
        String[] flyArray = {"Dragonfly", "Horsefly", "Greenfly", "Fruit Fly", "Housefly"};
        List<String> flyList = Arrays.asList(flyArray);

        // Sort and print list
        Collections.sort(flyList);
        printList(flyList);

        // Reverse and print list
        Collections.reverse(flyList);
        printList(flyList);

        // Get index of object
        int index = Collections.binarySearch(flyList, "Greenfly");
        System.out.println("Greenfly at index " + index);

        System.out.println();

        // Initialise and print list
        List<String> colourList = new ArrayList<String>();
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Orange");
        printList(colourList);

        // Overload and reverse colour list
        Collections.sort(colourList, Collections.reverseOrder());
        printList(colourList);

        // How many instances of key
        System.out.println("Green occurs: " + Collections.frequency(colourList, "Green"));
        System.out.println();

        // Randomly shuffle array
        Collections.shuffle(colourList);
        printList(colourList);

        // Sort based on length with custom comparator.
        Collections.sort(colourList, new StringLengthComparator());
        printList(colourList);
    }

    private static void printList(List<String> aList) {
        for(String s: aList) {
            System.out.println(s);
        }
        System.out.println();
    }
}

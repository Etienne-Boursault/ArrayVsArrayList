import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Create elements
        String[] friendsArray = {"John", "Etienne", "Jacques", "Luke"};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Etienne", "Jacques", "Luke"));

        // Get an element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        // Get Size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add element
        // Not possible with Array
        friendsArrayList.add("Elise");
        System.out.println(friendsArrayList.get(4));

        // Set an element
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));

        // Remove an element
        // Can't with Array
        friendsArrayList.remove("Etienne");
        System.out.println(friendsArrayList.get(1));

        // Print
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);

        friendsArrayList.forEach(item ->
            System.out.println(item.toUpperCase())
        );
    }
}
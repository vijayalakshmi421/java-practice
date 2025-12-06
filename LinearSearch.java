public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 9, 5};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}

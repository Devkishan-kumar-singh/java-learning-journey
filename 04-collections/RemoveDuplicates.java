import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.print("Enter 7 elements: ");

        for (int i = 0; i < 7; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("List before duplicate removal:");
        System.out.println(nums);

        // Remove duplicates
        for (int i = 0; i < nums.size(); i++) {

            for (int j = i + 1; j < nums.size(); j++) {

                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--;
                }
            }
        }

        System.out.println("List after duplicate removal:");
        System.out.println(nums);

        sc.close();
    }
}
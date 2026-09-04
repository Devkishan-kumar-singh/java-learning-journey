import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(5);
            nums.add(7);
            nums.add(3);
            nums.add(6);
            System.out.print("Original list: ");
            System.out.println(nums);
             nums.add(60);

            System.out.println("\nAfter Adding 60:");
            System.out.println(nums);
            nums.remove(Integer.valueOf(6));
            System.out.println("\nAfter Removing 6:");
            System.out.println(nums);
    }
    
}

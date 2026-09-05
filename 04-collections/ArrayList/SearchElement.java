import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(5);
            nums.add(7);
            nums.add(3);
            nums.add(6);
           
            System.out.print("\nEnter element to search:");
            int search = sc.nextInt();
            int found = 0;
            for(int i = 0;i<nums.size();i++){
                if(nums.get(i) == search){
                    System.out.println("Number found at "+(i+1)+" position");
                    found = 1;
                    break;
                }
            }
            if(found == 0){
                System.out.println("Number not found");
            }
             System.out.print("Original list: "+nums);
            sc.close();
    }
}

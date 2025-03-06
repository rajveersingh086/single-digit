import java.util.*;
//leetcode 136
class Singleno {
    public int singleNumber(int[] nums) {
        int count =0;
        for (int num : nums){
            count ^=num;
        }
        return count;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = sc.nextInt();
        int []nums = new int[num];

        System.out.println("enter the array element");
        for(int i=0;i<num;i++){
            nums[i] =sc.nextInt();
        }
        Singleno obj = new Singleno();
        int unique = obj.singleNumber(nums);

        System.out.println("single no is "+unique);
        }
}

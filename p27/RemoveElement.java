package leetcode.p27;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k = removeElement(nums, 2);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}

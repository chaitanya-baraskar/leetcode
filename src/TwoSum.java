import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    int[] arr;
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numarr = new HashMap<Integer,Integer>();
        int tracker = target;

        for (int i = 0 ; i < nums.length;i++){
            numarr.put(nums[i],i);
        }

        for(int i = 0 ; i < nums.length ; i++){
            tracker = target - nums[i];
            if(numarr.containsKey(tracker) && numarr.get(tracker) != i){
                return new int[] {i, numarr.get(tracker)};
            }
        }
        throw new IllegalArgumentException("Not Found");
    }

    public static void main(String[] args) {

        int[] arr = new int[] {2,7,11,15};

        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.twoSum(arr,26);
        for(int i = 0 ; i < solution.length; i ++){
            System.out.println(solution[i]);
        }
    }

}

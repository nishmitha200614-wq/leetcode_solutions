import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int num : map.keySet()) {
            int frequency = map.get(num);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(num);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0; i--) {
            if(bucket[i] != null) {
                for(int num : bucket[i]) {
                    result[index] = num;
                    index++;
                    if(index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] res = new int[2];
        if(numbers == null || numbers.length < 1) {
            return res;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])){
                res[0] = map.get(target - numbers[i]);
                res[1] = i;
                return res;
            }
            else {
                map.put(numbers[i], i);
            }
        }
        return res;
    }
}
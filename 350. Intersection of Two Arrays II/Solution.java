// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many 
// times as it shows in both arrays and you may return the result in any order.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqArr = new int[1001], l_nums, b_nums, result;
        int n1 = nums1.length, n2=nums2.length, i;
        ArrayList<Integer> list = new ArrayList<>();
        if (n1>n2) {
            l_nums = nums2;
            b_nums = nums1;
        } else {
            l_nums = nums1;
            b_nums = nums2;
        }
        for (int x: l_nums)
            freqArr[x]++;
        for (i=0; i<b_nums.length; i++) {
            if (freqArr[b_nums[i]] > 0) {
                list.add(b_nums[i]);
                freqArr[b_nums[i]]--;
            }
        }
        
        result = new int[list.size()];
        for (i=0; i<list.size(); i++)
            result[i] = list.get(i);
            
        return result;
        // int n1 = nums1.length, n2=nums2.length;
        // ArrayList<Integer> list = new ArrayList<>();
        // HashMap<Integer, Integer> map;
        // int[] l_nums, b_nums;
        // if (n1>n2) {
        //     l_nums = nums2;
        //     b_nums = nums1;
        //     map = new HashMap<>(n2);
        // } else {
        //     l_nums = nums1;
        //     b_nums = nums2;
        //     map = new HashMap<>(n1);
        // }
//         for (int x: l_nums) 
//             map.put(x, map.getOrDefault(x, 0) + 1);

//         for (int x: b_nums)
//             if (map.containsKey(x) && map.get(x) > 0) {
//                 list.add(x);
//                 map.replace(x, map.get(x)-1);
//             }
        
//         int[] result = new int[list.size()];
//         for (int i=0; i<list.size(); i++)
//             result[i] = list.get(i);
            
//         return result;
        
            
        
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int x = 0, y = 0;
        // ArrayList<Integer> result = new ArrayList<>();
        // while(x<nums1.length && y<nums2.length) {
        //     if (nums1[x] == nums2[y]) {
        //         result.add(nums1[x++]);
        //         y++;
        //     } else if (nums1[x] < nums2[y])
        //         x++;
        //     else
        //         y++;
        // }
        // return result.stream().mapToInt(i -> i).toArray();
    }
}
 
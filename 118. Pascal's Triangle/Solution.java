// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> prev = Arrays.asList(1);
        result.add(prev);
        int i =1, j, k;
        while(i<numRows) {
            i++;
            ArrayList<Integer> arr = new ArrayList<>(i);
            arr.add(1);
            j=1;
            while(j<Math.ceil(i/2.0))
                arr.add(prev.get(j-1)+prev.get(j++));
            if (i%2==0) k=j-1;
            else k=j-2;
            while(k>=0){
                arr.add(arr.get(k--));
            }
            
            prev = arr;
            result.add(arr);
        }
        return result;
    }
}
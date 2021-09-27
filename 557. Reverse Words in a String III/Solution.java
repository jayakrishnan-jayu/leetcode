// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

class Solution {
    private static void reverse(char[] s, int l, int r) {
        char c;
        while(l<r) {
            c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int l = s.length()-1, i=0, j=0;
        while(j<l){
            while(j<l && arr[j] != ' ')
                j++;
            if (arr[j] == ' ')
                reverse(arr, i, j++ -1);
            else 
                reverse(arr, i, j);
            i=j;
            
        }
        return String.valueOf(arr);
        
    }
}
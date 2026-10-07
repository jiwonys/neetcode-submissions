class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alph = new int[26];
        //use a hashmap
        //r = 2
        //a = 2
        //c = 2
        //e = 1

        //map.keySet() is going to return Set<String> r , a , c , e
        //loop through to see if any value is greater than 0.
        //if any value is greater than 0, "False" , Not anagrams.
        //else, return true. Anagrams.
        //O(n)
        if (s.length() != t.length()){
             return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < sArr.length; i++){
            alph[sArr[i] - 'a'] += 1;
            alph[tArr[i] - 'a'] -= 1;
        }


        for(int i = 0; i < alph.length; i++){
            if(alph[i] != 0){
                return false;
            }
        }
        return true;
        //b  = b - a  = 1 in ascii code.


        //loop through s, add to hashmap
    }
}

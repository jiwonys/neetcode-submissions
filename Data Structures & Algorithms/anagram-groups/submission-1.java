class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list1 = new ArrayList<String>();
        List<List<String>> list2 = new ArrayList<>();
        Map<String, ArrayList<String>> countMap = new HashMap<>();

        if (strs.length == 1 || strs.length == 0) {
            list2.add(Arrays.asList(strs));
            return list2;
        }

        for (String str : strs) {
            int[] countArr = new int[26];

            for (char c : str.toCharArray()) {
                countArr[c - 'a'] += 1;
            }

            String outCount = "";
            for (int i = 0; i < countArr.length ; i++) {
                outCount += (countArr[i] + ".");
            }

            countMap.putIfAbsent(outCount, new ArrayList<String>());
            countMap.get(outCount).add(str);
        }

        return new ArrayList<List<String>>(countMap.values());
    }
}
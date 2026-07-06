class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s: strs){
            int[] frq=new int[26];
            for(char c: s.toCharArray()) frq[c-'a']++;
            StringBuilder sb=new StringBuilder();
            for(int x: frq) sb.append(x).append("-");
            map.putIfAbsent(sb.toString(),new ArrayList<>());
            map.get(sb.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List <String> sortedRes = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        for(String s : strs){
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            String sorted = new String(sc);
            if(sortedRes.isEmpty()){
                List <String> ss = new ArrayList<>();
                sortedRes.add(sorted);
                ss.add(s);
                res.add(ss);
            }else{
                boolean isAdded = false;
                for(int j = 0; j<sortedRes.size(); j++){
                    if(sortedRes.get(j).equals(sorted)){
                        isAdded = true;
                        res.get(j).add(s);
                        break;
                    }
                }
                if(!isAdded){
                    List <String> ss = new ArrayList<>();
                    sortedRes.add(sorted);
                    ss.add(s);
                    res.add(ss);
                }
            }
        }
        return res;
    }
}

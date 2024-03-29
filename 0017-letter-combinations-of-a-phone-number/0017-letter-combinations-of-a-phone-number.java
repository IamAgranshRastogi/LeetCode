class Solution {
    List<String> res = null;
    String [] strMap = {"0","1","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        dfs(0,digits,new StringBuilder());
        return res;
    }

    void dfs(int length ,String digits,StringBuilder temp){

        if(length == digits.length()){
            res.add(temp.toString());
            return; 
        }

        char ch = digits.charAt(length);
        String str = strMap[ch -'0'];

        for(char c:str.toCharArray()){
            temp.append(c);
            dfs(length+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}
// Time Complexity: O(3^N * 4^M)
// Space Complexity: O(N)

// where:
// N = number of digits that map to set of three letters
// M = number of digits that map to set of four letters 
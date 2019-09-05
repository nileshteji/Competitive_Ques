class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length()==0)
            return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        
        dp[1] = s.charAt(0) == '0' ?0:1;
       
        for(int i = 2; i<=s.length();i++)
        {   
            int onedig = Integer.parseInt(s.substring(i-1,i));
            int twodig = Integer.parseInt(s.substring(i-2,i));
            if(onedig>=1)
            dp[i] += dp[i-1];
            if(twodig>=10 && twodig<=26)
                dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }
}

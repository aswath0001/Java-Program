class Q15 {
    public static int maxConsecutiveAnswer (String answerKey,int k){
        return Math.max(answer(answerKey,k,'T'),answer(answerKey,k,'F'));
    }
    public static int answer (String s,int k,char target){
        int left =0;
        int maxlen=0;
        int changes=0;
        for(int right =0;right<s.length();right ++){
               if(s.charAt(right)!=target){
                changes++;
               }
               while (changes>k) {
                if(s.charAt(left)!=target){
                changes--;
               }
               left++;
               }
               maxlen=Math.max(maxlen,right-left+1);
        }
       return maxlen;
    }
    public static void main(String[] args) {
        String answerKey = "TTfTTFTT";
        int k=1;
        int result = maxConsecutiveAnswer(answerKey, k);
        System.out.println(result);
    }
}
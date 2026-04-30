class Q12 {
    public static  boolean isPalindrome(String str){
         int left =0;
          int right = str.length()-1;
         while(left<right){
            char l = Character.toLowerCase(str.charAt(left));
            char r = Character.toLowerCase(str.charAt(right));

            if(l!=r){
             return false;
            }
            left++;
            right--;
         }
         return true;
    }
    public static void main(String[] args) {
        String str = "Madam";
        
        if(isPalindrome(str)){
            System.out.println("The given string is a palindrome");
        }else {
            System.out.println("The given string is not a palinfrome");
        }
    }
}
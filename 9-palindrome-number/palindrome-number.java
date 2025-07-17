class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        int rev = 0;
        int temp=n;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==n;
    }
}
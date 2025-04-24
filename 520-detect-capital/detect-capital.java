class Solution {
    public boolean detectCapitalUse(String s) {
        String Upper = s.toUpperCase();
        String Lower = s.toLowerCase();

        if(s==Upper){
            return true;
        }else if(s==Lower){
            return true;
        }else if(Character.isUpperCase(s.charAt(0))&&s.substring(1).equals(s.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}
class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        char [] arr = new char[n];

        for(int i=0;i<n;i++){
            arr[i] = s.charAt((i+k)%n);
        }
        return new String(arr);
    }
}
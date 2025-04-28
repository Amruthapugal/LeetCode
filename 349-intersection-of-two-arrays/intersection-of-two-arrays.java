class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!arrayList.contains(nums1[i])){
                       arrayList.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int arr[]=new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr[i]=arrayList.get(i);
        }
        return arr;
    }
}
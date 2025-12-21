package assignment.Array;
import java.lang.reflect.Array;
import java.util.*;

public class arrayIII {
    public static int[] union(int[] nums1, int[] nums2){
        // time O(n)
        int i = 0, j = 0;
        ArrayList<Integer> un = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                if (un.size() == 0 || un.get(un.size() - 1) != nums1[i])
                    un.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                if (un.size() == 0 || un.get(un.size() - 1) != nums1[i])
                    un.add(nums1[i]);
                i++;
            }
            else {
                if (un.size() == 0 || un.get(un.size() - 1) != nums2[j])
                    un.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            if (un.size() == 0 || un.get(un.size() - 1) != nums1[i])
                un.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (un.size() == 0 || un.get(un.size() - 1) != nums2[j])
                un.add(nums2[j]);
            j++;
        }

        int[] ans = new int[un.size()];
        for (int k = 0; k < un.size(); k++)
            ans[k] = un.get(k);

        return ans;
    }
    public static List<Integer> intersection(int[] arr,int[] brr){
        int n1=arr.length;
        int n2=brr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(arr[i]<brr[j]) i++;
            else if(arr[i]>brr[j]) j++;
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr[i]){
                    ans.add(arr[i]);
                }
                i++;
                j++;
            }
        }
        return ans;

    }
    public static int maxSubArraySum(int[] arr){
        int n=arr.length;
        int currSum=0;
        int maxSum=arr[0];
        for(int i=1; i<n; i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static int maxProduct(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int prefix=1;
        int suffix=1;
        for(int i=0; i<n; i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=arr[i];
            suffix*=arr[n-i-1];
            max=Math.max(max,Math.max(suffix,prefix));
        }
        return max;
    }
    public static int majority(int[] arr){
        int n=arr.length;
        int count=0;
        int ele=-1;
        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }else if(arr[i]==ele)count++;
            else count--;
        }
        return ele;
    }
    public static int removeMinAndMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minIdx=-1;
        int maxIdx=-1;
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIdx=i;
            }
        }
        if (minIdx>maxIdx){
            int temp=minIdx;
            minIdx=maxIdx;
            maxIdx=temp;
        }
        int ans1=maxIdx+1;
        int ans2=n-minIdx;
        int ans3=(minIdx+1)+(n-maxIdx);
        return Math.min(ans1,Math.min(ans2,ans3));
    }
    public static int maxFrequencyElement(int[] arr){
        int maxFreq=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            int freq=mp.getOrDefault(num,0)+1;
            mp.put(num,freq);
            maxFreq=Math.max(maxFreq,freq);
        }
        int result=0;
        for(int freq:mp.values()){
            if(freq==maxFreq) result+=freq;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4};
        System.out.println(maxFrequencyElement(arr));




    }
}

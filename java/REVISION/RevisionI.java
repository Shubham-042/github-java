package REVISION;
import java.util.*;

public class RevisionI {
    static int largestNo(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int secondLar(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int second=arr[0];
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                second=max;
                max=arr[i];
            }else if(second<arr[i] && arr[i]<max)second=arr[i];
        }
        return second;
    }
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i]){
                    ans.add(nums1[i]);

                }
                i++;
            }else if(nums1[i]>nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=nums2[j]){
                    ans.add(nums2[j]);

                }
                j++;
            }else{
                if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i]){
                    ans.add(nums1[i]);

                }
                i++;
                j++;
            }
        }
        while(i<n1){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i]){
                ans.add(nums1[i]);}
            i++;
        }
        while(j<n2){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=nums2[j]){
                ans.add(nums2[j]);}
            j++;
        }
        int[] ans2=new int[ans.size()];
        for(int k=0; k<ans.size(); k++){
            ans2[k]=ans.get(k);
        }
        return ans2;
    }
    static void nthRowPascal(int n){
        int ans=1;
        System.out.print(1);
        for(int i=1; i<n; i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(" "+ans);
        }
    }

    public static void main(String[] args) {
        nthRowPascal(0);
    }
}

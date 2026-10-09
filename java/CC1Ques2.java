public class CC1Ques2 {
    public static int lcs(int[] nums1,int[] nums2,int i,int j){
        if(i<0 || j<0)return 0;
        if(nums1[i]==nums2[j]){
            return 1+lcs(nums1,nums2,i-1,j-1);
        }else{
            return Math.max(lcs(nums1,nums2,i-1,j),lcs(nums1,nums2,i,j-1));
        }
    }
    public static int lcsTab(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[][] dp=new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        int[] nums1={1,2,4,5};
        int[] nums2={2,4,5};
//        System.out.println(lcs(nums1,nums2,nums1.length-1,nums2.length-1));
        System.out.println(lcsTab(nums1,nums2));
    }
}

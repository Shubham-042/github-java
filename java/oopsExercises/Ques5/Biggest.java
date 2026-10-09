package oopsExercises.Ques5;

public class Biggest {
    private int[] nums;

    public Biggest(int[] arr){
        this.nums=arr;
    }

    public void display(){
        if(nums==null || nums.length==0){
            System.out.println("Array is empty:");
            return;
        }
        int max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }
        System.out.println("Largest Element is : "+ max);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,0,9};
        Biggest b=new Biggest(arr);
        b.display();
    }
}

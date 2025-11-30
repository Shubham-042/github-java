class ArrayExample{
    void demoArray(){
        int[] ages={5,12,25};
        float[] weights={23.2f,33.1f,42.001f};
        String[] name={"shubham","shivam","aman"};

//        manually
//        System.out.println(weights[0]);
//        System.out.println(weights[1]);
//        System.out.println(weights[2]);
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        System.out.println(name.length);
//        by  for loops
//        for(int i=0; i<ages.length; i++){
//            System.out.println(ages[i]);
//        }
//        for(int i=0; i<name.length; i++){
//            System.out.println(name[i]);
//        }
//        for(int i=0; i<weights.length; i++){
//            System.out.println(weight[i]);
//        }
//        by for each loop
        for(int age:ages){
            System.out.println(age);
        }
        for(float weight:weights){
            System.out.println(weight);
        }
        for(String ele:name){
            System.out.println(ele);
        }
    }
    void multiArray(){
        int[][] arr={{23,11,54} , {33,25,10} };
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

}}

public  class array {
    public static void main(String[] args) {
       ArrayExample obj=new ArrayExample();
//        ArrayExample obj1=new ArrayExample();
       obj.demoArray();
       obj.multiArray();

    }

}


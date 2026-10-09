class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
}
public class BigNumbers {
        boolean negative;
        Node head;
        private BigNumbers(String s){
             createNum(s);
        }

        private void  createNum(String num){
            int start=0;
            if(num.charAt(0)=='-'){
                start=1;
                negative=true;
            }else{
                negative=false;
                if(num.charAt(0)=='+'){
                    start=1;
                }
            }

            while(start<num.length() && num.charAt(start)=='0')start++;
            if(start==num.length()){
                negative=false;
                head=new Node(0);
                return;

            }
            Node temp=null;
            for(int i=start; i<num.length(); i++){
                int digit=num.charAt(i)-'0';
                Node newNode=new Node(digit);

                if(head==null){
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=newNode;
                }
            }

        }

//        private Node  add( BigNumbers nums1,BigNumbers nums2){
//
//        }
//
//        private Node sub(Node  nums1,Node nums2){
//
//        }
//
//        private Node mul(Node nums1,Node  nums2){
//
//        }

        public  void print(){
           if(negative){
               System.out.print('-');
           }
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.val);
               temp=temp.next;
           }
            System.out.println();
        }


    public static void main(String[] args) {
        BigNumbers num=new BigNumbers("-00999999");
        num.print();
        BigNumbers num1=new BigNumbers("01110");
        num1.print();
    }

}

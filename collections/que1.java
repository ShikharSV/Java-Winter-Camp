import java.util.Scanner;
public class que1{
    class SpecialStack{
        SpecialStack head;
        int data;
        SpecialStack next;
        SpecialStack(int val){
            this.data=val;
            this.next=null;
        }
        public void push(int data){
            SpecialStack newStackNode=new SpecialStack(data);
            if(head==null){
                head=newStackNode;
            }
            SpecialStack temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newStackNode;
            newStackNode.next=null;
        }
        public void pop(){
            if(head==null) return;
            if(head.next==null){
                head=null;
                return;
            }
            SpecialStack prev=head;
            SpecialStack curr=head.next;
            while(curr.next!=null){
                curr=curr.next;
                prev=prev.next;
            }
            prev.next=null;
        }
        public boolean isEmpty(){
            if(head==null) return true;
            return false;
        }
        public int getMin(){
            SpecialStack temp=head;
            int sm=head.data;
            while(temp!=null){
                if(sm>=temp.data){
                    sm=temp.data;
                }
            }
            return sm;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        sc.close();
    }
}
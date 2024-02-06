
import java.util.ArrayList;

/* Given an array, arr[], find the largest subsequence such that GCD (Greatest Common Divisor ) of all those
subsequences are greater than 1.
Samples
Input: [3, 6, 2, 5, 4]
Output: 3 // expl.: there are only three elements (6, 2, 4) having GCD greater than 1 i.e., 2.
=> largest subsequence will be 3
Input: 10, 15, 7, 25, 9, 35
Output: 4
*/

class Task5{

    static int[] input = {10,15,7,25,9,35};
    static ArrayList<MyObject> common_divisors = new ArrayList<MyObject>(); //can also be done via Map (e.g. Task 6)
    public static void main(String[] args) {
        
    }
    public static int get_highest_number(){
        int highest_divisor;
        int current = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]>current){
                current = input[i];
            }
        }
        return current;

    }
    public static MyObject getObject_byValue(int value){
        for(int i=0;i<common_divisors.size();i++){
            if(common_divisors.get(i).get_value()==value){
                return common_divisors.get(i);
            } 
        }
        return null;
    }
    public static void calc(){
        for(int i=0;i<input.length;i++){
            for(int j=2;j<get_highest_number();j++){
                if(input[i]%j==0){
                    if(common_divisors.contains(getObject_byValue(j))){
                        getObject_byValue(common_divisors[j].get_value).increase();
                    }
                }
        }
    }
}
}

class MyObject{
    private int value;
    private int amount;

    public MyObject(int p_value, int p_amount){
        this.value = p_value;
        this.amount = p_amount;
    }
    public int get_value(){
        return value;
    }
    public int get_amount(){
        return amount;
    }
    public void increase(){
        value = value+1;
    }
}
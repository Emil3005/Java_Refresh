/*
Develop a method that counts the occurrence of all letters within a string. No libraries or functions should be used
that can solve this task automatically. Capitalization has to be ignored.
Samples
Input: Anna
Output: A: 2 | N: 2
 */
import java.util.ArrayList;


class Task6{
    static ArrayList<MyObject> chars = new ArrayList<MyObject>(); //can also be done via Map (e.g. Task 6)
    static char[] input = {'a','n','n','a'};

    public static void count(char current){
        if(chars.contains(getObject_byChar(current))){
            getObject_byChar(current).increase();
            
        }else{ 
            chars.add(new MyObject(1,current));
        }
    }
    public static MyObject getObject_byChar(char current){
        for(int i=0;i<chars.size();i++){
            if(chars.get(i).get_char()==current){
                return chars.get(i);
            } 
        }
        return null;
    }
    public static void main(String[] args) {
        calc();
        print();
    }
    public static ArrayList<MyObject> calc(){
        for(int i=0;i<input.length;i++){
            count(input[i]);
        }
        return chars;
    }
    public static void print(){
        for(int i=0;i<chars.size();i++){
            System.out.println(chars.get(i).get_char() + " : " + chars.get(i).get_value());
        }
    }

}
class MyObject{
    private int value;
    private char myChar;

    public MyObject(int p_value, char p_myChar){
        this.value = p_value;
        this.myChar = p_myChar;
    }
    public int get_value(){
        return value;
    }
    public char get_char(){
        return myChar;
    }
    public void increase(){
        value = value+1;
    }
}
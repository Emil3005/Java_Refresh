public class Task2{

//private static String input = "3[b2[ca]aaa]acb";
private static char[] charArray = {'3','[','b','2','[','c','a',']',']'};

public static void main (String [] args){
    calc(charArray , 0);
}

public static void calc (char[] p_charArray, int position){
    int open = 0;
    int closed = 0;
    
        for(int i=position;i<p_charArray.length;i++){
            char current = p_charArray[i];
            if(closed <= open || closed == 0){

            if(Character.isDigit(current)){
                for(int j = 0;j<current;j++){
                    calc(charArray, i+1);
                }
            }else if(current== '['){
                open++;
            }else if(current == ']'){
                closed++;
            }else if(current == ' '){
    
            }else if(current == 'a' || current == 'c' || current == 'b'){
                System.out.print(p_charArray[i]);
            }
        }else{
            calc(p_charArray, i+1);
        }
        }
    
    
/* 


    String[] openBrackets = p_input.split("\\[");
    String [][] closedBrackets = new String[openBrackets.length][];
    
    for(int i =0;i<openBrackets.length;i++){
           closedBrackets[i] = openBrackets[i].split("\\]");
    }
    for(int i =0;i<openBrackets.length;i++){
        for(int j=0;j<closedBrackets[i].length;j++){
           System.out.println("i = " + i + "j = " + j + "value = " + closedBrackets[i][j]);
        }
    }
    */
}
}
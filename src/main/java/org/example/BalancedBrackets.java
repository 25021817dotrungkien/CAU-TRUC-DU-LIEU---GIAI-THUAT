
package org.example;

import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
public class BalancedBrackets {
    public static boolean CheckBracketValid(String str){
        Stack<Character> stack00 = new Stack<>();
        Map<Character, Character> map =  new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        char[] brackets_char = str.toCharArray();
        for (Character i : brackets_char){
            if (i == '(' || i == '[' || i == '{'){
                stack00.push(i);
            }else {
                if (stack00.isEmpty()){
                    return false;
                } else {
                    if (i == map.get(stack00.pop())){
                        continue;
                    } else {
                        return false ;
                    }
                }
            }
        }
        return stack00.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }
}
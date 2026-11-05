package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class equals_stack {
    public static int solution(List<Integer> list1 , List<Integer> list2 , List<Integer> list3){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for (int i = list1.size()-1 ; i >= 0  ; i -- ){
            stack1.push(list1.get(i));
        }
        for (int i = list2.size() -1 ; i >=0 ; i -- ){
            stack2.push(list2.get(i));
        }
        for (int i = list3.size() -1 ; i >= 0 ; i -- ){
            stack3.push(list3.get(i));
        }
        int sum1=0 , sum2=0, sum3=0;
        for(int i : list1){
            sum1+=i;
        }
        for (int i : list2){
            sum2+=i;
        }
        for (int i : list3){
            sum3+=i;
        }
        while (true){
            if (sum1 == sum2 && sum2 == sum3){
                return sum1 ;
            }
            if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()){
                return 0;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1.pop();
            } else if (sum2 >= sum1 && sum2 >= sum3){
                sum2 -= stack2.pop();
            } else {
                sum3 -= stack3.pop();
            }
        }
    }
    public static void main(String[] args) throws IOException{
        List<Integer> list01 = new ArrayList<>();
        List<Integer> list02 = new ArrayList<>();
        List<Integer> list03 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]  quantity = br.readLine().split(" ");
        int a = Integer.parseInt(quantity[0]);
        int b = Integer.parseInt(quantity[1]);
        int c = Integer.parseInt(quantity[2]);
        StringTokenizer st01 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < a ; i ++){
            list01.add(Integer.parseInt(st01.nextToken()));
        }
        StringTokenizer st02 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < b ; i ++){
            list02.add(Integer.parseInt(st02.nextToken()));
        }
        StringTokenizer st03 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < c ; i ++){
            list03.add(Integer.parseInt(st03.nextToken()));
        }
        System.out.println(solution(list01, list02, list03));
    }
}

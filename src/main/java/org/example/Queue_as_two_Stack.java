package org.example ;
import java.util.Stack;
import java.util.Scanner;
public class Queue_as_two_Stack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack stackIn = new Stack();
        Stack stackOut = new Stack();
        int query_count = sc.nextInt();
        for (int i = 0 ; i < query_count ; i++){
            int a = sc.nextInt();
            if (a == 1 ){
                stackIn.push( sc.nextInt());
            } else if (a == 2 ){
                if (stackOut.isEmpty()){
                    while (stackIn.isEmpty() == false){
                        stackOut.push(stackIn.pop());
                    }
                    stackOut.pop();
                } else {
                    stackOut.pop();
                }
            } else if ( a == 3) {
                if (stackOut.isEmpty()){
                    while (stackIn.isEmpty() == false){
                        stackOut.push(stackIn.pop());
                    }
                    stackOut.peek();
                } else {
                    stackOut.peek();
                }
            } else {
                return ;
            }
        }
    }
}
/*
Note cho bài implement a queue using two stacks

=== Note 1 ===
Khi sử dụng nextLine() sau khi dùng nextInt() cần lưu ý.
- vì nextInt() không đọc dấu \n khi nhấn enter nên nó bị thừa. mà nextLine() lại đọc hết.
nên nó nhận luôn "\n".
=== note 2 ===
sử dụng 2 stack để mô phỏng tính chất của queue.
queue vào trước ra trước.
stack vào trước ra sau.

*/
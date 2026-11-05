package org.example;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Simple_Text_Editer {
    static String textRoot = "";
    static Stack<Integer> stackRoot = new Stack<>();
    static Stack<Integer> indexStackUndoAppend = new Stack<>();
    static Stack<String> stringStackUndoDelete = new Stack<>();
    private static void Append(String textAppend){
        int index_previus_step = textRoot.length();
        textRoot += textAppend;
        stackRoot.push(1);
        indexStackUndoAppend.push(index_previus_step);
    }
    private static void Delete(int k){
        int index = textRoot.length() - k;
        stringStackUndoDelete.push(textRoot.substring(index));
        textRoot = textRoot.substring(0, index);
        stackRoot.push(2);
    }
    private static void Print(int k){
        int index = k - 1;
        String textPrint = Character.toString(textRoot.charAt(index));
        System.out.println(textPrint);
    }
    private static void Undo(int type){
        if (type == 1){
            int index = indexStackUndoAppend.pop();
            textRoot = textRoot.substring(0, index);
        } else if (type == 2){
            textRoot += stringStackUndoDelete.pop();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int query_count = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < query_count; i++){
            String[] a = sc.nextLine().split(" ");
            if (Integer.parseInt(a[0]) == 1) {
                String textAppend = a[1];
                Append(textAppend);
            } else if (Integer.parseInt(a[0]) == 2){
                int k = Integer.parseInt(a[1]);
                Delete(k);
            } else if (Integer.parseInt(a[0]) == 3){
                int k = Integer.parseInt(a[1]);
                Print(k);
            } else if (Integer.parseInt(a[0]) == 4){
                int type = stackRoot.pop();
                Undo(type);
            }
        }
    }
}
/*
===== sử lý str trong java =====.
1. lấy 1 kí tự bằng --"charAt(A)"-- - LẤY RA PHẦN TỬ Ở INDEX A.
2. lấy 1 đoạn chuỗi con sử dụng --"substring(a,b)"-- or substring(c)
   LẤY TỪ INDEX A -> (B-1) OR LẤY TỪ INDEX C ĐẾN HẾT.
*/
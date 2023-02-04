package linear_search;

import java.util.Arrays;

public class telephone_list {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++) {
            //if(phone_book[i+1].substring(0, phone_book[i].length()).equals(phone_book[i])) return false;
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
}

package linear_search;

public class number_py {
    static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='p') p++;
            if(s.charAt(i)=='y') y++;
        }
        if(p==y||(p==0&&y==0)) return true;
        else return false;
    }
    public static void main(String[] args){
        String s = "Pyy";
        System.out.println(solution(s));
    }
}

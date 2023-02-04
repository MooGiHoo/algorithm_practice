package linear_search;

public class skillTree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String x : skill_trees) {
            String str = x.replaceAll("[^"+skill+"]", "");
            if(skill.startsWith(str)) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD", skill_trees));
    }
}

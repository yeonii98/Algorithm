import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(answer.contains(my_string.substring(i,i+1))){
                continue;
            }
            answer += my_string.substring(i,i+1);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : completion) {
            map.putIfAbsent(name, 0);
            map.put(name, map.get(name) + 1);
        }
        
        for (String name : participant) {
            if (!map.containsKey(name) || map.get(name) == 0) {
                return name;
            }
            map.put(name, map.get(name) - 1);
        }
        
        return null;
    }
}

import java.util.*;

class ThroneInheritance {

    String king;
    HashMap<String, List<String>> children;
    HashSet<String> dead;

    public ThroneInheritance(String kingName) {
        king = kingName;
        children = new HashMap<>();
        dead = new HashSet<>();
    }

    public void birth(String parentName, String childName) {
        if (!children.containsKey(parentName)) {
            children.put(parentName, new ArrayList<>());
        }

        children.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();

        dfs(king, result);

        return result;
    }

    public void dfs(String person, List<String> result) {

        if (!dead.contains(person)) {
            result.add(person);
        }

        if (children.containsKey(person)) {
            for (String child : children.get(person)) {
                dfs(child, result);
            }
        }
    }
}
##Sample Input
["ThroneInheritance", "birth", "birth", "birth", "birth", "birth", "birth", "getInheritanceOrder", "death", "getInheritanceOrder"]
[["king"], ["king", "andy"], ["king", "bob"], ["king", "catherine"], ["andy", "matthew"], ["bob", "alex"], ["bob", "asha"], [null], ["bob"], [null]]
##Sample Output
[null, null, null, null, null, null, null, ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"], null, ["king", "andy", "matthew", "alex", "asha", "catherine"]]

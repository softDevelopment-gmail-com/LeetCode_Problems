package uz.leetCode.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (List<String> path : paths) {
            if (!map.containsKey(path.get(1)))
                return path.get(1);
        }
        return null;
    }
    //    k          V
//    [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//[["B","C"],["D","B"],["C","A"]]
//[["A","Z"]]
//[["pYyNGfBYbm","wxAscRuzOl"],["kzwEQHfwce","pYyNGfBYbm"]]
}

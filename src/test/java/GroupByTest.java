import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by WCY on 2021/8/16
 */
public class GroupByTest {
    @Test
    public void streamGroupBy() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "wcy");
        map1.put("age", "18");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "lsf");
        map2.put("age", "20");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "zy");
        map3.put("age", "19");

        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "tc");
        map4.put("age", "20");

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        Map<Object, List<Map<String, Object>>> result = list.stream()
                .collect(Collectors.groupingBy((map -> map.get("age"))));
        result.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(v -> {
                System.out.println(v.get("name") + ": " + v.get("age"));
            });
        });

    }
}

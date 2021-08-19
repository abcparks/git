import cn.alex.bean.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by WCY on 2021/8/17
 */
public class DistinctTest {
    @Test
    public void set() {
        Set<Map<String, Object>> set = new HashSet<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "1");
        map1.put("age", "1");
        map1.put("c", 1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "1");
        map2.put("age", "1");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "1");
        map3.put("age", "1");

        System.out.println(map2.equals(map3)); // true

        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "1");
        map4.put("age", "1");

        List<Map<String, Object>> list3 = new ArrayList<>();
        list3.add(map1);
        list3.add(map2);

        List<Map<String, Object>> list4 = new ArrayList<>();
        list4.add(map3);
        list4.add(map4);

        set.addAll(list3);
        set.addAll(list4);

        System.out.println(set.size());
        set.forEach(System.out::println);
    }

    @Test
    public void user() {
        User user1 = new User(1L, "a", 18);
        User user2 = new User(1L, "b", 16);
        User user3 = new User(2L, "c", 17);
        User user4 = new User(3L, "d", 14);
        User user5 = new User(3L, "e", 17);

        List<User> list1 = new ArrayList<>();
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);

        List<User> list2 = new ArrayList<>();
        list2.add(user4);
        list2.add(user5);

        //Set<User> set = new HashSet<>();
        //set.addAll(list1);
        //set.addAll(list2);
        //
        //System.out.println(set.size());
        //set.forEach(System.out::println);

        List<User> list = new ArrayList<>();
        Set<Long> collect = list1.stream().map(User::getUserId).collect(Collectors.toSet());
        if (collect.size() > 5) System.out.println(1);

        System.out.println(collect);

    }
}

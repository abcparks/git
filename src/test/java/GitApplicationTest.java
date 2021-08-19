import org.junit.Test;

/**
 * Created by WCY on 2021/8/13
 */
public class GitApplicationTest {
    @Test
    public void replace() {
        String str = "我爱中国";
        String replace = str.replace("中国", "新中国");
        System.out.println("replace = " + replace);
    }
}

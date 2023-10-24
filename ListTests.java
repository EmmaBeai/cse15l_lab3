import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("ab");
        l1.add("c");
        List<String> l2 = new ArrayList<String>();
        l2.add("a");
        l2.add("ab");
        StringChecker sc = new StringChecker(){
            @Override
            public boolean checkString(String s) {
                return s.startsWith("a");
            }
        };
        l1 = ListExamples.filter(l1, sc);
        assertEquals(l2, l1);

    
    }

    @Test 
    public void testMerge(){
        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("wdifue");
        l1.add("c");
        List<String> l2 = new ArrayList<String>();
        l2.add("ab");
        l2.add("hjsdfbwer");
        l2.add("jgkfdsn");
        List<String> l3 = new ArrayList<String>();
        l3.add("a");
        l3.add("ab");
        l3.add("c");
        l3.add("wdifue");
        l3.add("hjsdfbwer");
        l3.add("jgkfdsn");
        List<String> l4 = new ArrayList<String>();
        l4 = ListExamples.merge(l1,l2);
        assertEquals(l3,l4);

    }
}

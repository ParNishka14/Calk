import org.example.fart_task.ListMerger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestList {
    @Test
    void test1(){
        List<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        List<String> l2 = new ArrayList<>();
        l2.add("a");
        l2.add("c");
        l2.add("b");
        l2.add("d");
        List<String> exx = new ArrayList<>();
        assertEquals(exx,ListMerger.mergeAndRemoveDuplicates(l1,l2) );
    }

    @Test
    void test2(){
        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("b");
        l1.add("c");
        List<String> l2 = new ArrayList<>();
        l2.add("a");
        l2.add("3");
        l2.add("b");
        l2.add("d");
        List<String> exx = new ArrayList<>();
        exx.add("1");
        exx.add("c");
        Collections.sort(exx);
        assertEquals(exx,ListMerger.mergeAndRemoveDuplicates(l1,l2) );
    }

    @Test
    void test3(){
        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("3");
        List<String> l2 = new ArrayList<>();
        l2.add("1");
        l2.add("3");
        l2.add("2");
        l2.add("5");
        List<String> exx = new ArrayList<>();
        Collections.sort(exx);
        assertEquals(exx,ListMerger.mergeAndRemoveDuplicates(l1,l2) );
    }
    @Test
    void test4(){
        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("3");
        l1.add("14");
        List<String> l2 = new ArrayList<>();
        l2.add("1");
        l2.add("3");
        l2.add("2");
        l2.add("5");
        List<String> exx = new ArrayList<>();
        exx.add("14");
        Collections.sort(exx);

        assertEquals(exx,ListMerger.mergeAndRemoveDuplicates(l1,l2) );
    }
    @Test
    void test5(){
        List<String> l1 = new ArrayList<>();
        l1.add("Andrey");
        l1.add("Nikita");
        l1.add("3");
        l1.add("3");
        l1.add("14");
        List<String> l2 = new ArrayList<>();
        l2.add("1");
        l2.add("Andrey");
        l2.add("2");
        l2.add("5");
        List<String> exx = new ArrayList<>();
        exx.add("Nikita");
        exx.add("14");
        exx.add("3");
        exx.add("3");
        Collections.sort(exx);
        assertEquals(exx,ListMerger.mergeAndRemoveDuplicates(l1,l2) );
    }
}

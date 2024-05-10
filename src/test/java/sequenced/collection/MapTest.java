package sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {
    @Test
    void map() {

        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Alvenio");
        map.put("b", "Farhan");
        map.put("a", "Prayogo");

        Assertions.assertEquals("Prayogo", map.firstEntry().getValue());
        Assertions.assertEquals("Alvenio", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        Assertions.assertEquals("Prayogo", reversed.lastEntry().getValue());
        Assertions.assertEquals("Alvenio", reversed.firstEntry().getValue());
    }

    @Test
    void linkedMap() {
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "Alvenio"); // a
        map.putFirst("b", "Farhan"); // b, a
        map.putFirst("c", "Prayogo"); // c, b, a

        Assertions.assertEquals("Prayogo", map.firstEntry().getValue());
        Assertions.assertEquals("Alvenio", map.lastEntry().getValue());
    }
}

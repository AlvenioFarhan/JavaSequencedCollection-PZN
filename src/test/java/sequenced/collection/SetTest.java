package sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SetTest {
    @Test
    void set() {

        SequencedSet<String> set = new TreeSet<>();
        set.add("Alvenio"); // Alvenio
        set.add("Joko"); // Alvenio, Joko
        set.add("Budi"); // Alvenio, Budi, Joko

        Assertions.assertEquals("Alvenio", set.getFirst());
        Assertions.assertEquals("Joko", set.getLast());

        SequencedSet<String> reversed = set.reversed();

        Assertions.assertEquals("Alvenio", reversed.getLast());
        Assertions.assertEquals("Joko", reversed.getFirst());

        String value = set.removeFirst();
        Assertions.assertEquals("Alvenio", value);

        value = set.removeFirst();
        Assertions.assertEquals("Budi", value);
    }
}

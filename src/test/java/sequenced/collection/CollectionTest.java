package sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {
    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("Prayogo");
        list.addFirst("Farhan");
        list.addFirst("Alvenio"); // Alvenio, Farhan, Prayogo

        Assertions.assertEquals(List.of("Alvenio", "Farhan", "Prayogo"), list);

        Assertions.assertEquals("Alvenio", list.getFirst());
        Assertions.assertEquals("Prayogo", list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("Prayogo", "Farhan", "Alvenio"), reversed);

        String value = list.removeFirst();
        Assertions.assertEquals("Alvenio", value);
        Assertions.assertEquals("Farhan", list.getFirst());

        value = list.removeLast();
        Assertions.assertEquals("Prayogo", value);
        Assertions.assertEquals("Farhan", list.getLast());
    }
}

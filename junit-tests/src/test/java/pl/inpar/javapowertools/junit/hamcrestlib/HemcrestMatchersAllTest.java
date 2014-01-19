package pl.inpar.javapowertools.junit.hamcrestlib;

import org.junit.Test;
import pl.inpar.javapowertools.junit.pojos.Client;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


//  Added to POM:
//
//<dependency>
//	<groupId>org.hamcrest</groupId>
//	<artifactId>hamcrest-all</artifactId>
//	<version>1.3</version>
//</dependency>

public class HemcrestMatchersAllTest {

    @Test
    public void listHasItemTest() {
        List<String> colors = new ArrayList<String>(Arrays.asList("red", "green", "blue"));

        // assertThat - nie moze byc z org.hamcrest.CoreMatchers zeby dzialal hasItem!
        assertThat(colors, hasItem("blue"));
    }

    @Test
    public void isInListTest() {
        List<Integer> ages = Arrays.asList(20, 30, 40);
        assertThat(20, isIn(ages));
    }

    @Test
    public void mapHasValueTest() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("color", "red");
        map.put("grubosc", "400");

        assertThat(map, hasValue("red"));
        assertThat(map, not(hasValue("blue")));
    }

    @Test
    public void objectHasPropertyWithValue() {
        Client client = new Client();
        client.setClientName("Monic");

        assertThat(client, hasProperty("clientName", is("Monic")));

    }

    @Test
    public void rangeTest() {

        assertThat(123, greaterThan(10));

        assertThat(123, lessThan(200));

        assertThat(123, greaterThanOrEqualTo(123));

        assertThat(123, allOf(greaterThan(10), lessThan(200)));

    }

}

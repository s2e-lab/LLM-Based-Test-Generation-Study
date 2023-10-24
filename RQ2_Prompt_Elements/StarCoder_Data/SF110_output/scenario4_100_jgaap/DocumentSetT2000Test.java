// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {

    /**
    * Test method for {@link DocumentSet#documentCount()}.
    */
    @Test
    void testDocumentCount() {
        DocumentSet ds = new DocumentSet();
        assertEquals(0, ds.documentCount());
        ds.register(new Document("a"));
        assertEquals(1, ds.documentCount());
        ds.register(new Document("b"));
        assertEquals(2, ds.documentCount());
        ds.register(new Document("c"));
        assertEquals(3, ds.documentCount());
        ds.register(new Document("d"));
        assertEquals(4, ds.documentCount());
        ds.register(new Document("e"));
        assertEquals(5, ds.documentCount());
        ds.register(new Document("f"));
        assertEquals(6, ds.documentCount());
        ds.register(new Document("g"));
        assertEquals(7, ds.documentCount());
        ds.register(new Document("h"));
        assertEquals(8, ds.documentCount());
        ds.register(new Document("i"));
        assertEquals(9, ds.documentCount());
        ds.register(new Document("j"));
        assertEquals(10, ds.documentCount());
    }
}

// Document.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;

/**
 * A Document is a single document written by a single author.
 * This can be used to facilitate event sets that are larger than just
 * a single document, which may be more indicative of an author's
 * entire body of work.
 */
public class Document {

    public String author;
    public String text;

    Document(String author, String text) {
        this.author = author;
        this.text = text;
    }

    Document(String text) {
        this.text = text;
    }

    /**
     * Returns the author of this document
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the text of this document
     */
    public String getText() {
        return text;
    }
}

// DocumentTest.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#getAuthor()} and {@link Document#getText()} methods.
*/
class DocumentTest {
		
    /**
    * Test method for {@link Document#getAuthor()}.
    */
    @Test
    void testGetAuthor() {
        Document d = new Document("a", "b");
        assertEquals("a", d.getAuthor());
    }

    /**
    * Test method for {@link Document#getText()}.
    */
    @Test
    void testGetText() {
        Document d = new Document("a", "b");
        assertEquals("b", d.getText());
    }
}

// EventSet.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;

/**
 * An Event Set is a group of events that are related to each other.
 * This can be used to facilitate event sets that are larger than just
 * a single document, which may be more indicative of an author's
 * entire body of work.
 */
public class EventSet {

    public Hashtable frequency;

    Vector<Event> events;

    EventSet() {
    }

    EventSet(Event e) {
    }

    /**
     * Registers a new event to the list of events by a given author.
     *  The event is appended on to the end of the list.
     */
    public void register(Event e);

    /**
     * Number of events currently registered in this set of events*
     */
    public int eventCount();

    /**
     * Returns an individual indexed event.  The index is given by the
     *  order in which the events were registered with the EventSet
     */
    public Event getEvent(int index);

    /**
     * Calculates the frequency of individual characters within the entire
     *  set of events.  Each character is a key in a hashtable with the value
     *  being the frequency of occurrance. This is legacy code rewritten and was
     *  included for completeness.
     */
    public void characterFrequency();

    /**
     * Calculates the frequency of full  words within the entire
     *  set of events.  Each word is a key in a hashtable with the value
     *  being the frequency of occurrance. This is legacy code rewritten and was
     *  included for completeness.
     */
    public void wordFrequency();

    /**
     * Returns the top most common words in the event with the rest
     *  replaced with a placeholder.  This is also legacy code, rewritten,
     *  generalized, and replaced from the old code.
     *  Side Note:  This code should probably be moved to the EventSet class,
     *  along with the frequency analysis classes.  This will allow character
     *  and word frequencies to be generalized to event frequencies, by returning
     *  the N most common events, replacing the rest with a generic event.
     */
    public void mostCommon(int n);
}

// EventSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#eventCount()} method.
*/
class EventSetTest {
		
    /**
    * Test method for {@link EventSet#eventCount()}.
    */
    @Test
    void testEventCount() {
        EventSet es = new EventSet();
        assertEquals(0, es.eventCount());
        es.register(new Event("a"));
        assertEquals(1, es.eventCount());
        es.register(new Event("b"));
        assertEquals(2, es.eventCount());
        es.register(new Event("c"));
        assertEquals(3, es.eventCount());
        es.register(new Event("d"));
        assertEquals(4, es.eventCount());
        es.register(new Event("e"));
        assertEquals(5, es.eventCount());
        es.register(new Event("f"));
        assertEquals(6, es.eventCount());
        es.register(new Event("g"));
        assertEquals(7, es.eventCount());
        es.register(new Event("h"));
        assertEquals(8, es.eventCount());
        es.register(new Event("i"));
        assertEquals(9, es.eventCount());
        es.register(new Event("j"));
        assertEquals(10, es.eventCount());
    }
}

// Event.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;

/**
 * An Event is a single event that is related to other events.
 * This can be used to facilitate event sets that are larger than just
 * a single document, which may be more indicative of an author's
 * entire body of work.
 */
public class Event {

    public String author;
    public String text;

    Event(String author, String text) {
        this.author = author;
        this.text = text;
    }

    Event(String text) {
        this.text = text;
    }

    /**
     * Returns the author of this event
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the text of this event
     */
    public String getText() {
        return text;
    }
}

// EventTest.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Event}.
* It contains ten unit test cases for the {@link Event#getAuthor()} and {@link Event#getText()} methods.
*/
class EventTest {
		
    /**
    * Test method for {@link Event#getAuthor()}.
    */
    @Test
    void testGetAuthor() {
        Event e = new Event("a", "b");
        assertEquals("a", e.getAuthor());
    }

    /**
    * Test method for {@link Event#getText()}.
    */
    @Test
    void testGetText() {
        Event e = new Event("a", "b");
        assertEquals("b", e.getText());
    }
}

// FrequencyAnalysis.java

import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;

/**
 * A Frequency Analysis is a class that can be used to analyze the frequency
 *  of
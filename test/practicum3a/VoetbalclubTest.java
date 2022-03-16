package practicum3a;

import org.junit.jupiter.api.Test;
import practicum4b.AutoHuur;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    public void test1(){
        Voetbalclub dosc = new Voetbalclub("");
        assertEquals("FC 0 0 0 0 0", dosc.toString());
    }
    @Test
    public void test2(){
        Voetbalclub dosc = new Voetbalclub("DOSC");
        assertEquals("DOSC 0 0 0 0 0", dosc.toString());
    }
    @Test
    public void test3(){
        Voetbalclub dosc = new Voetbalclub("DOSC");
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('g');
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('g');
        assertEquals("DOSC 8 6 2 0 20", dosc.toString());
    }
    @Test
    public void test4(){
        Voetbalclub dosc = new Voetbalclub("DOSC");
        dosc.verwerkResultaat('w');
        dosc.verwerkResultaat('k');
        assertEquals("DOSC 1 1 0 0 3", dosc.toString());
    }
}

package dr.edu.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class HelloTest {
    

    @Test
    public void testRetornarHelloNomeSePassarNome() {
        Hello hello = new Hello("Marlon");
        assertEquals("Hello Marlon", hello.getMessage());
        
    }
    
    @Test
    public void testRetornarHelloSemnome() {
        Hello hello = new Hello();
        assertEquals("Hello", hello.getMessage());
    }
    
}

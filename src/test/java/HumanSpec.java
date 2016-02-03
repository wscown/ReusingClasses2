/**
 * Created by wscown on 2/3/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class HumanSpec {

    //With
    Human human = new Human();

    SuperHuman superHuman = new SuperHuman();

    @Test
    public void testClassTypes(){
        assertTrue("Class type of human should be Human but this was not returned", human.getClass().getName().equals("Human"));
        assertTrue("Class type of superHuman should be SuperHuman but this was not returned", superHuman.getClass().getName().equals("SuperHuman"));

        assertTrue("printHuman method in Human should return 0 but this did not occur", human.printHuman() == 0);
        assertTrue("printHuman method in SuperHuman should return 0 but this did not occur", superHuman.printHuman() == 1);
    }


}

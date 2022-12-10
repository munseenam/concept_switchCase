import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class switchCaseTest {

    switchCase testAnimal=new switchCase();
@Test
    public void exampleOfSwitchTest(){


assertEquals("domestic animal",testAnimal.exampleOfSwitch("DOG"));
assertEquals("domestic animal",testAnimal.exampleOfSwitch("CAT"));
assertEquals("wild animal",testAnimal.exampleOfSwitch("TIGER"));


    }


}
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EightBallTest {
// i need to specify getWords
    private EightBall eightBall;

    @Before
    public void before(){
        ArrayList<String> words = new ArrayList<>();
            words.add("It's Monday");
            words.add("It's Tuesday");
            words.add("It's Wednesday");
            words.add("It's Thursday");
            eightBall = new EightBall(words);

    }

    @Test
    public void canAddWords(){
        EightBall.add("It's Monday");
        assertEquals("It's Monday" eightBall.words);

    }

    @Test
    public void canGetRandomWords(){
        ArrayList results = eightBall.words();
        String randomWords = eightBall.getRandomWords();
        assertTrue(results.contains(randomWords));

    }

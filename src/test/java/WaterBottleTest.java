import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;
    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }
    @Test
    public void canGetVolume(){
        assertEquals(100, waterbottle.getVolume());
    }
    @Test
    public void canDecreaseVolumeTo90(){
        assertEquals(90, waterbottle.drink());
    }@Test
    public void canDecreaseVolumeTo80(){
        waterbottle.drink();
        assertEquals(80, waterbottle.drink());
    }
    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }
    @Test
    public void cannotGoNegative(){
        waterbottle.empty();
        assertEquals(0, waterbottle.drink());
    }
    @Test
    public void canFill(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}

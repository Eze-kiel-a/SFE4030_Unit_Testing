import org.example.Main;
import org.example.RomanNumeral;
import org.junit.Assert;
import org.junit.Test;

public class RomanTest {
    @Test
    public void bug(){
        int result = new RomanNumeral().romanToInt("II");
        Assert.assertEquals(2, result);
    }

    @Test
    public void singleDigit(){
        Assert.assertEquals(1, new RomanNumeral().romanToInt("I"));
        Assert.assertEquals(5, new RomanNumeral().romanToInt("V"));
        Assert.assertEquals(10, new RomanNumeral().romanToInt("X"));
        Assert.assertEquals(50, new RomanNumeral().romanToInt("L"));
        Assert.assertEquals(100, new RomanNumeral().romanToInt("C"));
        Assert.assertEquals(500, new RomanNumeral().romanToInt("D"));
        Assert.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    @Test
    public void repetition(){
        Assert.assertEquals(2, new RomanNumeral().romanToInt("II"));
        Assert.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    @Test
    public void manyLettersInOrder(){
        Assert.assertEquals(6, new RomanNumeral().romanToInt("VI"));
        Assert.assertEquals(15, new RomanNumeral().romanToInt("XV"));
    }

    @Test
    public void inValidLetter(){
        Assert.assertEquals(0, new RomanNumeral().romanToInt("Z"));
    }

    @Test
    public void invalidAndValidLetter(){
        Assert.assertEquals(5, new RomanNumeral().romanToInt("VZ"));
        Assert.assertEquals(5, new RomanNumeral().romanToInt("ZV"));
    }

    @Test
    public void manyNotValid(){
        Assert.assertEquals(0, new RomanNumeral().romanToInt("ZZ"));
    }

    @Test
    public void subtractiveNotation(){
        Assert.assertEquals(9, new RomanNumeral().romanToInt("IX"));
    }

    @Test
    public void withoutSubtractiveNotation(){
        Assert.assertEquals(11, new RomanNumeral().romanToInt("XI"));
    }


    @Test
    public void isNull(){
        Assert.assertEquals(0, new RomanNumeral().romanToInt(" "));
    }
}

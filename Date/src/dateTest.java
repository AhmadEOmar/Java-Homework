/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.junit.Assert
 *  org.junit.Test
 */
import org.junit.Assert;
import org.junit.Test;

public class dateTest {
    @Test
    public void testRealMonth() {
        Date myDate = new Date(1, 1);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"January", (Object)result);
    }

    @Test
    public void testFakeMonth() {
        Date myDate = new Date(13, 1);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"UNKNOWN", (Object)result);
    }

    @Test
    public void testZeroMonth() {
        Date myDate = new Date(0, 1);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"UNKNOWN", (Object)result);
    }

    @Test
    public void testNegativeMonth() {
        Date myDate = new Date(-1, 1);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"UNKNOWN", (Object)result);
    }

    @Test
    public void testFalseDate() {
        Date myDate = new Date(1, 35);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"UNKNOWN", (Object)result);
    }

    @Test
    public void testNegativeDate() {
        Date myDate = new Date(1, -35);
        String result = myDate.getMonth();
        Assert.assertEquals((Object)"UNKNOWN", (Object)result);
    }

    @Test
    public void testMonthName() {
        Month myMonth = new Month("Banana", 15, 50);
        String result = myMonth.getMonthName();
        Assert.assertEquals((Object)"Banana", (Object)result);
    }

    @Test
    public void testFalseDay() {
        Date myDate = new Date(1, 35);
        Assert.assertFalse((boolean)myDate.isValidDay());
    }

    @Test
    public void testTrueDay() {
        Date myDate = new Date(1, 25);
        Assert.assertTrue((boolean)myDate.isValidDay());
    }

    @Test
    public void testFalseMonth() {
        Date myDate = new Date(15, 25);
        Assert.assertFalse((boolean)myDate.isValidMonth());
    }

    @Test
    public void testTrueMonth() {
        Date myDate = new Date(12, 25);
        Assert.assertTrue((boolean)myDate.isValidMonth());
    }

    @Test
    public void testMonthNumber() {
        Month myMonth = new Month("Jaunary", 1, 25);
        int result = myMonth.getMonthNumber();
        Assert.assertEquals((long)1, (long)result);
    }
}
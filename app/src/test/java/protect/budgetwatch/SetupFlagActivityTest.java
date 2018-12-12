package protect.budgetwatch;

import junit.framework.Assert;

public class SetupFlagActivityTest
{
    SetupflagActivity.flag calculater = new SetupflagActivity.flag();
    @org.junit.Test

    public void testis_true()
    {
        double a=2.333,b=1.222,c=1.112;
        boolean result = calculater.is_true(a, b,c);
        Assert.assertEquals(result, true);
    }
}

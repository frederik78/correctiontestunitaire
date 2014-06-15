package fr.fred.correctiontestunitaire;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Frederic on 14/06/14.
 */
public class LamaWoolServiceTest {

    private LamaWoolService service = new LamaWoolService(new MutableDateTime(2014, 01, 10, 0, 0, 0, 0));

    @Test
    public void checkShearDate_AllOk() throws Exception {
        assertTrue(service.isWoolTooOldToSell(new DateTime(2014, 01, 15, 0, 0, 0)));
    }
}

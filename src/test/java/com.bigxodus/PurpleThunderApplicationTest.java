package com.bigxodus;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author: Lawrence
 * @since: 2016. 5. 15.
 * @note:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(PurpleThunderApplication.class)
@WebAppConfiguration
public class PurpleThunderApplicationTest {

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void printTest() throws Exception {
        System.out.println("Hello World!");
        assertThat(capture.toString(), containsString("Hello"));
    }

}

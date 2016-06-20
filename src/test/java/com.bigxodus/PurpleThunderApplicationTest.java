package com.bigxodus;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void printTest() throws Exception {

        logger.info("here");
        System.out.println("Hello World!");
        assertThat(capture.toString(), containsString("Hello"));
    }

}

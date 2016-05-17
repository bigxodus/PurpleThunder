package com.bigxodus.services.quest;

import com.bigxodus.PurpleThunderApplication;
import com.bigxodus.domains.quest.Quest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * @author: Lawrence
 * @since: 2016. 5. 7.
 * @note:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(PurpleThunderApplication.class)
@WebAppConfiguration
@ActiveProfiles
public class QuestServiceTest {

    @Autowired
    QuestService questService;

    @Test
    public void getByIdReturnNotNullObject() throws Exception {
        Quest quest = questService.getById(0L);
        assertNotNull(quest);
    }

}

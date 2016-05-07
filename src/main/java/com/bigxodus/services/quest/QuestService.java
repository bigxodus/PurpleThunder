package com.bigxodus.services.quest;

import com.bigxodus.domains.quest.Quest;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
public interface QuestService {

    public Quest getById(Long id);
    public List<Quest> getByIds(List<Long> ids);

    public Quest save(Quest quest);
    public Quest update(Quest quest);
}

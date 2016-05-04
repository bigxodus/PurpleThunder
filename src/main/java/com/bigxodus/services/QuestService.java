package com.bigxodus.services;

import com.bigxodus.domains.Quest;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
public interface QuestService {

    public Quest getById(Long id);
    public List<Quest> getByIds(List<Long> ids);
}

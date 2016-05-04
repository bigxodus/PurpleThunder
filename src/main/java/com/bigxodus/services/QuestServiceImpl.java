package com.bigxodus.services;

import com.bigxodus.domains.Quest;
import com.bigxodus.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
@Service
public class QuestServiceImpl implements QuestService {

    @Autowired
    private QuestRepository questRepository;

    @Override
    public Quest getById(Long id) {
        return questRepository.findOne(id);
    }

    @Override
    public List<Quest> getByIds(List<Long> ids) {
        return questRepository.findAll(ids);
    }
}

package com.bigxodus.services.quest;

import com.bigxodus.domains.quest.Quest;
import com.bigxodus.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
@Service
@Transactional(readOnly = true)
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

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Quest save(Quest quest) {
        return questRepository.save(quest);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Quest update(Quest quest) {
        Quest updatedQuest = questRepository.findOne(quest.getQuestId());

        updatedQuest.setTitle(quest.getTitle());
        updatedQuest.setDescription(quest.getDescription());
        updatedQuest.setLatitude(quest.getLatitude());
        updatedQuest.setLongitude(quest.getLongitude());
        updatedQuest.setEditTm(LocalDateTime.now());

        return updatedQuest;
    }
}

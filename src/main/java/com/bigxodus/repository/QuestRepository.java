package com.bigxodus.repository;

import com.bigxodus.domains.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */
public interface QuestRepository extends JpaRepository<Quest, Long> {
}
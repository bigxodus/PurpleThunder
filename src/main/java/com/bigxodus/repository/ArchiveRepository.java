package com.bigxodus.repository;

import com.bigxodus.domains.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */
public interface ArchiveRepository extends JpaRepository<Archive, Long> {
}

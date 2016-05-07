package com.bigxodus.repository;

import com.bigxodus.domains.archive.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */
public interface ArchiveRepository extends JpaRepository<Archive, Long> {

    // http://docs.spring.io/spring-data/jpa/docs/1.4.3.RELEASE/reference/html/jpa.repositories.html

    List<Archive> findByUserId(Long userId);

}

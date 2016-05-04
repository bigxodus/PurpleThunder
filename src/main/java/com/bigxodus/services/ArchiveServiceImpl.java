package com.bigxodus.services;

import com.bigxodus.domains.Archive;
import com.bigxodus.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
@Service
public class ArchiveServiceImpl implements ArchiveService{

    @Autowired
    ArchiveRepository archiveRepository;

    @Override
    public Archive getById(Long id) {
        return archiveRepository.findOne(id);
    }

    @Override
    public List<Archive> getByIds(List<Long> ids) {
        return archiveRepository.findAll(ids);
    }

    @Override
    public List<Archive> getByUserId(Long id) {
        return archiveRepository.findByUserId(id);
    }
}

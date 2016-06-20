package com.bigxodus.services.archive;

import com.bigxodus.domains.archive.Archive;
import com.bigxodus.repository.ArchiveRepository;
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

    @Override
    @Transactional(readOnly = false, propagation= Propagation.REQUIRED, rollbackFor={Exception.class})
    public Archive update(Archive archive) {
        Archive updatedArchive = archiveRepository.findOne(archive.getArchiveId());
        updatedArchive.setContent(archive.getContent());
        updatedArchive.setEditTm(LocalDateTime.now());
        return updatedArchive;
    }

    @Override
    @Transactional(readOnly = false, propagation= Propagation.REQUIRED, rollbackFor={Exception.class})
    public Archive archiveQuest(Archive archive) {
        Archive updatedArchive = archiveRepository.findOne(archive.getArchiveId());
        updatedArchive.setContent(archive.getContent());
        updatedArchive.setEditTm(LocalDateTime.now());
        updatedArchive.setStartTm(archive.getStartTm());
        updatedArchive.setEndTm(LocalDateTime.now());
        return updatedArchive;
    }
}

package com.bigxodus.services.archive;

import com.bigxodus.domains.archive.Archive;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 5. 4.
 * @note:
 */
public interface ArchiveService {

    public Archive getById(Long id);
    public List<Archive> getByIds(List<Long> ids);

    public List<Archive> getByUserId(Long id);

    public Archive archiveQuest(Archive archive);
    public Archive update(Archive archive);
}

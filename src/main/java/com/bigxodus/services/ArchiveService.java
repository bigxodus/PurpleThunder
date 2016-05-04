package com.bigxodus.services;

import com.bigxodus.domains.Archive;

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
}

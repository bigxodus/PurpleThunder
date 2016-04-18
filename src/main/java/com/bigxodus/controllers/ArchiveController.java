package com.bigxodus.controllers;

import com.bigxodus.common.Util;
import com.bigxodus.domains.Archive;
import com.bigxodus.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */

@RestController
@RequestMapping(value="/api/archive")
public class ArchiveController {

    @Autowired
    private ArchiveRepository archiveRepository;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Archive> getArchiveByIds(@PathVariable("id") Long id) {
        Archive archive = archiveRepository.findOne(id);
        return Util.toList(archive);
    }

    @RequestMapping(method=RequestMethod.GET, params={"userId"})
    public List<Archive> getArchiveByUserId(@RequestParam("userId")Long userId) {
        List<Archive> lists = archiveRepository.findAll();
        return lists;
    }


}

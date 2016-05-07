package com.bigxodus.controllers.archive;

import com.bigxodus.domains.archive.Archive;
import com.bigxodus.services.archive.ArchiveService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    ArchiveService archiveService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Archive> getArchiveByIds(@PathVariable("id") Long id) {
        List<Long> ids = new ArrayList<>();

        ids.add(0L);
        ids.add(1L);

        return archiveService.getByIds(ids);
    }

    @RequestMapping(method=RequestMethod.GET, params={"userId"})
    public List<Archive> getArchiveByUserId(@RequestParam("userId")Long userId) {
        return archiveService.getByUserId(userId);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Archive save(@RequestBody Archive archive){
        return archiveService.archiveQuest(archive);
    }
}

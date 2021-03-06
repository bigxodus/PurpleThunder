package com.bigxodus.controllers.quest;

import com.bigxodus.domains.quest.Quest;
import com.bigxodus.services.quest.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/quest")
public class QuestController {

    @Autowired
    QuestService questService;

    @RequestMapping(method = RequestMethod.GET, params={"lat", "lon"})
    public List<Quest> getQuestsByIds(@RequestParam("lat") Double lat, @RequestParam("lon") double lon) {
        // LAT, Latitude  ;  위도 (한국에서는 북위)
        // LON, Longitude  ;  경도 (한국에서는 동경)

        System.out.println(lat);
        System.out.println(lon);

        List<Quest> quests = new ArrayList<Quest>();

        Quest q = new Quest();

        q.setQuestId(1L);
        q.setLatitude(3D);
        q.setLongitude(7D);
        q.setTitle("스터디");
        q.setDescription("스터디를 진행한다.");

        Quest q1 = new Quest();

        q1.setQuestId(1L);
        q1.setLatitude(3D);
        q1.setLongitude(7D);
        q1.setTitle("스터디");
        q1.setDescription("스터디를 진행한다.");

        quests.add(q);
        quests.add(q1);

        return quests;
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Quest update(@RequestBody Quest quest) {
        Quest updatedQuest = questService.update(quest);
        return updatedQuest;
    }

    @RequestMapping(method=RequestMethod.POST)
    public Quest save(@RequestBody Quest quest) {
        // validation!!
        LocalDateTime today = LocalDateTime.now();
        quest.setRegTm(today);
        Quest savedQuest = questService.save(quest);
        System.out.println(savedQuest);
        return savedQuest;
    }

    @RequestMapping(value="/default", method = RequestMethod.GET)
    public List<Quest> getQuestsByIds() {
        // LAT, Latitude  ;  위도 (한국에서는 북위)
        // LON, Longitude  ;  경도 (한국에서는 동경)
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        ids.add(1L);
        return questService.getByIds(ids);
    }
}

package com.bigxodus.controllers;

import com.bigxodus.domains.Quest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/quest")
public class QuestController {

    @RequestMapping(method = RequestMethod.GET, params={"lat", "lon"})
    public List<Quest> getQuestsByIds(@RequestParam("lat") int lat, @RequestParam("lon") int lon) {
        // LAT, Latitude  ;  위도 (한국에서는 북위)
        // LON, Longitude  ;  경도 (한국에서는 동경)

        System.out.println(lat);
        System.out.println(lon);

        List<Quest> quests = new ArrayList<Quest>();

        Quest q = new Quest();

        q.setQuestId(1L);
        q.setLatitude(3L);
        q.setLongitude(7L);
        q.setTitle("스터디");
        q.setDescription("스터디를 진행한다.");

        Quest q1 = new Quest();

        q1.setQuestId(1L);
        q1.setLatitude(3L);
        q1.setLongitude(7L);
        q1.setTitle("스터디");
        q1.setDescription("스터디를 진행한다.");

        quests.add(q);
        quests.add(q1);

        return quests;
    }

//    @RequestMapping(method = RequestMethod.GET, params = {"lat"})
//    public List<Quest> getQuestsByIds(@RequestParam("lat") Long lat) {
//        // LAT, Latitude  ;  위도 (한국에서는 북위)
//        // LON, Longitude  ;  경도 (한국에서는 동경)
//
//        System.out.println(lat);
////        System.out.println(lon);
//
//        return null;
//    }
}

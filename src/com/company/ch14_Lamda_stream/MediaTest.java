package com.company.ch14_Lamda_stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MediaTest {
    public static void main(String[] args) {


        ArrayList<Map<String, String>> testList = new ArrayList<>();
        Map<String, String> testMap = new HashMap<>();
        testMap.put("media_id", "CD20255777");
        testMap.put("video_profile", "TV1_UHD_H265");
        testMap.put("audio_profile", "AUDIO1-MC_1TK_AAC_2CH");

        Map<String, String> testMap2 = new HashMap<>();
        testMap2.put("media_id", "CD20255777");
        testMap2.put("video_profile", "TV2_UHD_H265");
        testMap2.put("audio_profile", "AUDIO2-MC_1TK_AAC_2CH");

        Map<String, String> testMap3 = new HashMap<>();
        testMap3.put("media_id", "CD20255777");
        testMap3.put("video_profile", "TV3_UHD_H265");
        testMap3.put("audio_profile", "AUDIO3-MC_1TK_AAC_2CH");

        Map<String, String> testMap4 = new HashMap<>();
        testMap4.put("media_id", "CD20255778");
        testMap4.put("video_profile", "TV4_UHD_H265");
        testMap4.put("audio_profile", "AUDIO4-MC_1TK_AAC_2CH");

        Map<String, String> testMap5 = new HashMap<>();
        testMap5.put("media_id", "CD20255778");
        testMap5.put("video_profile", "TV5_UHD_H265");
        testMap5.put("audio_profile", "AUDIO5-MC_1TK_AAC_2CH");

        Map<String, String> testMap6 = new HashMap<>();
        testMap6.put("media_id", "CD20255778");
        testMap6.put("video_profile", "TV6_UHD_H265");
        testMap6.put("audio_profile", "AUDIO6-MC_1TK_AAC_2CH");
        testList.add(testMap);
        testList.add(testMap2);
        testList.add(testMap3);
        testList.add(testMap4);
        testList.add(testMap5);
        testList.add(testMap6);


        Map<String, List<Map<String, String>>> media_id = testList.stream().collect(Collectors.groupingBy(out -> out.get("media_id")));
        ArrayList<Map<String, Object>> encodingProfiles = new ArrayList<>();

        for ( String key : media_id.keySet() ){
            Map<String, Object> profileMap = new HashMap<>();
            profileMap.put("media_id", key);

            List<Map<String, String>> maps = media_id.get(key);

            ArrayList<Map<String, String>> profiles = new ArrayList<>();
            for (Map<String, String> encodingItem : maps) {
                Map<String, String> profile = new HashMap<>();
                profile.put("video_profile", encodingItem.get("video_profile"));
                profile.put("audio_profile", encodingItem.get("audio_profile"));
                profiles.add(profile);
            }
            profileMap.put("profiles", profiles);
            encodingProfiles.add(profileMap);
            
        }

        System.out.println("encodingProfiles = " + encodingProfiles);
        Map<String, Map<String, Object>> statusDetails = (Map<String, Map<String, Object>>) media_id.get("status_details");
        System.out.println("statusDetails = " + statusDetails);
        System.out.println("encodingProfiles = " + encodingProfiles);
        System.out.println("encodingProfiles = " + encodingProfiles);







    }
}



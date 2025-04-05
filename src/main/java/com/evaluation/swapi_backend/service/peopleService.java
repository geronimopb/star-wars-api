package com.evaluation.swapi_backend.service;

import com.evaluation.swapi_backend.model.person;
import com.evaluation.swapi_backend.model.swapiPeopleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class peopleService {

    private final RestTemplate restTemplate;
    private static final String SWAPI_PEOPLE_URL = "https://swapi.dev/api/people/";
    private static final List<person> localPeople = new ArrayList<>();

    @Autowired
    public peopleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Map<String, Object>> getAllPeople() {
        swapiPeopleResponse response = restTemplate.getForObject(SWAPI_PEOPLE_URL, swapiPeopleResponse.class);
        List<Map<String, Object>> combined = new ArrayList<>();

        if (response != null && response.getResults() != null) {
            combined.addAll(response.getResults());
        }

        for (person person : localPeople) {
            Map<String, Object> personMap = new HashMap<>();
            personMap.put("name", person.getName());
            personMap.put("height", person.getHeight());
            personMap.put("mass", person.getMass());
            personMap.put("hair_color", person.getHairColor());
            personMap.put("skin_color", person.getSkinColor());
            combined.add(personMap);
        }

        return combined;
    }

    public void addPerson(person person) {
        localPeople.add(person);
    }
}

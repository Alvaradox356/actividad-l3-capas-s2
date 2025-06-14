package com.labo3.labo3.services;

import com.labo3.labo3.dto.CreateClubDTO;
import com.labo3.labo3.entities.Club;
import com.labo3.labo3.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public void addClub(CreateClubDTO club) {
        Club newClub = new Club();
        newClub.setName(club.getClubName());
        newClub.setCountry(club.getCountry());
        newClub.setTitles(club.getTitles());
        newClub.setCoach(club.getCoach());
    }
}

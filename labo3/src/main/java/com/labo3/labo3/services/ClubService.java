package com.labo3.labo3.services;

import com.labo3.labo3.dto.CreateClubDTO;
import com.labo3.labo3.dto.ResponseDTO;
import com.labo3.labo3.entities.Club;
import com.labo3.labo3.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public void addClub(CreateClubDTO club) {
        Club newClub = new Club();
        newClub.setName(club.getName());
        newClub.setCountry(club.getCountry());
        newClub.setCoach(club.getCoach());
        newClub.setTitles(club.getTitles());

        // Guardar el club en la base de datos
        clubRepository.save(newClub); // Asegúrate de que esta línea esté incluida
    }
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public ResponseDTO deleteClub(Integer clubId) {
        Optional<Club> opClub = clubRepository.findById(clubId);
        if (opClub.isEmpty()) {
            throw new RuntimeException("Book not found");
        }
        Club clubToDelete = opClub.get();
        clubRepository.delete(clubToDelete);
        return ResponseDTO.builder()
                .id(clubToDelete.getId())
                .name(clubToDelete.getName())
                .country(clubToDelete.getCountry())
                .coach(clubToDelete.getCoach())
                .titles(clubToDelete.getTitles())
                .build();
    }
}

package com.labo3.labo3.controller;

import com.labo3.labo3.dto.CreateClubDTO;
import com.labo3.labo3.dto.ResponseDTO;
import com.labo3.labo3.entities.Club;
import com.labo3.labo3.services.ClubService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    // Endpoint para registrar un club
    @PostMapping
    public ResponseEntity<String> createClub(@RequestBody @Valid CreateClubDTO createClubDTO) {
        clubService.addClub(createClubDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Club registrado exitosamente");
    }

    @GetMapping("/search")
    public ResponseEntity<List<Club>> getClubsByTitles(@RequestParam("titles") Integer titles) {
        List<Club> clubs = clubService.getClubsByTitles(titles);
        return ResponseEntity.ok(clubs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteClub(@PathVariable int id) {
        return ResponseEntity.ok(clubService.deleteClub(id));
    }

}
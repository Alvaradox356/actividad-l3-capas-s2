package com.labo3.labo3.repositories;

import com.labo3.labo3.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {
    List<Club> findByTitlesGreaterThanEqual(@Param("titles")Integer titles);
}

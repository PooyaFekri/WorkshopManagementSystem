package com.project.workshopmanagment.repository;

import com.project.workshopmanagment.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}

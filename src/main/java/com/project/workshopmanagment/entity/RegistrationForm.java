package com.project.workshopmanagment.entity;

import com.project.workshopmanagment.entity.role.Participant;
import com.project.workshopmanagment.entity.workshop.OfferedWorkshop;
import com.project.workshopmanagment.entity.workshop.TakenWorkshop;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class RegistrationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "participant_id")
    private Participant participant;

    @NotNull(message = "Desired workshop cannot be empty")
    @OneToOne
    private OfferedWorkshop desiredWorkshop;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registrationForm")
    private TakenWorkshop takenWorkshop;

    public RegistrationForm() {
    }

    public RegistrationForm(Long id, Participant participant, @NotNull OfferedWorkshop desiredWorkshop, TakenWorkshop takenWorkshop) {
        this.id = id;
        this.participant = participant;
        this.desiredWorkshop = desiredWorkshop;
        this.takenWorkshop = takenWorkshop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public OfferedWorkshop getDesiredWorkshop() {
        return desiredWorkshop;
    }

    public void setDesiredWorkshop(OfferedWorkshop desiredWorkshop) {
        this.desiredWorkshop = desiredWorkshop;
    }

    public TakenWorkshop getTakenWorkshop() {
        return takenWorkshop;
    }

    public void setTakenWorkshop(TakenWorkshop takenWorkshop) {
        this.takenWorkshop = takenWorkshop;
    }
}

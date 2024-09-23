package com.dbmsproject.project.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "AppointmentCriminal")
public class AppointmentCriminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    @ManyToOne
    @JoinColumn(name = "CriminalCaseID", nullable = false)
    private CriminalCase criminalCase;

    @ManyToOne
    @JoinColumn(name = "LawyerID", nullable = false)
    private Lawyer lawyer;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column(name = "AppointmentDate")
    private LocalDate appointmentDate;

    @Column(name = "AppointmentTime")
    private LocalTime appointmentTime;

    @Column(name = "Location", length = 50)
    private String location;
}

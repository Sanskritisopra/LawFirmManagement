package com.dbmsproject.project.entity;

import java.time.LocalDate;
import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "CivilCase")
public class CivilCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer civilCaseId;

    @Column(name = "CaseDesc", columnDefinition = "TEXT")
    private String caseDesc;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "Appeal", length = 50)
    private String appeal;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column(name = "Compensation")
    private Integer compensation;

    @Column(name = "Location", length = 50)
    private String location;

    @Column(name = "DisputeType", length = 50)
    private String disputeType;

    @Column(name = "MediationState", length = 50)
    private String mediationState;
}

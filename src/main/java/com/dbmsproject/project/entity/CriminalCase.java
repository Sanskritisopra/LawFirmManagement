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
@Table(name = "CriminalCase")
public class CriminalCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer criminalCaseId;

    @Column(name = "CaseDesc", columnDefinition = "TEXT")
    private String caseDesc;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "ArrestDate")
    private LocalDate arrestDate;

    @Column(name = "Appeal", length = 50)
    private String appeal;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;
}



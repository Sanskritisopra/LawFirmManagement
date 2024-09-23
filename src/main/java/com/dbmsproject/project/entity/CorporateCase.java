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
@Table(name = "CorporateCase")
public class CorporateCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer corporateCaseId;

    @Column(name = "CaseDesc", columnDefinition = "TEXT")
    private String caseDesc;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column(name = "CaseStatus", length = 50)
    private String caseStatus;
}

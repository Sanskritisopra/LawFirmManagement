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
@Table(name = "MatrimonialCase")
public class MatrimonialCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matrimonialCaseId;

    @Column(name = "CaseDesc", columnDefinition = "TEXT")
    private String caseDesc;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column(name = "MarriedStatus", length = 50)
    private String marriedStatus;

    @Column(name = "DisputeType", length = 50)
    private String disputeType;

    @Column(name = "AlimonyStatus", length = 50)
    private String alimonyStatus;

    @Column(name = "Children")
    private Integer children;

    @Column(name = "CustodyDetail", columnDefinition = "TEXT")
    private String custodyDetail;

    @Column(name = "MarriageDate")
    private LocalDate marriageDate;
}

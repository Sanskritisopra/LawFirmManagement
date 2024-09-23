package com.dbmsproject.project.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "WitAndEviCorp")
public class WitAndEviCorp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer corpProofId;

    @Column(name = "ProofType", length = 100)
    private String proofType;

    @Column(name = "PhoneNo", length = 20)
    private String phoneNo;

    @Column(name = "witName", length = 255)
    private String witName;

    @Column(name = "EvidenceFilePath", columnDefinition = "TEXT")
    private String evidenceFilePath;

    @Column(name = "WitnessText", columnDefinition = "TEXT")
    private String witnessText;
}

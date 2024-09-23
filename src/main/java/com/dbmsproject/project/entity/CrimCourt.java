package com.dbmsproject.project.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CrimCourt")
public class CrimCourt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courtCrimId;

    @Column(name = "CourtName", length = 255)
    private String courtName;

    @Column(name = "CourtPincode", length = 20)
    private String courtPincode;

    @Column(name = "CourtState", length = 100)
    private String courtState;

    @Column(name = "CourtCity", length = 100)
    private String courtCity;

    @Column(name = "FName", length = 50)
    private String fName;

    @Column(name = "MName", length = 50)
    private String mName;

    @Column(name = "LName", length = 50)
    private String lName;
}

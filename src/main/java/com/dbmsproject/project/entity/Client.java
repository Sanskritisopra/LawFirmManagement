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
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    @Column(name = "FName", length = 50)
    private String fName;

    @Column(name = "MName", length = 50)
    private String mName;

    @Column(name = "LName", length = 50)
    private String lName;

    @Column(name = "Occupation", length = 100)
    private String occupation;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "Spouse", length = 100)
    private String spouse;

    @Column(name = "CaseType", length = 15)
    private String caseType;
}

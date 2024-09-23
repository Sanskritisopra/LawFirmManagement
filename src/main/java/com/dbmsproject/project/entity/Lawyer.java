package com.dbmsproject.project.entity;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "Lawyer")
public class Lawyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lawyerId;

    @Column(name = "FName", length = 50)
    private String fName;

    @Column(name = "MName", length = 50)
    private String mName;

    @Column(name = "LName", length = 50)
    private String lName;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "Qualification", length = 100)
    private String qualification;

    @Column(name = "Experience")
    private Integer experience;

    @Column(name = "Positions", length = 50)
    private String positions;

    @OneToMany(mappedBy = "lawyer")
    private Set<TaskLawyerCriminal> taskLawyerCriminal;

    @OneToMany(mappedBy = "lawyer")
    private Set<TaskLawyerCorp> taskLawyerCorp;

    @OneToMany(mappedBy = "lawyer")
    private Set<TaskLawyerMatrimonial> taskLawyerMat;

    @OneToMany(mappedBy = "lawyer")
    private Set<TaskLawyerCivil> taskLawyerCiv;
}

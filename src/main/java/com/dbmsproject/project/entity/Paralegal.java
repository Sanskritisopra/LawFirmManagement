package com.dbmsproject.project.entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "Paralegal")
public class Paralegal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paralegalId;

    @Column(name = "FName", length = 50)
    private String fName;

    @Column(name = "MName", length = 50)
    private String mName;

    @Column(name = "LName", length = 50)
    private String lName;

    @Column(name = "Qualification", length = 100)
    private String qualification;

    @Column(name = "Experience")
    private Integer experience;

    @Column(name = "Positions", length = 50)
    private String positions;
}

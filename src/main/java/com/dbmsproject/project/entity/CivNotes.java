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
@Table(name = "CivNotes")
public class CivNotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer civNoteId;

    @Column(name = "CaseNoteCiv", length = 255)
    private String caseNoteCiv;

    @Column(name = "NoteText", columnDefinition = "TEXT")
    private String noteText;

    @Column(name = "Relevance", length = 50)
    private String relevance;

    @Column(name = "DateCreated")
    private LocalDate dateCreated;

    @Column(name = "DateModified")
    private LocalDate dateModified;

    @ManyToOne
    @JoinColumn(name = "CivilCaseID", nullable = false)
    private CivilCase civilCase;
}

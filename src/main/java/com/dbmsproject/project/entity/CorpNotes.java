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
@Table(name = "CorpNotes")
public class CorpNotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer corpNoteId;

    @Column(name = "CaseNoteCorp", length = 255)
    private String caseNoteCorp;

    @Column(name = "NoteText", columnDefinition = "TEXT")
    private String noteText;

    @Column(name = "Relevance", length = 50)
    private String relevance;

    @Column(name = "DateCreated")
    private LocalDate dateCreated;

    @Column(name = "DateModified")
    private LocalDate dateModified;

    @ManyToOne
    @JoinColumn(name = "CorporateCaseID", nullable = false)
    private CorporateCase corporateCase;
}

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
@Table(name = "TaskCriminal")
public class TaskCriminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    @ManyToOne
    @JoinColumn(name = "CriminalCaseID", nullable = false)
    private CriminalCase criminalCase;

    @ManyToOne
    @JoinColumn(name = "LawyerID")
    private Lawyer lawyer;

    @ManyToOne
    @JoinColumn(name = "ParalegalID")
    private Paralegal paralegal;

    @Column(name = "TaskDesc", columnDefinition = "TEXT")
    private String taskDesc;

    @Column(name = "Priority")
    private Integer priority;

    @Column(name = "Statuso", length = 50)
    private String status;

    @Column(name = "DueDate")
    private LocalDate dueDate;

    @OneToMany(mappedBy = "taskCriminal")
    private Set<TaskLawyerCriminal> taskLawyerCriminal;
}

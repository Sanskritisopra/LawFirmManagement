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
@Table(name = "TaskCorp")
public class TaskCorp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    @ManyToOne
    @JoinColumn(name = "CorporateCaseID", nullable = false)
    private CorporateCase corporateCase;

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

    @OneToMany(mappedBy = "taskCorp")
    private Set<TaskLawyerCorp> taskLawyerCorp;
}

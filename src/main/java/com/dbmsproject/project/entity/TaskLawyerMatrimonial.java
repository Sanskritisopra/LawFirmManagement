package com.dbmsproject.project.entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "TaskLawyerMatrimonial")
public class TaskLawyerMatrimonial {

    @Id
    @Column(name = "TaskID")
    private Integer taskId;

    @Id
    @Column(name = "LawyerID")
    private Integer lawyerId;

    @ManyToOne
    @JoinColumn(name = "TaskID", insertable = false, updatable = false)
    private TaskMatrimonial taskMatrimonial;

    @ManyToOne
    @JoinColumn(name = "LawyerID", insertable = false, updatable = false)
    private Lawyer lawyer;

    // No need for explicit getters and setters due to Lombok @Data
}

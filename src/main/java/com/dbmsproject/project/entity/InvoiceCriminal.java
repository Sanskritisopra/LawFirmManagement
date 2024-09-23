package com.dbmsproject.project.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "InvoiceCriminal")
public class InvoiceCriminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

    @ManyToOne
    @JoinColumn(name = "CriminalCaseID", nullable = false)
    private CriminalCase criminalCase;

    @Column(name = "InvoiceDate")
    private LocalDate invoiceDate;

    @Column(name = "Amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "DueDate")
    private LocalDate dueDate;

    @Column(name = "Status", length = 50)
    private String status;
}

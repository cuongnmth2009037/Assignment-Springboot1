package com.example.assignmentspringboot1.entity;

import com.example.assignmentspringboot1.entity.emums.StreetStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "streets")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="district_id", nullable = false)
    private District district;
    @Column(updatable = false, insertable = false)
    private int district_id;
    private String description;
    private LocalDate roadEstablishmentDate;
    @Enumerated(EnumType.ORDINAL)
    private StreetStatus status;

}
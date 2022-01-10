package com.patient.junit;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patient_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;

    @NonNull
    private String name;

    @NonNull
    private Integer age;

    @NonNull
    private String address;
}

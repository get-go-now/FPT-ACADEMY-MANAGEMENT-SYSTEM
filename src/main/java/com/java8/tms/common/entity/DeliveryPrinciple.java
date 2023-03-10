package com.java8.tms.common.entity;

import java.util.UUID;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryPrinciple {
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
	@Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
	private String trainees;
	private String trainer;
	@Column(length = 1337)
	private String training;
	private String re_test;
	private String marking;
	private String waiverCriteria;
	private String others;
	// syllabus_id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "syllabus_id", referencedColumnName = "id")
	private Syllabus syllabus;

}

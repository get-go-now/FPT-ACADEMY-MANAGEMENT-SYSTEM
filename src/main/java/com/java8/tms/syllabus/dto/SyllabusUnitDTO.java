package com.java8.tms.syllabus.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SyllabusUnitDTO {
    private UUID id;
    private String name;
    private int unitNo;
    private int duration;
    private List<SyllabusUnitChapterDTO> syllabusUnitChapters;

}

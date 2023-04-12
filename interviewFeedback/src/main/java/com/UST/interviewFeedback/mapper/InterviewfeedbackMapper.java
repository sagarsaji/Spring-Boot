package com.UST.interviewFeedback.mapper;

import com.UST.interviewFeedback.dto.InterviewfeedbackDTO;
import com.UST.interviewFeedback.entity.Interviewfeedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface InterviewfeedbackMapper extends GenericMapper<Interviewfeedback, InterviewfeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    Interviewfeedback asEntity(InterviewfeedbackDTO dto);
}
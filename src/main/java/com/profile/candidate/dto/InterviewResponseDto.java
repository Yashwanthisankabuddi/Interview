package com.profile.candidate.dto;

public class InterviewResponseDto {
    private String message;
    private String candidateId;

    // Constructor
    public InterviewResponseDto(String message, String candidateId) {
        this.message = message;
        this.candidateId = candidateId;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }
}

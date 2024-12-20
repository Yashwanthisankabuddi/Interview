package com.profile.candidate.dto;

import com.profile.candidate.model.CandidateDetails;

import java.util.List;

public class CandidateGetResponseDto {

    private String candidateId;
    private String jobId;
    private String userId;
    private String fullName;
    private String emailId;
    private String contactNumber;
    private String currentOrganization;
    private String qualification;
    private Integer totalExperience;
    private String relevantExperience;
    private Double currentCTC;
    private Double expectedCTC;
    private String noticePeriod;
    private String currentLocation;
    private String preferredLocation;
    private List<String> skills;
    private String communicationSkills;
    private Double requiredTechnologiesRating;
    private String overallFeedback;

    // Constructor that takes a CandidateDetails object
    public CandidateGetResponseDto(CandidateDetails candidate) {
        this.candidateId = candidate.getCandidateId();
        this.jobId = candidate.getJobId();
        this.userId = candidate.getUserId();
        this.fullName = candidate.getFullName();
        this.emailId = candidate.getEmailId();
        this.contactNumber = candidate.getContactNumber();
        this.currentOrganization = candidate.getCurrentOrganization();
        this.qualification = candidate.getQualification();
        this.totalExperience = candidate.getTotalExperience();
        this.relevantExperience = candidate.getRelevantExperience();
        this.currentCTC = candidate.getCurrentCTC();
        this.expectedCTC = candidate.getExpectedCTC();
        this.noticePeriod = candidate.getNoticePeriod();
        this.currentLocation = candidate.getCurrentLocation();
        this.preferredLocation = candidate.getPreferredLocation();
        this.skills = candidate.getSkills();
        this.communicationSkills = candidate.getCommunicationSkills();
        this.requiredTechnologiesRating = candidate.getRequiredTechnologiesRating();
        this.overallFeedback = candidate.getOverallFeedback();
    }

    // Getters and Setters
    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCurrentOrganization() {
        return currentOrganization;
    }

    public void setCurrentOrganization(String currentOrganization) {
        this.currentOrganization = currentOrganization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(Integer totalExperience) {
        this.totalExperience = totalExperience;
    }

    public String getRelevantExperience() {
        return relevantExperience;
    }

    public void setRelevantExperience(String relevantExperience) {
        this.relevantExperience = relevantExperience;
    }

    public Double getCurrentCTC() {
        return currentCTC;
    }

    public void setCurrentCTC(Double currentCTC) {
        this.currentCTC = currentCTC;
    }

    public Double getExpectedCTC() {
        return expectedCTC;
    }

    public void setExpectedCTC(Double expectedCTC) {
        this.expectedCTC = expectedCTC;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getCommunicationSkills() {
        return communicationSkills;
    }

    public void setCommunicationSkills(String communicationSkills) {
        this.communicationSkills = communicationSkills;
    }

    public Double getRequiredTechnologiesRating() {
        return requiredTechnologiesRating;
    }

    public void setRequiredTechnologiesRating(Double requiredTechnologiesRating) {
        this.requiredTechnologiesRating = requiredTechnologiesRating;
    }

    public String getOverallFeedback() {
        return overallFeedback;
    }

    public void setOverallFeedback(String overallFeedback) {
        this.overallFeedback = overallFeedback;
    }
}

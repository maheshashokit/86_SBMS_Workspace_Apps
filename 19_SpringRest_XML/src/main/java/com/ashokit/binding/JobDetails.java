package com.ashokit.binding;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JobDetails {

    private String jobId;

    private String jobBand;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobBand() {
        return jobBand;
    }

    public void setJobBand(String jobBand) {
        this.jobBand = jobBand;
    }

    @Override
    public String toString() {
        return "JobDetails [jobId=" + jobId + ", jobBand=" + jobBand + "]";
    }
}

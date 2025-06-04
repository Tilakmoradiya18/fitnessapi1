// ResetPasswordRequest.java
package com.fitness.fitnessapi.dto;

import lombok.Data;

@Data
public class ResetPasswordRequest {

    private String newPassword;
    private String confirmPassword;


    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}

package model;

import java.time.LocalDateTime;

public class UserTM {
    private String nic;
    private String name;
    private String gender;
    private String accountStatus;
    private LocalDateTime lastLogin;

    public UserTM() {
    }

    public UserTM(String nic, String name, String gender, String accountStatus, LocalDateTime lastLogin) {
        this.nic = nic;
        this.name = name;
        this.gender = gender;
        this.accountStatus = accountStatus;
        this.lastLogin = lastLogin;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}

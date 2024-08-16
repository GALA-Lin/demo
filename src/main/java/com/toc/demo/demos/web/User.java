package com.toc.demo.demos.web;

import java.sql.Timestamp;

public class User {
    private String UID;
    private String Username;
    private String Password;
    private String Email;
    private String Permission;
    private short Status;
    private Timestamp SignUpTime;
    private Timestamp LastLoginTime;

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPermission() {
        return Permission;
    }

    public void setPermission(String permission) {
        Permission = permission;
    }

    public short getStatus() {
        return Status;
    }

    public void setStatus(short status) {
        Status = status;
    }

    public Timestamp getSignUpTime() {
        return SignUpTime;
    }

    public void setSignUpTime(Timestamp signUpTime) {
        SignUpTime = signUpTime;
    }

    public Timestamp getLastLoginTime() {
        return LastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        LastLoginTime = lastLoginTime;
    }
}

package com.bit.blmt.unlockme;

/**
 * Created by blmt on 01/03/2018.
 */

public class player {
    private String username;
    private int level,attempts;
    private boolean free_attempt;
    private String code;
    private String email;

    public player(String username, int level, int attempts, boolean free_attempt, String code, String email) {
        this.username = username;
        this.level = level;
        this.attempts = attempts;
        this.free_attempt = free_attempt;
        this.code = code;
        this.email = email;
    }

    public boolean getUserInfo(){
        //Get Id From File

        //Check online infos

        //return false if player is nto found
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean getFree_attempt() {
        return free_attempt;
    }

    public void setFree_attempt(boolean free_attempt) {
        this.free_attempt = free_attempt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

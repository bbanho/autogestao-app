package com.example.bruno.teste;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

     @Expose
     @SerializedName("id")
     private String token;

     @Expose
     @SerializedName("ttl")
     private Integer ttl;

     @Expose
     @SerializedName("created")
     private String created;

    @Expose
    @SerializedName("realm")
    private String urealm;

    @Expose
    @SerializedName("username")
    private String uname;

    @Expose
    @SerializedName("email")
    private String uemail;

    @Expose
    @SerializedName("emailVerified")
    private Boolean uemailVerified;

    @Expose
    @SerializedName("userId")
    private String uid;

    @Expose
    @SerializedName("password")
    private String upwd;

    public User(String mEmail, String mPassword) {
        this.uemail = mEmail;
        this.upwd = mPassword;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrealm() {
        return urealm;
    }

    public void setUrealm(String urealm) {
        this.urealm = urealm;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Boolean getUemailVerified() {
        return uemailVerified;
    }

    public void setUemailVerified(Boolean uemailVerified) {
        this.uemailVerified = uemailVerified;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}

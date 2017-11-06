
package com.outerspace.retrofitbanana.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person implements Serializable
{

    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("name")
    @Expose
    public Name name;
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("dob")
    @Expose
    public String dob;
    @SerializedName("registered")
    @Expose
    public String registered;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("cell")
    @Expose
    public String cell;
    @SerializedName("id")
    @Expose
    public Id id;
    @SerializedName("nat")
    @Expose
    public String nat;
    private final static long serialVersionUID = -5263136388567292994L;

}

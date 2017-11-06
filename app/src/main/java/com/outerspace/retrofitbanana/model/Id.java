
package com.outerspace.retrofitbanana.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id implements Serializable
{

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("value")
    @Expose
    public String value;
    private final static long serialVersionUID = 8733615730264975388L;

}


package com.outerspace.retrofitbanana.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Name implements Serializable
{

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("first")
    @Expose
    public String first;
    @SerializedName("last")
    @Expose
    public String last;
    private final static long serialVersionUID = -8138434385329645608L;

}

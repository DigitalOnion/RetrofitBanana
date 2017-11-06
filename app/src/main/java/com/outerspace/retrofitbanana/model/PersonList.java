
package com.outerspace.retrofitbanana.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PersonList implements Serializable
{

    @SerializedName("results")
    @Expose
    public List<Person> persons = null;
    private final static long serialVersionUID = 3491851443886706789L;

}

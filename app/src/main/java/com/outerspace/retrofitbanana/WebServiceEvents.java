package com.outerspace.retrofitbanana;

import com.outerspace.retrofitbanana.model.PersonList;

public interface WebServiceEvents {

    public void onSuccess(PersonList personList);

    public void onFailure(String message);

}

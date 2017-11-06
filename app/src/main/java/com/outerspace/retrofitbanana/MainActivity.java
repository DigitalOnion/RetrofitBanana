package com.outerspace.retrofitbanana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.widget.TextView;

import com.outerspace.retrofitbanana.model.Person;
import com.outerspace.retrofitbanana.model.PersonList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements WebServiceEvents {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        WebServiceController controller = new WebServiceController(this);
        controller.start();

    }

    @Override
    public void onSuccess(PersonList personList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Person> persons = new ArrayList<>();
        persons.addAll(personList.persons);
        for(Person person: persons)
            sb.append(person.name.first)
                    .append(' ')
                    .append(person.name.last)
                    .append('\n');

        TextView txt = (TextView) findViewById(R.id.txt_message);
        txt.setText(sb.toString());
    }

    @Override
    public void onFailure(String message) {
        TextView txt = (TextView) findViewById(R.id.txt_message);
        txt.setText(message);
    }
}

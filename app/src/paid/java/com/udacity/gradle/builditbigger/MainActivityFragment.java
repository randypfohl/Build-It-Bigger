package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pfohl.bakingapp.joke.MainActivity;
import com.udacity.gradle.builditbigger.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment implements IJokeCallback{


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
       Button button =view.findViewById(R.id.joke_button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tellJoke();
           }
       });
       return view;
    }

    public void tellJoke(){
        new JokeAsyncTask().execute(this);
    }

    @Override
    public void jokeLoaded(String string) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra(MainActivity.JOKE_KEY, string);
        startActivity(intent);
    }
}

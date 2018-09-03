package com.pfohl.bakingapp.jokelibrary;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class Joke {
    private List<String> jokeList;

    public Joke() {
        this.jokeList = new ArrayList<>();
        this.jokeList.add("I told my wife she was drawing her eyebrows on too high...she looked surprised.");
        this.jokeList.add("Working in a mirror factory is something I can totally see myself doing");
        this.jokeList.add("Someone stole my Microsoft Office and they are going to pay...you have my word.");
        this.jokeList.add("What's green, fuzzy ,and if it fell out of a tree it would kill you? A pool table");
        this.jokeList.add("A roman legionnaire walks into a bar and holds up two fingers and says...five beers please!");
        this.jokeList.add("Woman only call me ugly until they find out how much money I make...and then they call me ugly and poor.");
        this.jokeList.add("Parallel lines have so much in common, it's too bad they will never meet.");
        this.jokeList.add("My wife accused me of being immature...I told her to get out of my fort.");
        this.jokeList.add("Apparently someone in London gets stabbed every 52 seconds...the poor bastard.");
        this.jokeList.add("Someone stole my mood ring, I don't know how I feel about it.");
        this.jokeList.add("What do you call a boomarang that doesn't come back? A stick");
        this.jokeList.add("What do you call an elephant mixed with a rhino? elephino!");
        this.jokeList.add("You know what they say about one cliffhangers...");
    }

    public String getJoke() {
        Random random = new Random();
        return jokeList.get(random.nextInt(jokeList.size() - 1));
    }

}
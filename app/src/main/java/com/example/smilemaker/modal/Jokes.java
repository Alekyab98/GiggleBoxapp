package com.example.smilemaker.modal;

import com.example.smilemaker.FacebookFeedModal;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public static ArrayList<FacebookFeedModal> facebookFeedModalArrayList = new ArrayList();

    public static ArrayList<FacebookFeedModal> jokes() {
        facebookFeedModalArrayList.add(new FacebookFeedModal("'Automatic' simply means that you cannot repair it yourself."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("90% of everything is crud."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A Project Manager is like the madam in a brothel. His job is to see\n" +
                "that everything comes off right."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A Smith & Wesson always beats four aces."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A bird in hand is safer than one overhead."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A bird in the hand is worth about three Kleenex."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A child's ability to endure likely stems from his ignorance of\n" +
                "alternatives."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A clean desk is a sign of a sick mind."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A closed mouth says nothing wrong; a closed mind does nothing right."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A complex system that works is invariably found to have evolved from a\n" +
                "more simple system that worked."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A computer makes as many mistakes in one second as three men working\n" +
                "for thirty years straight."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A conference is simply an admission that you want somebody else to\n" +
                "join you in your troubles.\n"));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A dog is a dog except when he is facing you. Then he is Mr. Dog."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A fellow who is always declaring that he is no fool usually harbors\n" +
                "suspicions to the contrary."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A fool and his money are some party."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A friend in power is a friend lost."));
        facebookFeedModalArrayList.add(new FacebookFeedModal("A liberalism incapable of fiscal self-discipline brings about a\n" +
                "radical conservatism conspicuous for its selfishness and\n" +
                "insensitivity."));


        //add here jokes

        return facebookFeedModalArrayList;

    }





    public static String getRandomJoke() {
        jokes();


        int len = facebookFeedModalArrayList.size();
        Random r = new Random();
        int i = r.nextInt(len);
        FacebookFeedModal str = facebookFeedModalArrayList.get(i);

        return str.getPostDescription();
    }

}

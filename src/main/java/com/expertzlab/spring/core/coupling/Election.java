package com.expertzlab.spring.core.coupling;

/**
 * Created by gireeshbabu on 21/03/17.
 */
public class Election {

    public static void main(String[] args) {
        VotingBooth booth = new VotingBooth();
        Candidate candidate = new Candidate("jayan","arc");
        booth.vote(candidate);
    }
}

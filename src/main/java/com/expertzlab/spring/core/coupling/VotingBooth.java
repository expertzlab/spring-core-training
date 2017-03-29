package com.expertzlab.spring.core.coupling;

/**
 * Created by gireeshbabu on 21/03/17.
 */
public class VotingBooth {

    VoteRecorder recorder = new VoteRecorder();

    public void vote(Candidate candidate){
        recorder.record(candidate);
    }
}

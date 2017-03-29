package com.expertzlab.spring.core.coupling;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gireeshbabu on 21/03/17.
 */
public class VoteRecorder {

    Map votes = new HashMap();

    public void record(Candidate candidate){

        int count = 0;
        if(votes.containsKey(candidate)){
            count = (Integer) votes.get(candidate);
            count ++;
        }
        votes.put(candidate,count);
    }
}

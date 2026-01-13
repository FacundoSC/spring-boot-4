package com.faccordoba.coffe.reviews;


import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    //Collections with Nullable Elements

    //List with Nullable Elements
    public List<@Nullable String> getResponses() {
        List<@Nullable String> responses = new ArrayList<>();
        responses.add("Your review has been sent.");
        responses.add(null); // No response
        responses.add("Thank you for your feedback!");
        return responses;
    }

}

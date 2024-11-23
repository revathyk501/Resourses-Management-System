package com.innoverasolutions.resource_management.service;

import com.innoverasolutions.resource_management.model.Feedback;
import com.innoverasolutions.resource_management.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}
*/
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback); // Save feedback without returning anything
    }
    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll(); // Fetch all records
    }
}
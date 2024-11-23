/*package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.Feedback;
import com.innoverasolutions.resource_management.service.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private com.innoverasolutions.resource_management.service.FeedbackServiceImpl feedbackService;

    @GetMapping("/feedback")
    public String feedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/submit-feedback")
    public String submitFeedback(@ModelAttribute Feedback feedback) {
        FeedbackServiceImpl.saveFeedback(feedback); // Save feedback to database
        return "redirect:/thank-you"; // Redirect to a thank-you page
    }


    @GetMapping("/thank-you")
    public String thankYouPage() {
        return "<h1>Thank you for your feedback!</h1>";
    }
}
*/
package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.Feedback;
import com.innoverasolutions.resource_management.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // Show feedback form
    @GetMapping("/feedback")
    public String feedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback()); // Add a new Feedback object to the model
        return "feedback"; // Returns feedback.html template
    }

    // Handle feedback submission
    @PostMapping("/submit-feedback")
    public String submitFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.saveFeedback(feedback); // Save feedback to the database
        return "redirect:/thank-you"; // Redirect to thank-you page
    }

    // Thank-you page
    @GetMapping("/thank-you")
    public String thankYouPage(Model model) {
        model.addAttribute("message", "Thank you for your feedback!");
        return "thank-you"; // Returns thank-you.html template
    }
    @GetMapping("/show-feedback")
    public String showFeedback(Model model) {
        List<Feedback> feedbackList = feedbackService.getAllFeedback(); // Fetch all feedback
        model.addAttribute("feedbackList", feedbackList); // Add to model
        return "show-feedback"; // Render show-feedback.html
    }
}


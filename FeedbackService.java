/*package com.innoverasolutions.resource_management.service;
import com.innoverasolutions.resource_management.model.Feedback;
public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
}

 */
package com.innoverasolutions.resource_management.service;

import com.innoverasolutions.resource_management.model.Feedback;

import java.util.List;

public interface FeedbackService {
    void saveFeedback(Feedback feedback);

    List<Feedback> getAllFeedback();
}

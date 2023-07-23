```java
package com.autodevaimobile;

import java.util.ArrayList;
import java.util.List;

public class NLPProcessor {

    private List<String> userInputs;
    private List<String> responses;

    public NLPProcessor() {
        this.userInputs = new ArrayList<>();
        this.responses = new ArrayList<>();
    }

    public void processUserInput(String userInput) {
        this.userInputs.add(userInput);
        String response = generateResponse(userInput);
        this.responses.add(response);
    }

    private String generateResponse(String userInput) {
        // This is a placeholder. In a real application, this method would use NLP techniques to generate a response.
        return "Response to: " + userInput;
    }

    public List<String> getUserInputs() {
        return userInputs;
    }

    public List<String> getResponses() {
        return responses;
    }
}
```
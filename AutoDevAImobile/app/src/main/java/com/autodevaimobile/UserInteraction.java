```java
package com.autodevaimobile;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserInteraction {

    private MainActivity mainActivity;
    private AIAgent aiAgent;

    public UserInteraction(MainActivity mainActivity, AIAgent aiAgent) {
        this.mainActivity = mainActivity;
        this.aiAgent = aiAgent;
    }

    public void handleUserInput(View view) {
        EditText userInputField = mainActivity.findViewById(R.id.userInputField);
        String userInput = userInputField.getText().toString();

        if (userInput.isEmpty()) {
            Toast.makeText(mainActivity, "Please enter something", Toast.LENGTH_SHORT).show();
            return;
        }

        String aiResponse = aiAgent.processUserInput(userInput);
        displayAIResponse(aiResponse);
    }

    private void displayAIResponse(String aiResponse) {
        EditText aiResponseField = mainActivity.findViewById(R.id.aiResponseField);
        aiResponseField.setText(aiResponse);
    }
}
```
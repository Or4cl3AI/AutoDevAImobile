```java
package com.autodevaimobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AIAgent aiAgent;
    private EditText userInput;
    private TextView aiOutput;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aiAgent = new AIAgent();
        userInput = findViewById(R.id.user_input);
        aiOutput = findViewById(R.id.ai_output);
        sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = userInput.getText().toString();
                String response = aiAgent.processInput(input);
                aiOutput.setText(response);
            }
        });
    }
}
```
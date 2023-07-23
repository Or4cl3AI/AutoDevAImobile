```java
package com.autodevaimobile;

import android.app.Application;
import com.autodevaimobile.AIAgent;
import com.autodevaimobile.NLPProcessor;
import com.autodevaimobile.InternetAccess;
import com.autodevaimobile.PersonalityMemory;
import com.autodevaimobile.CodeGenerator;
import com.autodevaimobile.ProgrammingKnowledge;
import com.autodevaimobile.UserInteraction;

public class AutoDevAImobile extends Application {

    private static AutoDevAImobile instance;
    private AIAgent aiAgent;
    private NLPProcessor nlpProcessor;
    private InternetAccess internetAccess;
    private PersonalityMemory personalityMemory;
    private CodeGenerator codeGenerator;
    private ProgrammingKnowledge programmingKnowledge;
    private UserInteraction userInteraction;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        aiAgent = new AIAgent();
        nlpProcessor = new NLPProcessor();
        internetAccess = new InternetAccess();
        personalityMemory = new PersonalityMemory();
        codeGenerator = new CodeGenerator();
        programmingKnowledge = new ProgrammingKnowledge();
        userInteraction = new UserInteraction();
    }

    public static AutoDevAImobile getInstance() {
        return instance;
    }

    public AIAgent getAIAgent() {
        return aiAgent;
    }

    public NLPProcessor getNLPProcessor() {
        return nlpProcessor;
    }

    public InternetAccess getInternetAccess() {
        return internetAccess;
    }

    public PersonalityMemory getPersonalityMemory() {
        return personalityMemory;
    }

    public CodeGenerator getCodeGenerator() {
        return codeGenerator;
    }

    public ProgrammingKnowledge getProgrammingKnowledge() {
        return programmingKnowledge;
    }

    public UserInteraction getUserInteraction() {
        return userInteraction;
    }
}
```
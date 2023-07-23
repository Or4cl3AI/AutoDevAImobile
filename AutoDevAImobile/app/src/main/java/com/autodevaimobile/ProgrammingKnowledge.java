```java
package com.autodevaimobile;

import java.util.HashMap;
import java.util.Map;

public class ProgrammingKnowledge {

    private Map<String, String> programmingLanguages;
    private Map<String, String> libraries;

    public ProgrammingKnowledge() {
        programmingLanguages = new HashMap<>();
        libraries = new HashMap<>();
        initializeKnowledge();
    }

    private void initializeKnowledge() {
        // Initialize with some basic knowledge
        programmingLanguages.put("Java", "Object-oriented programming language");
        programmingLanguages.put("Python", "Interpreted, high-level, general-purpose programming language");
        programmingLanguages.put("JavaScript", "High-level, just-in-time compiled, object-oriented programming language");

        libraries.put("Android SDK", "Software development kit for Android applications");
        libraries.put("TensorFlow", "Open source machine learning framework");
        libraries.put("React", "JavaScript library for building user interfaces");
    }

    public String getLanguageDescription(String language) {
        return programmingLanguages.getOrDefault(language, "Unknown language");
    }

    public String getLibraryDescription(String library) {
        return libraries.getOrDefault(library, "Unknown library");
    }

    public void learnNewLanguage(String language, String description) {
        programmingLanguages.put(language, description);
    }

    public void learnNewLibrary(String library, String description) {
        libraries.put(library, description);
    }
}
```
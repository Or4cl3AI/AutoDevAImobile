```java
package com.autodevaimobile;

import java.util.HashMap;
import java.util.Map;

public class PersonalityMemory {

    private Map<String, String> memory;

    public PersonalityMemory() {
        memory = new HashMap<>();
    }

    public void remember(String key, String value) {
        memory.put(key, value);
    }

    public String recall(String key) {
        return memory.get(key);
    }

    public boolean hasMemory(String key) {
        return memory.containsKey(key);
    }

    public void forget(String key) {
        memory.remove(key);
    }

    public void clearMemory() {
        memory.clear();
    }
}
```
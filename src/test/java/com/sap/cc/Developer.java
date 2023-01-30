package com.sap.cc;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

public class Developer extends CodeCreator {

    public Developer(String givenName, String givenLanguage) {
        name = givenName;
        language = givenLanguage;
    }

    private String name;
    private String language;

    public void setName(String givenName) {
        name = givenName;
    }

    public String getName() {
        return name;
    }

    public void setLanguage(String givenLanguage) {
        language = givenLanguage;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String code() throws UnsupportedDevelopmentLanguageException {
        String result = "";
        if (language == "go") {
            return String.format("fmt.Println(\"Hello, %s!\")",name);
        } else if (language == "python") {
            return String.format("print(\"Hello, %s!\")",name);
        } else if (language == "nodejs") {
            return String.format("console.log(\"Hello, %s!\")",name);
        } else {
            throw new UnsupportedDevelopmentLanguageException(language);
        }
    }
}

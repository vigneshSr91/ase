package com.sap.cc;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.DeveloperEvent;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

import java.util.List;

public class Hackathon implements DeveloperEvent {
    @Override
    public String codeTogether(List<CodeCreator> codeCreators) {
        String finalResult="";
        for (CodeCreator coder : codeCreators){
            try {
                String thisResult = coder.code();
                finalResult = finalResult.concat(thisResult);
            }
            catch (UnsupportedDevelopmentLanguageException ex) {
                finalResult = finalResult.concat(ex.getMessage());
            }
            finalResult = finalResult.concat("\n");
        }
        return finalResult;
    }
}

package com.expertzlab.spring.core.innerclass;

import java.util.List;
import java.util.Set;

/**
 * Created by gireeshbabu on 05/04/17.
 */
public class TextEditor {

    SpellChecker spellChecker;

    List<SpellChecker> spellcheckList;

    Set<String> values;

    public void checkSpelling(){

        for(SpellChecker checker: spellcheckList){
            checker.check();
        }

        printValues();
    }

    public void printValues(){
        for(String value: values){
            System.out.println(value);
        }
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void setSpellcheckList(List spellcheckList) {
        this.spellcheckList = spellcheckList;
    }

    public void setValues(Set<String> values) {
        this.values = values;
    }
}

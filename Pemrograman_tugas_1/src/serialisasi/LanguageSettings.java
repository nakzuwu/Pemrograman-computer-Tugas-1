/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class LanguageSettings implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient static final String DEFAULT_LANGUAGE = "English";

    private transient final String languageCode;
    private String language;

    public LanguageSettings(String language) {
        this.language = language;
        this.languageCode = generateLanguageCode(); 
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    private String generateLanguageCode() {
        return DEFAULT_LANGUAGE.substring(0, 2).toUpperCase();
    }
}
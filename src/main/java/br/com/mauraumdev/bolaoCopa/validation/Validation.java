package br.com.mauraumdev.bolaoCopa.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public boolean validateNonNullOrNoBlank(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Deve ser preenchido todos os campos");
        }
        return true;
    }

    public boolean validateEmail(String email) {
        boolean result = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                result = true;
            }
        }
        return result;
    }

}
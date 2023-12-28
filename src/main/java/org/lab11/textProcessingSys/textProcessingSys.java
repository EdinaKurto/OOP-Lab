package org.lab11.textProcessingSys;


interface TextFormatter {
    String formatText(String text);
}

class UpperCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String[] words = text.split("\\s");
        StringBuilder camelCaseText = new StringBuilder();
        for (String word : words) {
            camelCaseText.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
        }
        return camelCaseText.toString();
    }
}

class TextEditor {
    private TextFormatter textFormatter;

    public void setFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        if (textFormatter == null) {
            throw new IllegalStateException("Text formatter is non existent.");
        }
        return textFormatter.formatText(text);
    }
}



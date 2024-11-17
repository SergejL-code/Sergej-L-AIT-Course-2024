package HomeWork_18.Library.modele;

public class Dictonary extends Book_1 {
    private String languageType;
    private String content;
    private String formOfPresentation;

    public Dictonary(String author, long isbn_Number, String title, int yearOfPublishing, String content, String formOfPresentation, String languageType) {
        super(author, isbn_Number, title, yearOfPublishing);
        this.content = content;
        this.formOfPresentation = formOfPresentation;
        this.languageType = languageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormOfPresentation() {
        return formOfPresentation;
    }

    public void setFormOfPresentation(String formOfPresentation) {
        this.formOfPresentation = formOfPresentation;
    }

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    @Override
    public String toString() {
        return "Dictonary{" +
                "content='" + content + '\'' +
                ", languageType='" + languageType + '\'' +
                ", formOfPresentation='" + formOfPresentation + '\'' +
                '}';
    }


}

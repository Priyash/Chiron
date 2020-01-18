package base.foundation_types.terminology;

public class Terminology_term {
    private Terminology_code concept = null;
    private String text = "";

    public Terminology_term(Terminology_code concept, String text) {
        this.concept = concept;
        this.text = text;
    }

    public Terminology_code getConcept() {
        return concept;
    }

    public String getText() {
        return text;
    }
}

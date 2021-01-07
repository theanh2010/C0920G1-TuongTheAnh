package vn.codegym.model;

public class BoxLetter {
    String language;
    int pageSize;
    boolean spam;
    String note;

    public BoxLetter(String language, int pageSize, boolean spam, String note) {
        this.language = language;
        this.pageSize = pageSize;
        this.spam = spam;
        this.note = note;
    }

    public BoxLetter() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

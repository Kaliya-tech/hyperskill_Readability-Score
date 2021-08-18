class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public String[] getAuthors() {
        return authors;
    }
}
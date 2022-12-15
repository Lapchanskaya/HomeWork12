public class Book {

    private String name;
    private Author author;
    private int year;

public Book(int year, String name , Author author){
    this.year = year;
    this.name = name;
    this.author = author;

}
     public int getYear() {
     return year;
}

     public String getName() {
     return name;
}
     public Author getAuthorName() {
     return author;
}
     public void setYear (int year){
     this.year = year;

 }
}
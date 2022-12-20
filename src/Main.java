public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, Книги");
//        Первая книга
        Author author1 = new Author("Роберт", "Стивенсон");
        Book bookName1 = new Book(new Author(author1.authorName, author1.authorSurname), "Остров сокровищ", 1882);
        System.out.println("Автор, название книги, год издания: " + author1.getAuthorName()+" "+ author1.getAuthorSurname()+ ", "+bookName1.getNameBook()+", "+ bookName1.getPublicationYear());
//        Вторая книга
        Author author2 = new Author("Дэниел", "Киз");
        Book bookName2 = new Book(new Author(author2.authorName, author2.authorSurname), "Цветы для Элджернона", 1959);
        System.out.println("Автор, название книги, год издания: " + author2.getAuthorName()+" "+ author2.getAuthorSurname()+ ", "+bookName2.getNameBook()+", "+ bookName2.getPublicationYear());
        bookName2.setPublicationYear(1960);
        System.out.println("Автор, название книги, год издания: " + author2.getAuthorName()+" "+ author2.getAuthorSurname()+ ", "+bookName2.getNameBook()+", "+ bookName2.getPublicationYear());
    }
}
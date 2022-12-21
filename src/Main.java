public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, Книги");
//        Первая книга
        Author author1 = new Author("Роберт", "Стивенсон");
        Book bookName1 = new Book(new Author(author1.getAuthorName(), author1.getAuthorSurname()), "Остров сокровищ", 1882);
        System.out.println(bookName1);
//        Вторая книга
        Author author2 = new Author("Дэниел", "Киз");
        Book bookName2 = new Book(new Author(author2.getAuthorName(), author2.getAuthorSurname()), "Цветы для Элджернона", 1959);
        System.out.println(bookName2);
        bookName2.setPublicationYear(1960);
        System.out.println(bookName2);
        System.out.println("Вывожу на печать результаты методов hashCode и equals:");
        System.out.println("Хэш-код первого ватора = " + author1.hashCode());
        System.out.println("Хэш-код второго ватора = " + author2.hashCode());
        System.out.println("Сравнение первого и второго автора = " + author1.equals(author2));
        System.out.println("Хэш-код первой книги = " + bookName1.hashCode());
        System.out.println("Хэш-код второй книги = " + bookName2.hashCode());
        System.out.println("Сравнение первой и второй книг = " + bookName1.equals(bookName2));
    }
}
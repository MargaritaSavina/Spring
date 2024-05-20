package seminars.sem4.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import seminars.sem4.models.Book;
import seminars.sem4.repository.Library;
@Controller
@AllArgsConstructor
public class LibraryController {
    private Library library = new Library();


    @GetMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",library.getBooks());
        return "books";
    }

    @PostMapping("/books")
    public String addBooks(Book b, Model model){
        library.addbook(b);
        model.addAttribute("books",library.getBooks());
        return "books";
    }
}

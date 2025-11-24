package com.example4_22.book.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example4_22.book.entity.Book;
import com.example4_22.book.form.BookForm;
import com.example4_22.book.repository.BookRepository;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * 本の一覧表示
     */
    @GetMapping("/books")
    public String index(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "book/index";
    }

    /**
     * 新規登録画面表示
     */
    @GetMapping("/books/new")
    public String createForm(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "book/new";
    }

    /**
     * 新規登録処理
     */
    @PostMapping("/books")
    public String create(@Valid @ModelAttribute BookForm bookForm, BindingResult result) {

        if (result.hasErrors()) {
            return "book/new";
        }

        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());

        bookRepository.save(book);
        return "redirect:/books";
    }

    /**
     * 編集画面表示
     */
    @GetMapping("/books/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {

        Book book = bookRepository.findById(id).orElseThrow();
        BookForm form = new BookForm();

        form.setId(book.getId());  // Long 同士で一致
        form.setTitle(book.getTitle());
        form.setAuthor(book.getAuthor());

        model.addAttribute("bookForm", form);
        return "book/edit";
    }

    /**
     * 更新処理
     */
    @PostMapping("/books/update")
    public String update(@Valid @ModelAttribute BookForm bookForm, BindingResult result) {

        if (result.hasErrors()) {
            return "book/edit";
        }

        Book book = bookRepository.findById(bookForm.getId()).orElseThrow();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());

        bookRepository.save(book);
        return "redirect:/books";
    }

    /**
     * 削除処理
     */
    @PostMapping("/books/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/books";
    }
}

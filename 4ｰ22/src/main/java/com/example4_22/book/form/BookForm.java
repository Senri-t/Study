package com.example4_22.book.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Data;

/**
 * 本情報 リクエストデータ
 */
@Data
public class BookForm {

    /**
     * ID
     */
    private long id;

    /**
     * タイトル
     */
    @NotEmpty(message = "タイトルを入力してください")
    @Size(max = 100, message = "タイトルは100文字以内で入力してください")
    private String title;

    /**
     * 著者
     */
    @NotEmpty(message = "著者名を入力してください")
    @Size(max = 50, message = "著者名は50文字以内で入力してください")
    private String author;

}

package com.example.helscorp.stockmanagement.controller.api;

import com.example.helscorp.stockmanagement.dto.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.helscorp.stockmanagement.utils.Constants.APP_ROOT;


public interface ArticleApi {

    @PostMapping(value =APP_ROOT+"/article/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save(@RequestBody ArticleDto dto);

    @GetMapping(value = APP_ROOT+"/article/{idArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT+"/article/{codeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findByCodeArticle(@PathVariable("codeArticle") String id);

    @GetMapping(value = APP_ROOT+"/article/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();

    @DeleteMapping(value = APP_ROOT+"/article/delete/{idArticle}")
    void delete(@PathVariable("idArticle") Integer id);

}

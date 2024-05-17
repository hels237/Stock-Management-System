package com.example.helscorp.stockmanagement.sevices;

import java.util.List;

public interface AbstractService<T> {

   T save(T dto);

   T findById(Integer id);

   T findByCodeArticle(String codeArticle);

   List<T> findAll();

   void delete(Integer id);

}

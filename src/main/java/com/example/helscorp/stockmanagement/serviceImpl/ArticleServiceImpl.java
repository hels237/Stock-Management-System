package com.example.helscorp.stockmanagement.serviceImpl;

import com.example.helscorp.stockmanagement.dto.ArticleDto;
import com.example.helscorp.stockmanagement.repository.ArticleRepository;
import com.example.helscorp.stockmanagement.sevices.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public ArticleDto save(ArticleDto dto) {

        return null;
    }

    @Override
    public ArticleDto findById(Integer id) {
        return null;
    }


    public ArticleDto findByCodeArticle(String codeArticle) {

        return null;
    }


    @Override
    public List<ArticleDto> findAll() {
        return List.of();
    }


    @Override
    public void delete(Integer id) {

    }
}

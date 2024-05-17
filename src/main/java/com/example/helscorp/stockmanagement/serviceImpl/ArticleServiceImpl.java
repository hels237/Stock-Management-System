package com.example.helscorp.stockmanagement.serviceImpl;

import com.example.helscorp.stockmanagement.dto.ArticleDto;
import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import com.example.helscorp.stockmanagement.model.Article;
import com.example.helscorp.stockmanagement.repository.ArticleRepository;
import com.example.helscorp.stockmanagement.sevices.ArticleService;
import com.example.helscorp.stockmanagement.validators.ArticleValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public ArticleDto save(ArticleDto dto) {
        // validate the object
        List<String> errors = ArticleValidator.validate(dto);

        if(!errors.isEmpty()){
            throw new EntityNotFoundException("Article not found !", ErrorCodes.ARTICLE_NOT_FOUND);
        }

        return ArticleDto.fromEntity(articleRepository.save(ArticleDto.toEntity(dto)));
    }


    @Override
    public ArticleDto findById(Integer id) {

        if( id == null){
            return  null;
        }

        Optional<Article> article = articleRepository.findById(id);
        ArticleDto dto = ArticleDto.fromEntity(article.get());

        return Optional.of(dto).orElseThrow(

                ()->new EntityNotFoundException(" article not found for id : "+id,ErrorCodes.ARTICLE_NOT_FOUND)
        );

    }


    public ArticleDto findByCodeArticle(String codeArticle) {

        if(!StringUtils.hasLength(codeArticle)){
            return  null;
        }

        Optional<Article> article = articleRepository.findArticleByCodeArticle(codeArticle);
        ArticleDto dto = ArticleDto.fromEntity((article.get()));

        return Optional.of(dto).orElseThrow(
                ()-> new EntityNotFoundException("article not found for codeArticle : "
                        +codeArticle,ErrorCodes.ARTICLE_NOT_FOUND)

        );

    }


    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll().stream().map(ArticleDto::fromEntity).toList();
    }


    @Override
    public void delete(Integer id) {

        if(id == null){
            return;
        }
        articleRepository.deleteById(id);
    }
}

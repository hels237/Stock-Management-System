package com.example.helscorp.stockmanagement.sevices.Impl;

import com.example.helscorp.stockmanagement.dto.CategoryDto;
import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import com.example.helscorp.stockmanagement.exceptions.InvalidEntityException;
import com.example.helscorp.stockmanagement.repository.CategoryRepository;
import com.example.helscorp.stockmanagement.sevices.CategoryService;
import com.example.helscorp.stockmanagement.validators.CategoryValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public CategoryDto save(CategoryDto dto) {

        List<String> error = CategoryValidator.validate(dto);

        if(!error.isEmpty()){
            throw  new InvalidEntityException("invalid category ", ErrorCodes.CATEGORY_NOT_VALID,error);
        }

        return CategoryDto.fromEntity(categoryRepository.save(CategoryDto.toEntity(dto)));
    }

    @Override
    public CategoryDto findById(Integer id) {
        return categoryRepository
                .findById(id)
                .map(CategoryDto::fromEntity)
                .orElseThrow(
                        ()-> new EntityNotFoundException("Category not found with ID : "+id,ErrorCodes.CATEGORY_NOT_FOUND)
                );
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryRepository.findAll().stream().map(CategoryDto::fromEntity).toList();
    }

    @Override
    public void delete(Integer id) {
        if (id == null){
            return ;
        }
        categoryRepository.deleteById(id);
    }
}

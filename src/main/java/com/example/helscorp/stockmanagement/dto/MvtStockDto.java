package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.SourceMvtStk;
import com.example.helscorp.stockmanagement.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    private SourceMvtStk sourceMvt;

    private ArticleDto article;
}

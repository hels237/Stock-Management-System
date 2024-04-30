package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.MvtStock;
import com.example.helscorp.stockmanagement.model.SourceMvtStk;
import com.example.helscorp.stockmanagement.model.TypeMvtStk;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MvtStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    private SourceMvtStk sourceMvt;

    private ArticleDto article;


    public static MvtStockDto fromEntity(MvtStock mvtStock){

        if(mvtStock == null){
            return null;
            //todo throw exception
        }

        MvtStockDto mvtStockDto = new MvtStockDto();
        mvtStockDto.setId(mvtStock.getId());
        mvtStockDto.setDateMvt(mvtStock.getDateMvt());
        mvtStockDto.setSourceMvt(mvtStock.getSourceMvt());
        mvtStockDto.setQuantite(mvtStock.getQuantite());
        mvtStockDto.setArticle(ArticleDto.fromEntity(mvtStock.getArticle()));
        mvtStockDto.setTypeMvt(mvtStock.getTypeMvt());

        return  mvtStockDto;
    }

    public static MvtStock toEntity(MvtStockDto mvtStockDto){

        if(mvtStockDto == null){
            return null;
            //todo throw an exception
        }

        MvtStock mvtStock = new MvtStock();
        mvtStock.setId(mvtStockDto.getId());
        mvtStock.setDateMvt(mvtStockDto.getDateMvt());
        mvtStock.setArticle(ArticleDto.toEntity(mvtStockDto.getArticle()));
        mvtStock.setQuantite(mvtStockDto.getQuantite());
        mvtStock.setSourceMvt(mvtStockDto.getSourceMvt());
        mvtStock.setTypeMvt(mvtStockDto.getTypeMvt());

        return mvtStock;
    }
}

package com.example.helscorp.stockmanagement.handler;


import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDto {

    private ErrorCodes errorCodes;
    private Integer httpStatus;
    private String message;
    private List<String> errors = new ArrayList<>();


}

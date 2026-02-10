package com.satoru.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SatoruApiResponse<T> {

    private int responseCode;
    private String status;
    private T data;
    private String description;

    /* ===== static factory ===== */

    public static <T> SatoruApiResponse<T> success(T data) {
        return new SatoruApiResponse<>(
                200,
                "success",
                data,
                ""
        );
    }

    public static <T> SatoruApiResponse<T> success(T data, String description) {
        return new SatoruApiResponse<>(
                200,
                "success",
                data,
                description
        );
    }

    public static <T> SatoruApiResponse<T> error(int code, String description) {
        return new SatoruApiResponse<>(
                code,
                "error",
                null,
                description
        );
    }
}

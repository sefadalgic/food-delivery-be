package com.sefadalgic.fooddelivery.app.exception

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler


@ControllerAdvice
class GlobalExceptionHandler {


    @ExceptionHandler
    fun handleException (e: Exception) : ResponseEntity<ApiResponse<Nothing>> {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
            ApiResponse(
                message = "Something went wrong: ${e.message}",
                data = null
            )
        )
    }

}
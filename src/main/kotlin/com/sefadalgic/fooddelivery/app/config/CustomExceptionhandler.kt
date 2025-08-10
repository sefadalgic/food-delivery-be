package com.sefadalgic.fooddelivery.app.config

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import org.springframework.web.multipart.MultipartException

@RestControllerAdvice()
class CustomExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationException(ex: MethodArgumentNotValidException): ResponseEntity<ApiResponse<Unit>> {
        val errors = ex.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage}" }
        return ResponseEntity.badRequest().body(ApiResponse(status = HttpStatus.BAD_REQUEST.value(), message = errors))
    }

    @ExceptionHandler(BindException::class)
    fun handleBindException(ex: BindException): ResponseEntity<ApiResponse<Unit>> {
        val errors = ex.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage}" }
        return ResponseEntity.badRequest().body(ApiResponse(status = HttpStatus.BAD_REQUEST.value(), message = errors))
    }

    @ExceptionHandler(MissingServletRequestParameterException::class)
    fun handleMissingParam(ex: MissingServletRequestParameterException): ResponseEntity<ApiResponse<Unit>> {
        return ResponseEntity.badRequest().body(ApiResponse(status = HttpStatus.BAD_REQUEST.value(), message = "Required parameter '${ex.parameterName}' is missing"))
    }

    @ExceptionHandler(MultipartException::class)
    fun handleMultipartException(ex: MultipartException): ResponseEntity<ApiResponse<Unit>> {
        return ResponseEntity.badRequest().body(ApiResponse(status = HttpStatus.BAD_REQUEST.value(), message = "Invalid file format or missing file"))
    }


    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleInvalidFormat(ex: HttpMessageNotReadableException): ResponseEntity<ApiResponse<Unit>> {
        return ResponseEntity.badRequest().body(ApiResponse(status = HttpStatus.BAD_REQUEST.value(), message = "Invalid request format. Please check your input data."))
    }

    @ExceptionHandler(Exception::class)
    fun handleTypeMismatch(ex: MethodArgumentTypeMismatchException): ResponseEntity<ApiResponse<Nothing>> {
        val message = "Invalid path variable '${ex.name}': expected type ${ex.requiredType?.simpleName}"
        val response = ApiResponse(
            message = message,
            success = false,
            data = null
        )
        return ResponseEntity.badRequest().body(response)
    }
}

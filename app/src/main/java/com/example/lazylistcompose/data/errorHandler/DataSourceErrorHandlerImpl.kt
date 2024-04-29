package es.rudo.planning.data.errorHandler

import com.example.lazylistcompose.domain.entity.AppError
import com.example.lazylistcompose.domain.repository.ErrorHandler
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException

class DataSourceErrorHandlerImpl() : ErrorHandler {
    override fun handle(e: Exception): Exception {
        return when (e) {
            is HttpException -> {
                val code = e.response()?.code()
                val body = e.response()?.errorBody()?.string() ?: ""
                AppError.NetworkError(code ?: 0, body)
            }
            is SocketTimeoutException, is IOException -> AppError.NoInternet
            else -> AppError.UnknownError
        }
    }
}
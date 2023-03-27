package ru.asmelnikov.stokemarketapp.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import ru.asmelnikov.stokemarketapp.data.remote.dto.IntradayInfoDto
import ru.asmelnikov.stokemarketapp.domain.model.IntradayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O) // TODO fix that
fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntradayInfo(
        date = localDateTime,
        close = close
    )
}
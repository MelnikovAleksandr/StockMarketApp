package ru.asmelnikov.stokemarketapp.presentation.company_info

import ru.asmelnikov.stokemarketapp.domain.model.CompanyInfo
import ru.asmelnikov.stokemarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfo: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

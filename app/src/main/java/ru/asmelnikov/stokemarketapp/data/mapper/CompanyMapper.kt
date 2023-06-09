package ru.asmelnikov.stokemarketapp.data.mapper

import ru.asmelnikov.stokemarketapp.data.local.CompanyListingEntity
import ru.asmelnikov.stokemarketapp.data.remote.dto.CompanyInfoDto
import ru.asmelnikov.stokemarketapp.domain.model.CompanyInfo
import ru.asmelnikov.stokemarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}
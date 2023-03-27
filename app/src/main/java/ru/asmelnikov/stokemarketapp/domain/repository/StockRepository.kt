package ru.asmelnikov.stokemarketapp.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.asmelnikov.stokemarketapp.domain.model.CompanyInfo
import ru.asmelnikov.stokemarketapp.domain.model.CompanyListing
import ru.asmelnikov.stokemarketapp.domain.model.IntradayInfo
import ru.asmelnikov.stokemarketapp.util.Resource

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}
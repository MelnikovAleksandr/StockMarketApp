package ru.asmelnikov.stokemarketapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.asmelnikov.stokemarketapp.data.cvs.CSVParser
import ru.asmelnikov.stokemarketapp.data.cvs.CompanyListingsParser
import ru.asmelnikov.stokemarketapp.data.repository.StockRepositoryImpl
import ru.asmelnikov.stokemarketapp.domain.model.CompanyListing
import ru.asmelnikov.stokemarketapp.domain.repository.StockRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun binsStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}
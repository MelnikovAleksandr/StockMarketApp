package ru.asmelnikov.stokemarketapp.data.cvs

import java.io.InputStream

interface CSVParser<T> {

    suspend fun parse(stream: InputStream): List<T>

}
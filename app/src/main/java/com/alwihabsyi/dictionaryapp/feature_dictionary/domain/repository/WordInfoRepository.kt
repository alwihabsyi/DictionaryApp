package com.alwihabsyi.dictionaryapp.feature_dictionary.domain.repository

import com.alwihabsyi.dictionaryapp.core.util.Resource
import com.alwihabsyi.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}
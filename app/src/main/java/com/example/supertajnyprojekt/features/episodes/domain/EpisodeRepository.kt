package com.example.supertajnyprojekt.features.episodes.domain

import com.example.supertajnyprojekt.features.episodes.domain.model.Episode

interface EpisodeRepository {
    suspend fun getCharacters(): List<Episode>
}
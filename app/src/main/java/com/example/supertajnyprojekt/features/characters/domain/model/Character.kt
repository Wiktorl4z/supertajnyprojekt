package com.example.supertajnyprojekt.features.characters.domain.model

data class Character(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: CharacterLastLocation,
    val name: String,
    val origin: CharacterOriginLocation,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

data class CharacterOriginLocation(
    val name: String,
    val url: String
)

data class CharacterLastLocation(
    val name: String,
    val url: String
)
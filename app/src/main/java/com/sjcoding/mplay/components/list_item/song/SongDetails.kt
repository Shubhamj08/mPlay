package com.sjcoding.mplay.components.list_item.song

import java.util.UUID

data class SongDetails(
    val id: String = UUID.randomUUID().toString(),               // Unique identifier for the song
    val title: String,          // Title of the song
    val artists: List<String> = emptyList(),         // Artist of the song
    val album: String,          // Album of the song
    val duration: Long,         // Duration of the song in seconds
    val genre: String,          // Genre of the song
    val releaseYear: Int,       // Release year of the song
    val albumArtUrl: String,    // URL or path to the album art image
    val filePath: String        // File path of the song in the device storage
) {

    fun getDurationInMinutes(): String {
        val minutes = duration / 60
        val seconds = duration % 60

        return "${minutes}:${if(seconds < 10) "0${seconds}" else seconds}"
    }

}

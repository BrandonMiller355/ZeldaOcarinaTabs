package com.brandonmiller355.zeldaocarinatabs.SongItems

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object SongItemContent {

    /**
     * An array of sample (SongItem) items.
     */
    val ITEMS: MutableList<SongItem> = ArrayList()

    /**
     * A map of sample (SongItem) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, SongItem> = HashMap()

    private val COUNT = 3

    init {
        // Static list of songs.
        addItem(createSongItem(1, "Zelda's Lullaby"))
        addItem(createSongItem(2, "Song of Storms"))
        addItem(createSongItem(3, "Song of Time"))
    }

    private fun addItem(item: SongItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createSongItem(position: Int, songName: String): SongItem {
        return SongItem(position.toString(), songName, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class SongItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}

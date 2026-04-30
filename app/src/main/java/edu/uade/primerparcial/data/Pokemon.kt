package edu.uade.primerparcial.data

data class Pokemon(
    val name: String,
    val url: String
) {
    val id: Int
        get() = url.trimEnd('/').substringAfterLast('/').toIntOrNull() ?: 0

    val spriteUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"

    val nameFormatted: String
        get() = name.replaceFirstChar { it.uppercase() }
}

// Movi la clase de cada Pokemon especifico aca para sacar logica del MainActivity
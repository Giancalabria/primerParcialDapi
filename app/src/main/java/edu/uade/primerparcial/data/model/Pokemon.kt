package edu.uade.primerparcial.data.model

data class Pokemon(
    val name: String,
    val url: String
) {
    val id: Int
        get() = url.trimEnd('/').substringAfterLast('/').toIntOrNull() ?: 0

    val nameFormatted: String
        get() = name.replaceFirstChar { it.uppercase() }
}

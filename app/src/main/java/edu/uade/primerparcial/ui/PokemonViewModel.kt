package edu.uade.primerparcial.ui

import androidx.lifecycle.ViewModel
import edu.uade.primerparcial.data.model.Pokemon
import edu.uade.primerparcial.data.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokemonViewModel(
    private val repository: PokemonRepository = PokemonRepository()
) : ViewModel() {
    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons.asStateFlow()

    init {
        _pokemons.value = repository.getPokemons()
    }
}

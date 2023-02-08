package com.ircarren.examenapp.provider

import com.ircarren.examenapp.R
import com.ircarren.examenapp.model.Dios

class DiosProvider {

    companion object{
        val dioses = listOf(
                Dios("Zeus", R.drawable.zeus, "Zeus es el dios del cielo y el trueno, el padre de los dioses y los hombres"),
                Dios("Hades", R.drawable.hadesjpg, "Hades es el dios del inframundo, el rey de los muertos y el hermano de Zeus"),
                Dios("Poseidón", R.drawable.poseidon, "Poseidón es el dios del mar y de los terremotos, el hermano de Zeus"),
                Dios("Apolo", R.drawable.apolo, "Apolo es el dios de la luz, la música, la medicina, la profecía y la sanación, hijo de Zeus y Leto"),
                Dios("Atenea", R.drawable.atenea, "Atenea es la diosa de la sabiduría, la estrategia, la justicia, la guerra y la defensa, hija de Zeus y Metis"),
                Dios("Hefesto", R.drawable.dionisio, "Hefesto es el dios del fuego, la fundición, la metalurgia, la herrería y la forja, hijo de Zeus y Hera"),
                Dios("Hermes", R.drawable.hermes, "Hermes es el dios de la comunicación, el comercio, los mensajeros, los ladrones y los viajeros, hijo de Zeus y Maia"),
                Dios("Dionisio", R.drawable.dionisio, "Dionisio es el dios del vino, la juerga y la locura, hijo de Zeus y Semele"),
                Dios("Ares", R.drawable.ares, "Ares es el dios de la guerra y la violencia, hijo de Zeus y Hera"),
                Dios("Afrodita", R.drawable.afrodita, "Afrodita es la diosa del amor y la belleza, hija de Zeus y Dione")
        )
    }
}
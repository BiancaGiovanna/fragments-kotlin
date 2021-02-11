package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class GameDataSource {
//    companion object é um object static
    companion object{
        fun getGames(context: Context): ArrayList<Game>{
            var games = ArrayList<Game>()
            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mkt)!!,
                "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games. Em 2011, depois da falência da Midway, a produção de Mortal Kombat foi adquirida pela Warner Bros, tornando-se em seguida na Netherealm. A Warner detém atualmente os direitos da série",
                4.5f,
                listOf(Console(
                    1,
                    "PlayStation 1",
                    "Sony",
                    "1996-12-01" ),
                Console(
                    2,
                    "PlayStation 2",
                    "Sony",
                    "2000-03-06")
                )
            ))
            games.add(Game(
                2,
                "God Of War 3",
                context.getDrawable(R.drawable.gow3)!!,
                "God of War III é um jogo eletrônico de ação-aventura e hack and slash desenvolvido pela Santa Monica Studio e publicado pela Sony Computer Entertainment. Foi lançado em 16 de março de 2010 para PlayStation 3",
                3.5f,
                listOf(Console(
                    3,
                    "PlayStation 3",
                    "Sony",
                    "2006-01-01" ),
                    Console(
                        4,
                        "PlayStation 4",
                        "Sony",
                        "2013-09-06"))
            ))

            games.add(Game(
                3,
                "inFamous Serie",
                context.getDrawable(R.drawable.infamous)!!,
                "Infamous é uma série de videojogos de Acção-aventura e plataformas jogados em mundo aberto, produzido pela Sucker Punch Productions e publicados pela Sony Computer Entertainment de modo exclusivo para o PlayStation 3 e PlayStation 4.",
                5.0f,
                listOf(Console(
                    3,
                    "PlayStation 3",
                    "Sony",
                    "2006-01-01" ),
                    Console(
                        4,
                        "PlayStation 4",
                        "Sony",
                        "2013-09-06"))
            ))
            return games
        }
    }
}

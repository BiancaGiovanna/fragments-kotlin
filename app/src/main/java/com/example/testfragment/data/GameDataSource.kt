package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class GameDataSource {
//    companion object é um objeto static
    companion object{
        fun getGames(context: Context): ArrayList<Game>{
            var games = ArrayList<Game>()
            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mkt)!!,
                "Mortal Kombat é bacana :3",
                4.5,
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
                "God Of War 3 é bacana :3",
                4.5,
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
                "God Of War 3",
                context.getDrawable(R.drawable.gow3)!!,
                "God Of War 3 é bacana :3",
                4.5,
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
                4,
                "inFamous-Serie",
                context.getDrawable(R.drawable.infamous)!!,
                "inFamous é bacana :3",
                4.5,
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

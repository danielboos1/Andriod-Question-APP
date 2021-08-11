package com.example.quizeapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()
        val que1 = Question(1,"what country does this flag belong to?",
        R.drawable.mozambique, "Mozambique", "Antwerp",
                "Nepal", "Frisian", 1
        )
        questionsList.add(que1)


        val que2 = Question(1,"Name the artist!",
                R.drawable.pop_smoke, "50 Cent", "travis Scott",
                "Pop smoke", "Dave", 3
        )
        questionsList.add(que2)
        val que3 = Question(1,"What car is this?",
                R.drawable.mazda_miata, "Honda S2000", "Toyota MR2",
                "BMW Z4", "Mazda Miata", 4
        )
        questionsList.add(que3)
        val que4 = Question(1,"when was trump elected?",
                R.drawable.trump, "2017", "2018",
                "2016", "2015", 3
        )
        questionsList.add(que4)

        val que5 = Question(1,"What is square root of -1",
            0, "Undefined", "Math ERROR",
            "Syntx Error", "i", 4
        )
        questionsList.add(que5)

        val que6 = Question(1,"what is Ariana Grande's Brother's Name",
            0 , "Frankie", "Berlin",
            "Chris", "Frank", 1
        )
        questionsList.add(que6)
        val que7 = Question(1,"Which country invented Tea",
            0, "India", "Austraila",
            "Japan", "China", 4
        )
        questionsList.add(que7)
        val que8 = Question(1,"Whats pure water's ph level",
            0, "7", "10",
            "6", "5", 1
        )
        questionsList.add(que8)
        val que9 = Question(1,"What is the hardest rock?",
            0, "Sapphire", "Diamond",
            "Emerald", "Painite", 2
        )
        questionsList.add(que9)
        val que10 = Question(1,"How many bones do sharks have?",
            0, "0", "1421",
            "208", "481", 1
        )
        questionsList.add(que10)
        return questionsList
    }

}
package com.example.quizzapp

object Constants {

    fun getQuestions() : ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //1
        val q1 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
            "Brazil", "Brunei", "Monaco", "Argentina",
            4
        )
        questionList.add(q1)

        //2
        val q2 = Question(
            2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "Tadjikistan", "Tatarstan", "Kazakhstan", "Australia",
            4
        )
        questionList.add(q2)

        //3
        val q3 = Question(
            3, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Belgium", "Armenia", "Uzbekistan", "Kongo",
            1
        )
        questionList.add(q3)

        //4
        val q4 = Question(
            4, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Russia", "Belarus", "Brazil", "Unknown",
            3
        )
        questionList.add(q4)

        //5
        val q5 = Question(
            5, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Mexico", "Denmark", "Ethiopia", "Philippines",
            2
        )
        questionList.add(q5)

        //6
        val q6 = Question(
            6, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Germany", "France", "Italy", "Fiji",
            4
        )
        questionList.add(q6)

        //7
        val q7 = Question(
            7, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Spain", "Ukraine", "Germany", "Canada",
            3
        )
        questionList.add(q7)

        //8
        val q8 = Question(
            8, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "India", "Malaysia", "Nepal", "Australia",
            1
        )
        questionList.add(q8)

        //9
        val q9 = Question(
            8, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Niger", "Kuwait", "Nepal", "Mali",
            2
        )
        questionList.add(q9)


        return questionList
    }
}
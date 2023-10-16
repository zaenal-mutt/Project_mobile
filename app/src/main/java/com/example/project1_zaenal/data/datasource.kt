package com.example.project1_zaenal.data

import com.example.project1_zaenal.R
import com.example.project1_zaenal.biodata.project1_zaenal

class datasource {fun loadproject1_zaenal(): List<project1_zaenal> {
    return listOf<project1_zaenal>(
        project1_zaenal(R.string.Project1_Zaenal1, R.drawable.image1),
        project1_zaenal(R.string.Project1_Zaenal2, R.drawable.image2),
        project1_zaenal(R.string.Project1_Zaenal3, R.drawable.image3))
}
}
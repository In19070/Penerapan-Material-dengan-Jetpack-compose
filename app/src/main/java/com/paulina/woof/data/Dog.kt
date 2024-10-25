package com.paulina.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.paulina.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.naruto, R.string.dog_name_1, 2, R.string.dog_description_1),
    Dog(R.drawable.itachi, R.string.dog_name_2, 16, R.string.dog_description_2),
    Dog(R.drawable.hinata, R.string.dog_name_3, 2, R.string.dog_description_3),
    Dog(R.drawable.luffy, R.string.dog_name_4, 8, R.string.dog_description_4),
    Dog(R.drawable.zoro, R.string.dog_name_5, 8, R.string.dog_description_5),
    Dog(R.drawable.robin, R.string.dog_name_6, 14, R.string.dog_description_6),
    Dog(R.drawable.sanji, R.string.dog_name_7, 2, R.string.dog_description_7),
    Dog(R.drawable.eren, R.string.dog_name_8, 7, R.string.dog_description_8),
)

package com.dog.data.model.dog

import com.dog.data.model.common.ResponseBodyResult

data class DogResponse(
    val result: ResponseBodyResult,
    val body: List<DogInfo>,
)

data class DogInfo(
    val dogId: String? = "",
    val dogAboutMe: String,
    val dogBirthdate: String,
    val dogName: String,
    val dogBreed: String,
    val dogDispositionList: List<String>,
    val dogPicture: String,
    val dogSize: String
)

data class RegisterDogInfo(
    val dogAboutMe: String,
    val dogBirthdate: String,
    val dogName: String,
    val dogBreed: String,
    val dogDispositionList: List<String>,
    val dogPicture: String,
    val dogSize: String
)


data class RegisterDogResponse(
    val result: ResponseBodyResult,
    val body: NewDog,
)

data class NewDog(
    val dogId: Int
)

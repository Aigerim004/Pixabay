package com.example.pixabay

data class PixModel(
    val total :Int,
    val hits:List<ImageModel>,
    val totalHits:Int
        )

data class ImageModel (
    val largeImageURL:String
        )
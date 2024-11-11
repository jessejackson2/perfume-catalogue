package com.project.perfumecatalogue

//a data class to represent a perfume
data class Perfume(val name: String, val description: String, val imageResId: Int)

//a list of perfumes
val perfumes = listOf(
    Perfume("Floral Fantasy", "A captivating fragrance that embodies the beauty of nature and the love of romance. This scent is perfect for romantic occasions or any time of the day.", R.drawable.perfume),
    Perfume("Aromatic", "A bold and luxurious scent that will energize you and your senses with a sense of serenity, calmness, and peace. This scent is perfect for any occasion.", R.drawable.perfume1),
    Perfume("Citrus Burst", "A scent that will make you feel relaxed and happy. This scent is perfect for any time of the day. It is also a great choice for weddings and any other special occasion.", R.drawable.perfume2),
    Perfume("Elegance", "Enjoy this scent to relax and unwind. This scent is perfect for any time of the day. It is also a great choice for romantic occasions or any other special occasion.", R.drawable.perfume3),
    Perfume("Sweet Dreams", "A dreamy and soothing scent that will make you feel calm and relaxed. This scent is perfect for any time of the day. It is also a great choice for any special occasion.", R.drawable.perfume4),

)

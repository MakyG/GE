package com.makyg.ge.Model

class Post {
    private var postid: String = ""
    private var postimage: String = ""
    private var publisher: String = ""
    private var desctiption: String = ""

    constructor()
    constructor(postid: String, postimage: String, publisher: String, desctiption: String) {
        this.postid = postid
        this.postimage = postimage
        this.publisher = publisher
        this.desctiption = desctiption
    }

    fun getPostid(): String{
        return postid
    }
    fun getPostimage(): String{
        return postimage
    }
    fun getPublisher(): String{
        return publisher
    }
    fun getDescription(): String{
        return desctiption
    }

    fun setPostid(postid: String){
        this.postid = postid
    }
    fun setPostimage(postimage: String){
        this.postimage = postimage
    }
    fun setPublisher(publisher: String){
        this.publisher = publisher
    }
    fun setDescription(desctiption: String){
        this.desctiption = desctiption
    }


}
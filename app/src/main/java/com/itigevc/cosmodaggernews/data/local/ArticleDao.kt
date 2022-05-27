package com.itigevc.cosmodaggernews.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.itigevc.cosmodaggernews.data.model.Article

@Dao
interface ArticleDao {

    @Query("Select * from article")
    fun getArticles(): List<Article>

    @Insert
    fun insertArticle(article: Article)

    @Delete
    fun deleteArticle(article: Article)

}

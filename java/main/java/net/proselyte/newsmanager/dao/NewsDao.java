package net.proselyte.newsmanager.dao;

import java.util.List;

import net.proselyte.newsmanager.model.News;

public interface NewsDao {
    public void addNews(News news);

    public void updateNews(News news);

    public void removeNews(int id);

    public News getNewsById(int id);

    public List<News> listNews();
}

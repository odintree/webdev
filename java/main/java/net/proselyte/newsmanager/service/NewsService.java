package net.proselyte.newsmanager.service;

import java.util.List;

import net.proselyte.newsmanager.model.News;

public interface NewsService {
    public void addNews(News news);

    public void updateNews(News news);

    public void removeNews(int id);

    public News getNewsById(int id);

    public List<News> listNews();
}

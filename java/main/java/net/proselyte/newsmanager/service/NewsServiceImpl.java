package net.proselyte.newsmanager.service;

import net.proselyte.newsmanager.dao.NewsDao;
import net.proselyte.newsmanager.model.News;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private NewsDao newsDao;

    public void setNewDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }

    @Override
    @Transactional
    public void addNews(News news) {
        this.newsDao.addNews(news);
    }

    @Override
    @Transactional
    public void updateNews(News news) {
        this.newsDao.updateNews(news);
    }

    @Override
    @Transactional
    public void removeNews(int id) {
        this.newsDao.removeNews(id);
    }

    @Override
    @Transactional
    public News getNewsById(int id) {
        return this.newsDao.getNewsById(id);
    }

    @Override
    @Transactional
    public List<News> listNews() {
        return this.newsDao.listNews();
    }
}

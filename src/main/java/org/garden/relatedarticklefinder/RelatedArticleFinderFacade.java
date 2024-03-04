package org.garden.relatedarticklefinder;

import org.garden.readerarticleretriever.ArticleDto;

import java.util.List;

public class RelatedArticleFinderFacade {

    private final ArticleRepository articleRepository; // Przyjmij, że masz repozytorium artykułów

    public RelatedArticleFinderFacade(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<ArticleDto> findRelatedArticles(Long articleId, int limit) {
        // Pobierz artykuł na podstawie articleId
        ArticleDto currentArticle = articleRepository.findById(articleId);

        if (currentArticle == null) {
            throw new IllegalArgumentException("Article with ID " + articleId + " not found");
        }

        // Pobierz powiązane artykuły na podstawie kategorii
        List<ArticleDto> relatedArticles = articleRepository.findByCategory(currentArticle.getCategory(), limit);

        // Wyklucz bieżący artykuł z listy powiązanych artykułów
        relatedArticles.removeIf(article -> article.getId().equals(currentArticle.getId()));

        return relatedArticles;
    }

}

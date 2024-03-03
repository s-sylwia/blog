package org.garden.readerarticleretriever;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class ReaderArticleRetrieverFacadeTest {

    @Test
    @DisplayName("should return article with ID 1 and new content")
    public void should_return_article_with_ID_1_and_new_content() {
//        given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
//         when
        ArticleDto articleDto = facade.retrieveByID(1L);
//        then
        assert articleDto.Id().equals(1L);
//        assert articleDto.header().equals("my house");
        assert articleDto.content().equals("How to start?");
        assert articleDto.category().equals("Advices");
    }


    @Test
    @DisplayName("should return null for non-existing ID")
    void retrieveById_NonExistingId_ReturnsNull() {
        // given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
        long nonExistingId = 999L;

        // when
        ArticleDto articleDto = facade.retrieveByID(nonExistingId);

        // then
        assertNull(articleDto, "Expected null for non-existing ID");
    }

    @Test
    void retrieveById_NullId_ReturnsNull() {
        // given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
        Long nullId = null;
        // when
        ArticleDto articleDto = facade.retrieveByID(nullId);
        // then
        assertNull(articleDto, "Expected null when Id is null");
    }
}
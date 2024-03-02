package org.garden.readerarticleretriever;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReaderArticleRetrieverFacadeTest {

    @Test
    @DisplayName("should return article with ID 1 and new content")
    public void should_return_article_with_ID_1_and_new_content() {
//        given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
//         when
        ArticleDto articleDto = facade.retrieveByID(1L);
//        then
        assert articleDto.Id().equals(1);
        assert articleDto.header().equals("my house");
        assert articleDto.content().equals("How to start?");
        assert articleDto.category().equals("Advices");


    }
}
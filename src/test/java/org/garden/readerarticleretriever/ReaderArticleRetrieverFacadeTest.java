package org.garden.readerarticleretriever;


import org.garden.authorartickleretriever.ArticleDto;
import org.junit.jupiter.api.Test;

class ReaderArticleRetrieverFacadeTest {

    @Test
    public void d() {
//        given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();
//         when
        ArticleDto articleDto = facade.retrieveByID(1L);



    }
}
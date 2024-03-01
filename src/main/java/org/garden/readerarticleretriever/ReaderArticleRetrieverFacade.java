package org.garden.readerarticleretriever;

public class ReaderArticleRetrieverFacade {

    ArticleDto retrieveByID(Long Id){
        return ArticleDto.builder()
                .Id(1L)
                .header("My Garden")
                .content("How to start?")
                .category("Advices")
                .build();
    }
}

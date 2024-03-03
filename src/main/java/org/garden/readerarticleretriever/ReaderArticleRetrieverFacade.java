package org.garden.readerarticleretriever;

import java.util.Objects;

public class ReaderArticleRetrieverFacade {

    ArticleDto retrieveByID(Long Id){
        try {
            Objects.requireNonNull(Id, "Id cannot be null");
        } catch (NullPointerException e) {

            return null;
        }

        return ArticleDto.builder()
                .Id(1L)
                .header("My Garden")
                .content("How to start?")
                .category("Advices")
                .build();
    }
}

package org.garden;

import org.garden.readerarticleretriever.ReaderArticleRetrieverFacade;

public class Main {
    public static void main(String[] args) {

        ReaderArticleRetrieverFacade readerArtickleRetrieverFacade = new ReaderArticleRetrieverFacade();
        ArtickleDTO artickleDTO = readerArtickleRetrieverFacade.retrieveByID(1);

    }
}
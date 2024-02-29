package org.garden.authorartickleretriever;


import lombok.Builder;

@Builder
public record ArticleDto(Long Id, String header, String content, String category ) {
}

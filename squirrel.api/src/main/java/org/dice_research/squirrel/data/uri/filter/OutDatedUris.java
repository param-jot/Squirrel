package org.dice_research.squirrel.data.uri.filter;

import java.util.List;

import org.dice_research.squirrel.data.uri.CrawleableUri;

public interface OutDatedUris {


    /**
     * Returns all {@link CrawleableUri}s which have to be recrawled. This means their time to next crawl has passed.
     *
     * @return The outdated {@link CrawleableUri}s.
     */
    public List<CrawleableUri> getUriToRecrawl();

}

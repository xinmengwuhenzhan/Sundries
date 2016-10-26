package pers.zhangshaoqun.sundries.api.message.response.news;

import pers.zhangshaoqun.sundries.api.message.response.BaseMessage;

import java.util.List;

/**
 * 图文消息
 */
public class NewsMessage extends BaseMessage {
  private int ArticleCount;
  private List<ArticlesInfo> Articles;

  /** 图文消息个数，限制为10条以内 */
  public int getArticleCount() {
    return ArticleCount;
  }

  public void setArticleCount(int articleCount) {
    ArticleCount = articleCount;
  }

  /** 多条图文消息信息，默认第一个item为大图 */
  public List<ArticlesInfo> getArticles() {
    return Articles;
  }

  public void setArticles(List<ArticlesInfo> articles) {
    Articles = articles;
  }
}

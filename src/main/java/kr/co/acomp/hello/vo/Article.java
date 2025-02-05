package kr.co.acomp.hello.vo;

public class Article {
	 private int articleId;
		private String author;
		private String title;
		private String content;
		public Article() {};
		
		
		@Override
		public String toString() {
			return "Article [articleId=" + articleId + ", author=" + author + ", title=" + title + ", content="
					+ content + "]";
		}


		public int getArticleId() {
			return articleId;
		}


		public void setArticleId(int articleId) {
			this.articleId = articleId;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getContent() {
			return content;
		}


		public void setContent(String content) {
			this.content = content;
		}


		public Article(int articleID, String author, String title, String content) {
			super();
			this.articleId = articleID;
			this.author = author;
			this.title = title;
			this.content = content;
			
		}


}

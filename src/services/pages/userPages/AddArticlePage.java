package services.pages.userPages;

import services.modals.InsertArticle;
import services.modals.SelectCategory;
import services.modals.SelectTag;
import services.pages.base.Page;

public class AddArticlePage extends Page {
   String[] s = {"ali", "mamad","hasan","hamid","saeed" , "new Category"};
    SelectCategory selectCategoryModal = new SelectCategory(s);
    InsertArticle insertArticleModal = new InsertArticle();
    SelectTag selectTagModal = new SelectTag(s);

    @Override
    public void run() {
        selectCategoryModal.run();
        insertArticleModal.run();
        selectTagModal.run();

    }
}

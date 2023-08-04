// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {

    /**
    * Test method for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)}.
    */
    @Test
    void testLastIndexOf() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addElement(new AbstractNote() {
            @Override
            public String getTitle() {
                return "title";
            }

            @Override
            public String getAbstract() {
                return "abstract";
            }

            @Override
            public String getAuthor() {
                return "author";
            }

            @Override
            public String getDate() {
                return "date";
            }

            @Override
            public String getLink() {
                return "link";
            }

            @Override
            public String getCover() {
                return "cover";
            }

            @Override
            public String getSource() {
                return "source";
            }

            @Override
            public String getTags() {
                return "tags";
            }

            @Override
            public String getCategories() {
                return "categories";
            }

            @Override
            public String getCommentsNum() {
                return "commentsNum";
            }

            @Override
            public String getViewsNum() {
                return "viewsNum";
            }

            @Override
            public String getLikesNum() {
                return "likesNum";
            }

            @Override
            public String getDislikesNum() {
                return "dislikesNum";
            }

            @Override
            public String getFavouriteNum() {
                return "favouriteNum";
            }

            @Override
            public String getReprintedNum() {
                return "reprintedNum";
            }

            @Override
            public String getWordCount() {
                return "wordCount";
            }

            @Override
            public String getReadTime() {
                return "readTime";
            }

            @Override
            public String getUpdateTime() {
                return "updateTime";
            }

            @Override
            public String getCreateTime() {
                return "createTime";
            }

            @Override
            public String getEditor() {
                return "editor";
            }

            @Override
            public String getEditorEmail() {
                return "editorEmail";
            }

            @Override
            public String getEditorLink() {
                return "editorLink";
            }

            @Override
            public String getEditorAvatar() {
                return "editorAvatar";
            }

            @Override
            public String getEditorTitle() {
                return "editorTitle";
            }

            @Override
            public String getEditorAbstract() {
                return "editorAbstract";
            }

            @Override
            public String getEditorDate() {
                return "editorDate";
            }

            @Override
            public String getEditorLinkTitle() {
                return "editorLinkTitle";
            }

            @Override
            public String getEditorLinkAbstract() {
                return "editorLinkAbstract";
            }

            @Override
            public String getEditorLinkDate() {
                return "editorLinkDate";
            }

            @Override
            public String getEditorLinkCover() {
                return "editorLinkCover";
            }

            @Override
            public String getEditorLinkAuthor() {
                return "editorLinkAuthor";
            }

            @Override
            public String getEditorLinkSource() {
                return "editorLinkSource";
            }

            @Override
            public String getEditorLinkTags() {
                return "editorLinkTags";
            }

            @Override
            public String getEditorLinkCategories() {
                return "editorLinkCategories";
            }

            @Override
            public String getEditorLinkCommentsNum() {
                return "editorLinkCommentsNum";
            }

            @Override
            public String getEditorLinkViewsNum() {
                return "editorLinkViewsNum";
            }

            @Override
            public String getEditorLinkLikesNum() {
                return "editorLinkLikesNum";
            }

            @Override
            public String getEditorLinkDislikesNum() {
                return "editorLinkDislikesNum";
            }

            @Override
            public String getEditorLinkFavouriteNum() {
                return "editorLinkFavouriteNum";
            }

            @Override
            public String getEditorLinkReprintedNum() {
                return "editorLinkReprintedNum";
            }

            @Override
            public String getEditorLinkWordCount() {
                return "editorLinkWordCount";
            }

            @Override
            public String getEditorLinkReadTime() {
                return "editorLinkReadTime";
            }

            @Override
            public String getEditorLinkUpdateTime() {
                return "editorLinkUpdateTime";
            }

            @Override
            public String getEditorLinkCreateTime() {
                return "editorLinkCreateTime";
            }

            @Override
            public String getEditorLinkEditor() {
                return "editorLinkEditor";
            }

            @Override
            public String getEditorLinkEditorEmail() {
                return "editorLinkEditorEmail";
            }

            @Override
            public String getEditorLinkEditorLink() {
                return "editorLinkEditorLink";
            }

            @Override
            public String getEditorLinkEditorAvatar() {
                return "editorLinkEditorAvatar";
            }

            @Override
            public String getEditorLinkEditorTitle() {
                return "editorLinkEditorTitle";
            }

            @Override
            public String getEditorLinkEditorAbstract() {
                return "editorLinkEditorAbstract";
            }

            @Override
            public String getEditorLinkEditorDate() {
                return "editorLinkEditorDate";
            }

            @Override
            public String getEditorLinkEditorLinkTitle() {
                return "editorLinkEditorLinkTitle";
            }

            @Override
            public String getEditorLinkEditorLinkAbstract() {
                return "editorLinkEditorLinkAbstract";
            }

            @Override
            public String getEditorLinkEditorLinkDate() {
                return "editorLinkEditorLinkDate";
            }

            @Override
            public String getEditorLinkEditorLinkCover() {
                return "editorLinkEditorLinkCover";
            }

            @Override
            public String getEditorLinkEditorLinkAuthor() {
                return "editorLinkEditorLinkAuthor";
            }

            @Override
            public String getEditorLinkEditorLinkSource() {
                return "editorLinkEditorLinkSource";
            }

            @Override
            public String getEditorLinkEditorLinkTags() {
                return "editorLinkEditorLinkTags";
            }

            @Override
            public String getEditorLinkEditorLinkCategories() {
                return "editorLinkEditorLinkCategories";
            }

            @Override
            public String getEditorLinkEditorLinkCommentsNum() {
                return "editorLinkEditorLinkCommentsNum";
            }

            @Override
            public String getEditorLinkEditorLinkViewsNum() {
                return "editorLinkEditorLinkViewsNum";
            }

            @Override
            public String getEditorLinkEditorLinkLikesNum() {
                return "editorLinkEditorLinkLikesNum";
            }

            @Override
            public String getEditorLinkEditorLinkDislikesNum() {
                return "editorLinkEditorLinkDislikesNum";
            }

            @Override
            public String getEditorLinkEditorLinkFavouriteNum() {
                return "editorLinkEditorLinkFavouriteNum";
            }

            @Override
            public String getEditorLinkEditorLinkReprintedNum() {
                return "editorLinkEditorLinkReprintedNum";
            }

            @Override
            public String getEditorLinkEditorLinkWordCount() {
                return "editorLinkEditorLinkWordCount";
            }

            @Override
            public String getEditorLinkEditorLinkReadTime() {
                return "editorLinkEditorLinkReadTime";
            }

            @Override
            public String getEditorLinkEditorLinkUpdateTime() {
                return "editorLinkEditorLinkUpdateTime";
            }

            @Override
            public String getEditorLinkEditorLinkCreateTime() {
                return "editorLinkEditorLinkCreateTime";
            }

            @Override
            public String getEditorLinkEditorLinkEditor() {
                return "editorLinkEditorLinkEditor";
            }

            @Override
            public String getEditorLinkEditorLinkEditorEmail() {
                return "editorLinkEditorLinkEditorEmail";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLink() {
                return "editorLinkEditorLinkEditorLink";
            }

            @Override
            public String getEditorLinkEditorLinkEditorAvatar() {
                return "editorLinkEditorLinkEditorAvatar";
            }

            @Override
            public String getEditorLinkEditorLinkEditorTitle() {
                return "editorLinkEditorLinkEditorTitle";
            }

            @Override
            public String getEditorLinkEditorLinkEditorAbstract() {
                return "editorLinkEditorLinkEditorAbstract";
            }

            @Override
            public String getEditorLinkEditorLinkEditorDate() {
                return "editorLinkEditorLinkEditorDate";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkTitle() {
                return "editorLinkEditorLinkEditorLinkTitle";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkAbstract() {
                return "editorLinkEditorLinkEditorLinkAbstract";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkDate() {
                return "editorLinkEditorLinkEditorLinkDate";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkCover() {
                return "editorLinkEditorLinkEditorLinkCover";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkAuthor() {
                return "editorLinkEditorLinkEditorLinkAuthor";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkSource() {
                return "editorLinkEditorLinkEditorLinkSource";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkTags() {
                return "editorLinkEditorLinkEditorLinkTags";
            }

            @Override
            public String getEditorLinkEditorLinkEditorLinkCategories() {
                return "editorLinkEditorLinkEditorLinkCategories";
            }

            @Override
           
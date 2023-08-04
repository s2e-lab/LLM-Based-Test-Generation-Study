// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}.
    */
    @Test
    void testIndexOf_01() {
        DefaultNoteListModel instance = new DefaultNoteListModel();
        AbstractNote note = new AbstractNote() {
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
            public String getEditorPassword() {
                return "<PASSWORD>";
            }

            @Override
            public String getEditorToken() {
                return "editorToken";
            }

            @Override
            public String getEditorId() {
                return "editorId";
            }

            @Override
            public String getEditorNickname() {
                return "editorNickname";
            }

            @Override
            public String getEditorAvatarLarge() {
                return "editorAvatarLarge";
            }

            @Override
            public String getEditorAvatarMedium() {
                return "editorAvatarMedium";
            }

            @Override
            public String getEditorAvatarSmall() {
                return "editorAvatarSmall";
            }

            @Override
            public String getEditorEmailMd5() {
                return "editorEmailMd5";
            }

            @Override
            public String getEditorPasswordMd5() {
                return "editorPasswordMd5";
            }

            @Override
            public String getEditorTokenMd5() {
                return "editorTokenMd5";
            }

            @Override
            public String getEditorIdMd5() {
                return "editorIdMd5";
            }

            @Override
            public String getEditorNicknameMd5() {
                return "editorNicknameMd5";
            }

            @Override
            public String getEditorAvatarLargeMd5() {
                return "editorAvatarLargeMd5";
            }

            @Override
            public String getEditorAvatarMediumMd5() {
                return "editorAvatarMediumMd5";
            }

            @Override
            public String getEditorAvatarSmallMd5() {
                return "editorAvatarSmallMd5";
            }

            @Override
            public String getEditorEmailSha1() {
                return "editorEmailSha1";
            }

            @Override
            public String getEditorPasswordSha1() {
                return "editorPasswordSha1";
            }

            @Override
            public String getEditorTokenSha1() {
                return "editorTokenSha1";
            }

            @Override
            public String getEditorIdSha1() {
                return "editorIdSha1";
            }

            @Override
            public String getEditorNicknameSha1() {
                return "editorNicknameSha1";
            }

            @Override
            public String getEditorAvatarLargeSha1() {
                return "editorAvatarLargeSha1";
            }

            @Override
            public String getEditorAvatarMediumSha1() {
                return "editorAvatarMediumSha1";
            }

            @Override
            public String getEditorAvatarSmallSha1() {
                return "editorAvatarSmallSha1";
            }

            @Override
            public String getEditorEmailSha256() {
                return "editorEmailSha256";
            }

            @Override
            public String getEditorPasswordSha256() {
                return "editorPasswordSha256";
            }

            @Override
            public String getEditorTokenSha256() {
                return "editorTokenSha256";
            }

            @Override
            public String getEditorIdSha256() {
                return "editorIdSha256";
            }

            @Override
            public String getEditorNicknameSha256() {
                return "editorNicknameSha256";
            }

            @Override
            public String getEditorAvatarLargeSha256() {
                return "editorAvatarLargeSha256";
            }

            @Override
            public String getEditorAvatarMediumSha256() {
                return "editorAvatarMediumSha256";
            }

            @Override
            public String getEditorAvatarSmallSha256() {
                return "editorAvatarSmallSha256";
            }

            @Override
            public String getEditorEmailHmacMd5() {
                return "editorEmailHmacMd5";
            }

            @Override
            public String getEditorPasswordHmacMd5() {
                return "editorPasswordHmacMd5";
            }

            @Override
            public String getEditorTokenHmacMd5() {
                return "editorTokenHmacMd5";
            }

            @Override
            public String getEditorIdHmacMd5() {
                return "editorIdHmacMd5";
            }

            @Override
            public String getEditorNicknameHmacMd5() {
                return "editorNicknameHmacMd5";
            }

            @Override
            public String getEditorAvatarLargeHmacMd5() {
                return "editorAvatarLargeHmacMd5";
            }

            @Override
            public String getEditorAvatarMediumHmacMd5() {
                return "editorAvatarMediumHmacMd5";
            }

            @Override
            public String getEditorAvatarSmallHmacMd5() {
                return "editorAvatarSmallHmacMd5";
            }

            @Override
            public String getEditorEmailHmacSha1() {
                return "editorEmailHmacSha1";
            }

            @Override
            public String getEditorPasswordHmacSha1() {
                return "editorPasswordHmacSha1";
            }

            @Override
            public String getEditorTokenHmacSha1() {
                return "editorTokenHmacSha1";
            }

            @Override
            public String getEditorIdHmacSha1() {
                return "editorIdHmacSha1";
            }

            @Override
            public String getEditorNicknameHmacSha1() {
                return "editorNicknameHmacSha1";
            }

            @Override
            public String getEditorAvatarLargeHmacSha1() {
                return "editorAvatarLargeHmacSha1";
            }

            @Override
            public String getEditorAvatarMediumHmacSha1() {
                return "editorAvatarMediumHmacSha1";
            }

            @Override
            public String getEditorAvatarSmallHmacSha1() {
                return "editorAvatarSmallHmacSha1";
            }

            @Override
            public String getEditorEmailHmacSha256() {
                return "editorEmailHmacSha256";
            }

            @Override
            public String getEditorPasswordHmacSha256() {
                return "editorPasswordHmacSha256";
            }

            @Override
            public String getEditorTokenHmacSha256() {
                return "editorTokenHmacSha256";
            }

            @Override
            public String getEditorIdHmacSha256() {
                return "editorIdHmacSha256";
            }

            @Override
            public String getEditorNicknameHmacSha256() {
                return "editorNicknameHmacSha256";
            }

            @Override
            public String getEditorAvatarLargeHmacSha256() {
                return "editorAvatarLargeHmacSha256";
            }

            @Override
            public String getEditorAvatarMediumHmacSha256() {
                return "editorAvatarMediumHmacSha256";
            }

            @Override
            public String getEditorAvatarSmallHmacSha256() {
                return "editorAvatarSmallHmacSha256";
            }

            @Override
            public String getEditorEmailHmacSha512() {
                return "editorEmailHmacSha512";
            }

            @Override
            public String getEditorPasswordHmacSha512() {
                return "editorPasswordHmacSha512";
            }

            @Override
            public
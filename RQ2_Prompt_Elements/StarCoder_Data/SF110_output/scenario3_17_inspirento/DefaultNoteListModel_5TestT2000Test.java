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
    void testIndexOf() {
        DefaultNoteListModel defaultNoteListModel = new DefaultNoteListModel();
        AbstractNote abstractNote = new AbstractNote() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public String getAbstract() {
                return null;
            }

            @Override
            public String getAuthor() {
                return null;
            }

            @Override
            public String getDate() {
                return null;
            }

            @Override
            public String getLink() {
                return null;
            }

            @Override
            public String getCover() {
                return null;
            }

            @Override
            public String getTags() {
                return null;
            }

            @Override
            public String getCategories() {
                return null;
            }

            @Override
            public String getComments() {
                return null;
            }

            @Override
            public String getViews() {
                return null;
            }

            @Override
            public String getLikes() {
                return null;
            }

            @Override
            public String getDislikes() {
                return null;
            }

            @Override
            public String getWordCount() {
                return null;
            }

            @Override
            public String getReadTime() {
                return null;
            }

            @Override
            public String getUpdateTime() {
                return null;
            }

            @Override
            public String getCreateTime() {
                return null;
            }

            @Override
            public String getSiteName() {
                return null;
            }

            @Override
            public String getSiteLink() {
                return null;
            }

            @Override
            public String getSiteDescription() {
                return null;
            }

            @Override
            public String getSiteCover() {
                return null;
            }

            @Override
            public String getSiteFavicon() {
                return null;
            }

            @Override
            public String getSiteLogo() {
                return null;
            }

            @Override
            public String getSiteLanguage() {
                return null;
            }

            @Override
            public String getSiteCountry() {
                return null;
            }

            @Override
            public String getSiteKeywords() {
                return null;
            }

            @Override
            public String getSiteThemeColor() {
                return null;
            }

            @Override
            public String getSiteThemeColorLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorAccent() {
                return null;
            }

            @Override
            public String getSiteThemeColorAccentLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorAccentDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorWarn() {
                return null;
            }

            @Override
            public String getSiteThemeColorWarnLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorWarnDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorBackground() {
                return null;
            }

            @Override
            public String getSiteThemeColorBackgroundLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorBackgroundDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorText() {
                return null;
            }

            @Override
            public String getSiteThemeColorTextLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorTextDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLink() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisited() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkHover() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkHoverLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkHoverDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkActive() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkActiveLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkActiveDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocus() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusVisited() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusVisitedLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusVisitedDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusHover() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusHoverLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusHoverDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusActive() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusActiveLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusActiveDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusDisabledLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkFocusDisabledDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkDisabledLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkDisabledDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocus() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHover() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHoverLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHoverDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActive() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActiveLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActiveDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusHover() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusHoverLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusHoverDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusActive() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusActiveLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusActiveDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusDisabledLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusDisabledDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHoverDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHoverDisabledLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedHoverDisabledDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActiveDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActiveDisabledLight() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedActiveDisabledDark() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusHoverDisabled() {
                return null;
            }

            @Override
            public String getSiteThemeColorLinkVisitedFocusHoverDisabledLight() {
                return
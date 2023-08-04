// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {

    private DefaultNoteListModel delegate;
    private List<AbstractNote> noteList;
    private AbstractNote note1;
    private AbstractNote note2;
    private AbstractNote note3;
    private AbstractNote note4;
    private AbstractNote note5;
    private AbstractNote note6;
    private AbstractNote note7;
    private AbstractNote note8;
    private AbstractNote note9;
    private AbstractNote note10;

    /**
    * Test method for {@link DefaultNoteListModel#elementAt(int)}.
    */
    @Test
    void testElementAt() {
        delegate = new DefaultNoteListModel();
        noteList = new ArrayList<AbstractNote>();
        note1 = new AbstractNote() {
            public String getTitle() {
                return "title1";
            }
            public String getSummary() {
                return "summary1";
            }
            public String getAuthor() {
                return "author1";
            }
            public String getDate() {
                return "date1";
            }
            public String getLink() {
                return "link1";
            }
            public String getCover() {
                return "cover1";
            }
            public String getCoverAlt() {
                return "coverAlt1";
            }
            public String getCoverTitle() {
                return "coverTitle1";
            }
            public String getCoverLink() {
                return "coverLink1";
            }
            public String getCoverTarget() {
                return "coverTarget1";
            }
            public String getCoverRel() {
                return "coverRel1";
            }
            public String getCoverType() {
                return "coverType1";
            }
            public String getCoverData() {
                return "coverData1";
            }
            public String getCoverWidth() {
                return "coverWidth1";
            }
            public String getCoverHeight() {
                return "coverHeight1";
            }
            public String getCoverClass() {
                return "coverClass1";
            }
            public String getCoverStyle() {
                return "coverStyle1";
            }
            public String getCoverId() {
                return "coverId1";
            }
            public String getCoverLang() {
                return "coverLang1";
            }
            public String getCoverDir() {
                return "coverDir1";
            }
            public String getCoverRole() {
                return "coverRole1";
            }
            public String getCoverLabel() {
                return "coverLabel1";
            }
            public String getCoverContent() {
                return "coverContent1";
            }
            public String getCoverAriaHidden() {
                return "coverAriaHidden1";
            }
            public String getCoverAriaLabel() {
                return "coverAriaLabel1";
            }
            public String getCoverAriaRole() {
                return "coverAriaRole1";
            }
            public String getCoverAriaLevel() {
                return "coverAriaLevel1";
            }
            public String getCoverAriaValueText() {
                return "coverAriaValueText1";
            }
            public String getCoverTabIndex() {
                return "coverTabIndex1";
            }
            public String getCoverAccessKey() {
                return "coverAccessKey1";
            }
            public String getCoverDraggable() {
                return "coverDraggable1";
            }
            public String getCoverDropzone() {
                return "coverDropzone1";
            }
            public String getCoverHidden() {
                return "coverHidden1";
            }
            public String getCoverReadonly() {
                return "coverReadonly1";
            }
            public String getCoverDisabled() {
                return "coverDisabled1";
            }
            public String getCoverChecked() {
                return "coverChecked1";
            }
            public String getCoverSelected() {
                return "coverSelected1";
            }
            public String getCoverAriaCurrent() {
                return "coverAriaCurrent1";
            }
            public String getCoverAriaCurrentValue() {
                return "coverAriaCurrentValue1";
            }
            public String getCoverAriaInvalid() {
                return "coverAriaInvalid1";
            }
            public String getCoverAriaDescribedBy() {
                return "coverAriaDescribedBy1";
            }
            public String getCoverAriaFlowTo() {
                return "coverAriaFlowTo1";
            }
            public String getCoverAriaControls() {
                return "coverAriaControls1";
            }
            public String getCoverAriaDescribedByText() {
                return "coverAriaDescribedByText1";
            }
            public String getCoverAriaFlowToText() {
                return "coverAriaFlowToText1";
            }
            public String getCoverAriaControlsText() {
                return "coverAriaControlsText1";
            }
            public String getCoverAriaLabelledBy() {
                return "coverAriaLabelledBy1";
            }
            public String getCoverAriaLabelledByText() {
                return "coverAriaLabelledByText1";
            }
            public String getCoverAriaLabelText() {
                return "coverAriaLabelText1";
            }
            public String getCoverAriaLabeledBy() {
                return "coverAriaLabeledBy1";
            }
            public String getCoverAriaLabeledByText() {
                return "coverAriaLabeledByText1";
            }
            public String getCoverAriaLive() {
                return "coverAriaLive1";
            }
            public String getCoverAriaRelevant() {
                return "coverAriaRelevant1";
            }
            public String getCoverAriaAtomic() {
                return "coverAriaAtomic1";
            }
            public String getCoverAriaBusy() {
                return "coverAriaBusy1";
            }
            public String getCoverAriaActiveDescendant() {
                return "coverAriaActiveDescendant1";
            }
            public String getCoverAriaOwns() {
                return "coverAriaOwns1";
            }
            public String getCoverAriaRelevantAdditions() {
                return "coverAriaRelevantAdditions1";
            }
            public String getCoverAriaRelevantRemovals() {
                return "coverAriaRelevantRemovals1";
            }
            public String getCoverAriaActiveDescendantText() {
                return "coverAriaActiveDescendantText1";
            }
            public String getCoverAriaOwnsText() {
                return "coverAriaOwnsText1";
            }
            public String getCoverAriaColCount() {
                return "coverAriaColCount1";
            }
            public String getCoverAriaColIndex() {
                return "coverAriaColIndex1";
            }
            public String getCoverAriaColSpan() {
                return "coverAriaColSpan1";
            }
            public String getCoverAriaRowCount() {
                return "coverAriaRowCount1";
            }
            public String getCoverAriaRowIndex() {
                return "coverAriaRowIndex1";
            }
            public String getCoverAriaRowSpan() {
                return "coverAriaRowSpan1";
            }
            public String getCoverAriaSetSize() {
                return "coverAriaSetSize1";
            }
            public String getCoverAriaPosInSet() {
                return "coverAriaPosInSet1";
            }
            public String getCoverAriaChecked() {
                return "coverAriaChecked1";
            }
            public String getCoverAriaPressed() {
                return "coverAriaPressed1";
            }
            public String getCoverAriaSelected() {
                return "coverAriaSelected1";
            }
            public String getCoverAriaSort() {
                return "coverAriaSort1";
            }
            public String getCoverAriaValueMax() {
                return "coverAriaValueMax1";
            }
            public String getCoverAriaValueMin() {
                return "coverAriaValueMin1";
            }
            public String getCoverAriaValueNow() {
                return "coverAriaValueNow1";
            }
            public String getCoverAriaValueText() {
                return "coverAriaValueText1";
            }
            public String getCoverAriaHasPopup() {
                return "coverAriaHasPopup1";
            }
            public String getCoverAriaExpanded() {
                return "coverAriaExpanded1";
            }
            public String getCoverAriaHiddenText() {
                return "coverAriaHiddenText1";
            }
            public String getCoverAriaInvalidText() {
                return "coverAriaInvalidText1";
            }
            public String getCoverAriaMultiline() {
                return "coverAriaMultiline1";
            }
            public String getCoverAriaMultiselectable() {
                return "coverAriaMultiselectable1";
            }
            public String getCoverAriaReadonly() {
                return "coverAriaReadonly1";
            }
            public String getCoverAriaRequired() {
                return "coverAriaRequired1";
            }
            public String getCoverAriaSecret() {
                return "coverAriaSecret1";
            }
            public String getCoverAriaReadonlyText() {
                return "coverAriaReadonlyText1";
            }
            public String getCoverAriaRequiredText() {
                return "coverAriaRequiredText1";
            }
            public String getCoverAriaSecretText() {
                return "coverAriaSecretText1";
            }
            public String getCoverAriaExpandedText() {
                return "coverA
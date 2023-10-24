// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {

    private DefaultNoteListModel defaultNoteListModel;
    private Vector<AbstractNote> delegate;
    private Vector<NoteListDataListener> listeners;

    /**
    * Test method for {@link DefaultNoteListModel#remove(int)}.
    */
    @Test
    void testRemove() {
        defaultNoteListModel = new DefaultNoteListModel();
        delegate = new Vector<AbstractNote>();
        listeners = new Vector<NoteListDataListener>();
        defaultNoteListModel.setDelegate(delegate);
        defaultNoteListModel.setListeners(listeners);
        AbstractNote an = new AbstractNote() {
            public String getTitle() {
                return "title";
            }
            public String getContent() {
                return "content";
            }
            public String getAuthor() {
                return "author";
            }
            public String getDate() {
                return "date";
            }
            public String getTags() {
                return "tags";
            }
            public String getLink() {
                return "link";
            }
            public String getCover() {
                return "cover";
            }
            public String getSummary() {
                return "summary";
            }
            public String getCategories() {
                return "categories";
            }
            public String getCommentsNum() {
                return "commentsNum";
            }
            public String getViewsNum() {
                return "viewsNum";
            }
            public String getLikesNum() {
                return "likesNum";
            }
            public String getDislikesNum() {
                return "dislikesNum";
            }
            public String getFavouriteNum() {
                return "favouriteNum";
            }
            public String getReprintedNum() {
                return "reprintedNum";
            }
            public String getWordCount() {
                return "wordCount";
            }
            public String getReadTime() {
                return "readTime";
            }
            public String getLocation() {
                return "location";
            }
            public String getFormat() {
                return "format";
            }
            public String getLanguage() {
                return "language";
            }
            public String getLicense() {
                return "license";
            }
            public String getCopyright() {
                return "copyright";
            }
            public String getOriginal() {
                return "original";
            }
            public String getTranslator() {
                return "translator";
            }
            public String getEditor() {
                return "editor";
            }
            public String getPublisher() {
                return "publisher";
            }
            public String getPublicationDate() {
                return "publicationDate";
            }
            public String getModificationDate() {
                return "modificationDate";
            }
            public String getApplication() {
                return "application";
            }
            public String getApplicationVersion() {
                return "applicationVersion";
            }
            public String getOS() {
                return "os";
            }
            public String getOSVersion() {
                return "osVersion";
            }
            public String getDevice() {
                return "device";
            }
            public String getDeviceVendor() {
                return "deviceVendor";
            }
            public String getDeviceModel() {
                return "deviceModel";
            }
            public String getDeviceResolution() {
                return "deviceResolution";
            }
            public String getDeviceDPI() {
                return "deviceDPI";
            }
            public String getDeviceMemory() {
                return "deviceMemory";
            }
            public String getDeviceCPU() {
                return "deviceCPU";
            }
            public String getDeviceGPU() {
                return "deviceGPU";
            }
            public String getDeviceScreenSize() {
                return "deviceScreenSize";
            }
            public String getDeviceScreenResolution() {
                return "deviceScreenResolution";
            }
            public String getDeviceScreenDPI() {
                return "deviceScreenDPI";
            }
            public String getDeviceScreenScaling() {
                return "deviceScreenScaling";
            }
            public String getDeviceScreenRefreshRate() {
                return "deviceScreenRefreshRate";
            }
            public String getDeviceScreenVolume() {
                return "deviceScreenVolume";
            }
            public String getDeviceScreenBrightness() {
                return "deviceScreenBrightness";
            }
            public String getDeviceScreenOrientation() {
                return "deviceScreenOrientation";
            }
            public String getDeviceScreenMobile() {
                return "deviceScreenMobile";
            }
            public String getDeviceScreenTablet() {
                return "deviceScreenTablet";
            }
            public String getDeviceScreenDesktop() {
                return "deviceScreenDesktop";
            }
            public String getDeviceScreenWeb() {
                return "deviceScreenWeb";
            }
            public String getDeviceScreenApp() {
                return "deviceScreenApp";
            }
            public String getDeviceScreenEbook() {
                return "deviceScreenEbook";
            }
            public String getDeviceScreenTv() {
                return "deviceScreenTv";
            }
            public String getDeviceScreenCar() {
                return "deviceScreenCar";
            }
            public String getDeviceScreenWatch() {
                return "deviceScreenWatch";
            }
            public String getDeviceScreenConsole() {
                return "deviceScreenConsole";
            }
            public String getDeviceScreenPortable() {
                return "deviceScreenPortable";
            }
            public String getDeviceScreenRobot() {
                return "deviceScreenRobot";
            }
            public String getDeviceScreenGame() {
                return "deviceScreenGame";
            }
            public String getDeviceScreenBrowser() {
                return "deviceScreenBrowser";
            }
            public String getDeviceScreenPDA() {
                return "deviceScreenPDA";
            }
            public String getDeviceScreenMobileV() {
                return "deviceScreenMobileV";
            }
            public String getDeviceScreenTabletV() {
                return "deviceScreenTabletV";
            }
            public String getDeviceScreenDesktopV() {
                return "deviceScreenDesktopV";
            }
            public String getDeviceScreenWebV() {
                return "deviceScreenWebV";
            }
            public String getDeviceScreenAppV() {
                return "deviceScreenAppV";
            }
            public String getDeviceScreenEbookV() {
                return "deviceScreenEbookV";
            }
            public String getDeviceScreenTvV() {
                return "deviceScreenTvV";
            }
            public String getDeviceScreenCarV() {
                return "deviceScreenCarV";
            }
            public String getDeviceScreenWatchV() {
                return "deviceScreenWatchV";
            }
            public String getDeviceScreenConsoleV() {
                return "deviceScreenConsoleV";
            }
            public String getDeviceScreenPortableV() {
                return "deviceScreenPortableV";
            }
            public String getDeviceScreenRobotV() {
                return "deviceScreenRobotV";
            }
            public String getDeviceScreenGameV() {
                return "deviceScreenGameV";
            }
            public String getDeviceScreenBrowserV() {
                return "deviceScreenBrowserV";
            }
            public String getDeviceScreenPDAV() {
                return "deviceScreenPDAV";
            }
            public String getDeviceScreenMobileM() {
                return "deviceScreenMobileM";
            }
            public String getDeviceScreenTabletM() {
                return "deviceScreenTabletM";
            }
            public String getDeviceScreenDesktopM() {
                return "deviceScreenDesktopM";
            }
            public String getDeviceScreenWebM() {
                return "deviceScreenWebM";
            }
            public String getDeviceScreenAppM() {
                return "deviceScreenAppM";
            }
            public String getDeviceScreenEbookM() {
                return "deviceScreenEbookM";
            }
            public String getDeviceScreenTvM() {
                return "deviceScreenTvM";
            }
            public String getDeviceScreenCarM() {
                return "deviceScreenCarM";
            }
            public String getDeviceScreenWatchM() {
                return "deviceScreenWatchM";
            }
            public String getDeviceScreenConsoleM() {
                return "deviceScreenConsoleM";
            }
            public String getDeviceScreenPortableM() {
                return "deviceScreenPortableM";
            }
            public String getDeviceScreenRobotM() {
                return "deviceScreenRobotM";
            }
            public String getDeviceScreenGameM() {
                return "deviceScreenGameM";
            }
            public String getDeviceScreenBrowserM() {
                return "deviceScreenBrowserM";
            }
            public String getDeviceScreenPDAM() {
                return "deviceScreenPDAM";
            }
            public String getDeviceScreenMobileL() {
                return "deviceScreenMobileL";
            }
            public String getDeviceScreenTabletL() {
                return "deviceScreenTabletL";
            }
            public String getDeviceScreenDesktopL() {
                return "deviceScreenDesktopL";
            }
            public String getDeviceScreenWebL() {
                return "deviceScreenWebL";
            }
            public String getDeviceScreenAppL() {
                return "deviceScreenAppL";
            }
            public String getDeviceScreenEbookL() {
                return "deviceScreenEbookL";
            }
            public String getDeviceScreenTvL() {
                return "deviceScreenTvL";
            }
            public String getDeviceScreenCarL() {
                return "deviceScreenCarL";
            }
            public String getDeviceScreenWatchL() {
                return "deviceScreenWatchL";
            }
            public String getDeviceScreenConsoleL() {
                return "deviceScreenConsoleL";
            }
            public String getDeviceScreenPortableL() {
                return "deviceScreenPortableL";
            }
            public String getDeviceScreenRobotL() {
                return "deviceScreenRobotL";
            }
            public String getDeviceScreenGame
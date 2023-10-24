// CategoryMembersFull_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains ten unit test cases for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFull_0Test {

    private static final String CATEGORY_NAME = "Category:Test";
    private static final int[] NAMESPACES = { 0 };
    private static final int[] NAMESPACES_EMPTY = {};
    private static final int[] NAMESPACES_1 = { 1 };
    private static final int[] NAMESPACES_2 = { 2 };
    private static final int[] NAMESPACES_3 = { 3 };
    private static final int[] NAMESPACES_4 = { 4 };
    private static final int[] NAMESPACES_5 = { 5 };
    private static final int[] NAMESPACES_6 = { 6 };
    private static final int[] NAMESPACES_7 = { 7 };
    private static final int[] NAMESPACES_8 = { 8 };
    private static final int[] NAMESPACES_9 = { 9 };
    private static final int[] NAMESPACES_10 = { 10 };
    private static final int[] NAMESPACES_11 = { 11 };
    private static final int[] NAMESPACES_12 = { 12 };
    private static final int[] NAMESPACES_13 = { 13 };
    private static final int[] NAMESPACES_14 = { 14 };
    private static final int[] NAMESPACES_15 = { 15 };
    private static final int[] NAMESPACES_16 = { 16 };
    private static final int[] NAMESPACES_17 = { 17 };
    private static final int[] NAMESPACES_18 = { 18 };
    private static final int[] NAMESPACES_19 = { 19 };
    private static final int[] NAMESPACES_20 = { 20 };
    private static final int[] NAMESPACES_21 = { 21 };
    private static final int[] NAMESPACES_22 = { 22 };
    private static final int[] NAMESPACES_23 = { 23 };
    private static final int[] NAMESPACES_24 = { 24 };
    private static final int[] NAMESPACES_25 = { 25 };
    private static final int[] NAMESPACES_26 = { 26 };
    private static final int[] NAMESPACES_27 = { 27 };
    private static final int[] NAMESPACES_28 = { 28 };
    private static final int[] NAMESPACES_29 = { 29 };
    private static final int[] NAMESPACES_30 = { 30 };
    private static final int[] NAMESPACES_31 = { 31 };
    private static final int[] NAMESPACES_32 = { 32 };
    private static final int[] NAMESPACES_33 = { 33 };
    private static final int[] NAMESPACES_34 = { 34 };
    private static final int[] NAMESPACES_35 = { 35 };
    private static final int[] NAMESPACES_36 = { 36 };
    private static final int[] NAMESPACES_37 = { 37 };
    private static final int[] NAMESPACES_38 = { 38 };
    private static final int[] NAMESPACES_39 = { 39 };
    private static final int[] NAMESPACES_40 = { 40 };
    private static final int[] NAMESPACES_41 = { 41 };
    private static final int[] NAMESPACES_42 = { 42 };
    private static final int[] NAMESPACES_43 = { 43 };
    private static final int[] NAMESPACES_44 = { 44 };
    private static final int[] NAMESPACES_45 = { 45 };
    private static final int[] NAMESPACES_46 = { 46 };
    private static final int[] NAMESPACES_47 = { 47 };
    private static final int[] NAMESPACES_48 = { 48 };
    private static final int[] NAMESPACES_49 = { 49 };
    private static final int[] NAMESPACES_50 = { 50 };
    private static final int[] NAMESPACES_51 = { 51 };
    private static final int[] NAMESPACES_52 = { 52 };
    private static final int[] NAMESPACES_53 = { 53 };
    private static final int[] NAMESPACES_54 = { 54 };
    private static final int[] NAMESPACES_55 = { 55 };
    private static final int[] NAMESPACES_56 = { 56 };
    private static final int[] NAMESPACES_57 = { 57 };
    private static final int[] NAMESPACES_58 = { 58 };
    private static final int[] NAMESPACES_59 = { 59 };
    private static final int[] NAMESPACES_60 = { 60 };
    private static final int[] NAMESPACES_61 = { 61 };
    private static final int[] NAMESPACES_62 = { 62 };
    private static final int[] NAMESPACES_63 = { 63 };
    private static final int[] NAMESPACES_64 = { 64 };
    private static final int[] NAMESPACES_65 = { 65 };
    private static final int[] NAMESPACES_66 = { 66 };
    private static final int[] NAMESPACES_67 = { 67 };
    private static final int[] NAMESPACES_68 = { 68 };
    private static final int[] NAMESPACES_69 = { 69 };
    private static final int[] NAMESPACES_70 = { 70 };
    private static final int[] NAMESPACES_71 = { 71 };
    private static final int[] NAMESPACES_72 = { 72 };
    private static final int[] NAMESPACES_73 = { 73 };
    private static final int[] NAMESPACES_74 = { 74 };
    private static final int[] NAMESPACES_75 = { 75 };
    private static final int[] NAMESPACES_76 = { 76 };
    private static final int[] NAMESPACES_77 = { 77 };
    private static final int[] NAMESPACES_78 = { 78 };
    private static final int[] NAMESPACES_79 = { 79 };
    private static final int[] NAMESPACES_80 = { 80 };
    private static final int[] NAMESPACES_81 = { 81 };
    private static final int[] NAMESPACES_82 = { 82 };
    private static final int[] NAMESPACES_83 = { 83 };
    private static final int[] NAMESPACES_84 = { 84 };
    private static final int[] NAMESPACES_85 = { 85 };
    private static final int[] NAMESPACES_86 = { 86 };
    private static final int[] NAMESPACES_87 = { 87 };
    private static final int[] NAMESPACES_88 = { 88 };
    private static final int[] NAMESPACES_89 = { 89 };
    private static final int[] NAMESPACES_90 = { 90 };
    private static final int[] NAMESPACES_91 = { 91 };
    private static final int[] NAMESPACES_92 = { 92 };
    private static final int[] NAMESPACES_93 = { 93 };
    private static final int[] NAMESPACES_94 = { 94 };
    private static final int[] NAMESPACES_95 = { 95 };
    private static final int[] NAMESPACES_96 = { 96 };
    private static final int[] NAMESPACES_97 = { 97 };
    private static final int[] NAMESPACES_98 = { 98 };
    private static final int[] NAMESPACES_99 = { 99 };
    private static final int[] NAMESPACES_100 = { 100 };
    private static final int[] NAMESPACES_101 = { 101 };
    private static final int[] NAMESPACES_102 = { 102 };
    private static final int[] NAMESPACES_103 = { 103 };
    private static final int[] NAMESPACES_104 = { 104 };
    private static final int[] NAMESPACES_105 = { 105 };
    private static final int[] NAMESPACES_106 = { 106 };
    private static final int[] NAMESPACES_107 = { 107 };
    private static final int[] NAMESPACES_108 = { 108 };
    private static final int[] NAMESPACES_109
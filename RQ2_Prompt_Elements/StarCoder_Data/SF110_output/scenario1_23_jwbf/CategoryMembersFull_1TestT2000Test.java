// CategoryMembersFull_1Test.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {

    private static final String CATEGORY_NAME = "Category:Test";
    private static final String CATEGORY_NAME_2 = "Category:Test2";
    private static final String CATEGORY_NAME_3 = "Category:Test3";
    private static final String CATEGORY_NAME_4 = "Category:Test4";
    private static final String CATEGORY_NAME_5 = "Category:Test5";
    private static final String CATEGORY_NAME_6 = "Category:Test6";
    private static final String CATEGORY_NAME_7 = "Category:Test7";
    private static final String CATEGORY_NAME_8 = "Category:Test8";
    private static final String CATEGORY_NAME_9 = "Category:Test9";
    private static final String CATEGORY_NAME_10 = "Category:Test10";
    private static final String CATEGORY_NAME_11 = "Category:Test11";
    private static final String CATEGORY_NAME_12 = "Category:Test12";
    private static final String CATEGORY_NAME_13 = "Category:Test13";
    private static final String CATEGORY_NAME_14 = "Category:Test14";
    private static final String CATEGORY_NAME_15 = "Category:Test15";
    private static final String CATEGORY_NAME_16 = "Category:Test16";
    private static final String CATEGORY_NAME_17 = "Category:Test17";
    private static final String CATEGORY_NAME_18 = "Category:Test18";
    private static final String CATEGORY_NAME_19 = "Category:Test19";
    private static final String CATEGORY_NAME_20 = "Category:Test20";
    private static final String CATEGORY_NAME_21 = "Category:Test21";
    private static final String CATEGORY_NAME_22 = "Category:Test22";
    private static final String CATEGORY_NAME_23 = "Category:Test23";
    private static final String CATEGORY_NAME_24 = "Category:Test24";
    private static final String CATEGORY_NAME_25 = "Category:Test25";
    private static final String CATEGORY_NAME_26 = "Category:Test26";
    private static final String CATEGORY_NAME_27 = "Category:Test27";
    private static final String CATEGORY_NAME_28 = "Category:Test28";
    private static final String CATEGORY_NAME_29 = "Category:Test29";
    private static final String CATEGORY_NAME_30 = "Category:Test30";
    private static final String CATEGORY_NAME_31 = "Category:Test31";
    private static final String CATEGORY_NAME_32 = "Category:Test32";
    private static final String CATEGORY_NAME_33 = "Category:Test33";
    private static final String CATEGORY_NAME_34 = "Category:Test34";
    private static final String CATEGORY_NAME_35 = "Category:Test35";
    private static final String CATEGORY_NAME_36 = "Category:Test36";
    private static final String CATEGORY_NAME_37 = "Category:Test37";
    private static final String CATEGORY_NAME_38 = "Category:Test38";
    private static final String CATEGORY_NAME_39 = "Category:Test39";
    private static final String CATEGORY_NAME_40 = "Category:Test40";
    private static final String CATEGORY_NAME_41 = "Category:Test41";
    private static final String CATEGORY_NAME_42 = "Category:Test42";
    private static final String CATEGORY_NAME_43 = "Category:Test43";
    private static final String CATEGORY_NAME_44 = "Category:Test44";
    private static final String CATEGORY_NAME_45 = "Category:Test45";
    private static final String CATEGORY_NAME_46 = "Category:Test46";
    private static final String CATEGORY_NAME_47 = "Category:Test47";
    private static final String CATEGORY_NAME_48 = "Category:Test48";
    private static final String CATEGORY_NAME_49 = "Category:Test49";
    private static final String CATEGORY_NAME_50 = "Category:Test50";
    private static final String CATEGORY_NAME_51 = "Category:Test51";
    private static final String CATEGORY_NAME_52 = "Category:Test52";
    private static final String CATEGORY_NAME_53 = "Category:Test53";
    private static final String CATEGORY_NAME_54 = "Category:Test54";
    private static final String CATEGORY_NAME_55 = "Category:Test55";
    private static final String CATEGORY_NAME_56 = "Category:Test56";
    private static final String CATEGORY_NAME_57 = "Category:Test57";
    private static final String CATEGORY_NAME_58 = "Category:Test58";
    private static final String CATEGORY_NAME_59 = "Category:Test59";
    private static final String CATEGORY_NAME_60 = "Category:Test60";
    private static final String CATEGORY_NAME_61 = "Category:Test61";
    private static final String CATEGORY_NAME_62 = "Category:Test62";
    private static final String CATEGORY_NAME_63 = "Category:Test63";
    private static final String CATEGORY_NAME_64 = "Category:Test64";
    private static final String CATEGORY_NAME_65 = "Category:Test65";
    private static final String CATEGORY_NAME_66 = "Category:Test66";
    private static final String CATEGORY_NAME_67 = "Category:Test67";
    private static final String CATEGORY_NAME_68 = "Category:Test68";
    private static final String CATEGORY_NAME_69 = "Category:Test69";
    private static final String CATEGORY_NAME_70 = "Category:Test70";
    private static final String CATEGORY_NAME_71 = "Category:Test71";
    private static final String CATEGORY_NAME_72 = "Category:Test72";
    private static final String CATEGORY_NAME_73 = "Category:Test73";
    private static final String CATEGORY_NAME_74 = "Category:Test74";
    private static final String CATEGORY_NAME_75 = "Category:Test75";
    private static final String CATEGORY_NAME_76 = "Category:Test76";
    private static final String CATEGORY_NAME_77 = "Category:Test77";
    private static final String CATEGORY_NAME_78 = "Category:Test78";
    private static final String CATEGORY_NAME_79 = "Category:Test79";
    private static final String CATEGORY_NAME_80 = "Category:Test80";
    private static final String CATEGORY_NAME_81 = "Category:Test81";
    private static final String CATEGORY_NAME_82 = "Category:Test82";
    private static final String CATEGORY_NAME_83 = "Category:Test83";
    private static final String CATEGORY_NAME_84 = "Category:Test84";
    private static final String CATEGORY_NAME_85 = "Category:Test85";
    private static final String CATEGORY_NAME_86 = "Category:Test86";
    private static final String CATEGORY_NAME_87 = "Category:Test87";
    private static final String CATEGORY_NAME_88 = "Category:Test88";
    private static final String CATEGORY_NAME_89 = "Category:Test89";
    private static final String CATEGORY_NAME_90 = "Category:Test90";
    private static final String CATEGORY_NAME_91 = "Category:Test91";
    private static final String CATEGORY_NAME_92 = "Category:Test92";
    private static final String CATEGORY_NAME_93 = "Category:Test93";
    private static final String CATEGORY_NAME_94 = "Category:Test94";
    private static final String CATEGORY_NAME_95 = "Category:Test95";
    private static final String CATEGORY_NAME_96 = "Category:Test96";
    private static final String
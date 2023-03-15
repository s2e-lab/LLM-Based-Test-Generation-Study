// PostModifyContent_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains ten unit test cases for the {@link PostModifyContent#processReturningText(String, HttpAction)} method.
*/
class PostModifyContent_1Test {

		private static final String TEST_TEXT = "test text";
		private static final String TEST_TITLE = "test title";
		private static final String TEST_EDIT_SUMMARY = "test edit summary";
		private static final String TEST_EDIT_TOKEN = "test edit token";
		private static final String TEST_EDIT_TIME = "test edit time";
		private static final String TEST_START_TIME = "test start time";
		private static final String TEST_ERROR_MESSAGE = "test error message";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED = "test error message truncated";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_700 = "test error message truncated 700";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_701 = "test error message truncated 701";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_702 = "test error message truncated 702";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_703 = "test error message truncated 703";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_704 = "test error message truncated 704";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_705 = "test error message truncated 705";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_706 = "test error message truncated 706";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_707 = "test error message truncated 707";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_708 = "test error message truncated 708";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_709 = "test error message truncated 709";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_710 = "test error message truncated 710";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_711 = "test error message truncated 711";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_712 = "test error message truncated 712";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_713 = "test error message truncated 713";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_714 = "test error message truncated 714";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_715 = "test error message truncated 715";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_716 = "test error message truncated 716";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_717 = "test error message truncated 717";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_718 = "test error message truncated 718";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_719 = "test error message truncated 719";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_720 = "test error message truncated 720";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_721 = "test error message truncated 721";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_722 = "test error message truncated 722";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_723 = "test error message truncated 723";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_724 = "test error message truncated 724";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_725 = "test error message truncated 725";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_726 = "test error message truncated 726";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_727 = "test error message truncated 727";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_728 = "test error message truncated 728";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_729 = "test error message truncated 729";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_730 = "test error message truncated 730";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_731 = "test error message truncated 731";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_732 = "test error message truncated 732";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_733 = "test error message truncated 733";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_734 = "test error message truncated 734";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_735 = "test error message truncated 735";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_736 = "test error message truncated 736";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_737 = "test error message truncated 737";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_738 = "test error message truncated 738";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_739 = "test error message truncated 739";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_740 = "test error message truncated 740";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_741 = "test error message truncated 741";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_742 = "test error message truncated 742";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_743 = "test error message truncated 743";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_744 = "test error message truncated 744";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_745 = "test error message truncated 745";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_746 = "test error message truncated 746";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_747 = "test error message truncated 747";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_748 = "test error message truncated 748";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_749 = "test error message truncated 749";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_750 = "test error message truncated 750";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_751 = "test error message truncated 751";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_752 = "test error message truncated 752";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_753 = "test error message truncated 753";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_754 = "test error message truncated 754";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_755 = "test error message truncated 755";
		private static final String TEST_ERROR_MESSAGE_TRUNCATED_756 = "test error message truncated 756";
		
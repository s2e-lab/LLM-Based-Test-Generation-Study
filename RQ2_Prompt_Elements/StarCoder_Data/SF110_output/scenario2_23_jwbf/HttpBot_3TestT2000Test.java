// HttpBot_3Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {

    private static final String URL = "http://www.google.de";
    private static final String URL_2 = "http://www.google.de/index.php?title=Main_Page";
    private static final String URL_3 = "http://www.google.de/index.php?title=Main_Page&action=edit";
    private static final String URL_4 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new";
    private static final String URL_5 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new";
    private static final String URL_6 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new";
    private static final String URL_7 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new";
    private static final String URL_8 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new";
    private static final String URL_9 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new";
    private static final String URL_10 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new";
    private static final String URL_11 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new";
    private static final String URL_12 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new";
    private static final String URL_13 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new";
    private static final String URL_14 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new";
    private static final String URL_15 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_16 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_17 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_18 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_19 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_20 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_21 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubsubparagraph=new&subsubsubsubsubsubsubsubsubsubsubsubsubsubparagraph=new";
    private static final String URL_22 = "http://www.google.de/index.php?title=Main_Page&action=edit&section=new&subsection=new&subsubsection=new&paragraph=new&subparagraph=new&subsubparagraph=new&subsubsubparagraph=new&subsubsubsubparagraph=new&subsubsubsubsubparagraph=new&subsubsubsubsubsubparagraph=
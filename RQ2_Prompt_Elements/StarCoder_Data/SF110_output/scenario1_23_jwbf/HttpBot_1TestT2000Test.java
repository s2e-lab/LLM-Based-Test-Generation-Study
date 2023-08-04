// HttpBot_1Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {

    private static final String URL = "http://www.google.de";
    private static final String URL_2 = "http://www.google.de/search?hl=de&q=jwbf";
    private static final String URL_3 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche";
    private static final String URL_4 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de";
    private static final String URL_5 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8";
    private static final String URL_6 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8";
    private static final String URL_7 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0";
    private static final String URL_8 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky";
    private static final String URL_9 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10";
    private static final String URL_10 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N";
    private static final String URL_11 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100";
    private static final String URL_12 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten";
    private static final String URL_13 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky";
    private static final String URL_14 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_15 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_16 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_17 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_18 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_19 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static final String URL_20 = "http://www.google.de/search?hl=de&q=jwbf&btnG=Google+Suche&lr=lang_de&ie=UTF-8&oe=UTF-8&filter=0&btnI=I+m+Feeling+Lucky&start=10&sa=N&num=100&btnG=Suche+starten&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky&btnI=I+m+Feeling+Lucky";
    private static
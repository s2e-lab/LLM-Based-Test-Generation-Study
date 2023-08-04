// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {

    /**
    * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
    * @throws ProcessException on any problems with inner browser
    */
    @Test
    void testProcessReturningText() throws ProcessException {
        GetPage getPage = new GetPage();
        String s = getPage.processReturningText("test", new HttpAction() {
            @Override
            public String getHostUrl() {
                return null;
            }

            @Override
            public String getRequestUrl() {
                return null;
            }

            @Override
            public String getRequestMethod() {
                return null;
            }

            @Override
            public String getRequestCharSet() {
                return null;
            }

            @Override
            public String getRequestContentType() {
                return null;
            }

            @Override
            public String getRequestData() {
                return null;
            }

            @Override
            public String getRequestHeader(String key) {
                return null;
            }

            @Override
            public String getResponseHeader(String key) {
                return null;
            }

            @Override
            public int getResponseCode() {
                return 0;
            }

            @Override
            public String getResponseContentType() {
                return null;
            }

            @Override
            public String getResponseCharSet() {
                return null;
            }

            @Override
            public String getResponseCookie(String key) {
                return null;
            }

            @Override
            public String getResponseHeader() {
                return null;
            }

            @Override
            public String getResponse() {
                return null;
            }

            @Override
            public String getResponseCharset() {
                return null;
            }

            @Override
            public String getResponseContentTypeHeader() {
                return null;
            }

            @Override
            public String getResponseCookieHeader() {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, double defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, float defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, char defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, byte defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, short defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, Object defaultValue) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, double defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, float defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, char defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, byte defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, short defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, Object defaultValue, String separator) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, double defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, float defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, char defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, byte defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, short defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, Object defaultValue, String separator, String prefix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, double defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, float defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, char defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, byte defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, short defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, Object defaultValue, String separator, String prefix, String suffix) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, double defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, float defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, char defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, byte defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, short defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, Object defaultValue, String separator, String prefix, String suffix, String delimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, String defaultValue, String separator, String prefix, String suffix, String delimiter, String lastDelimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, int defaultValue, String separator, String prefix, String suffix, String delimiter, String lastDelimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, long defaultValue, String separator, String prefix, String suffix, String delimiter, String lastDelimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key, boolean defaultValue, String separator, String prefix, String suffix, String delimiter, String lastDelimiter) {
                return null;
            }

            @Override
            public String getResponseHeader(String key
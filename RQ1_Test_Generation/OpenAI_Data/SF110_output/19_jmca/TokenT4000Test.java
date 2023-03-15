// TokenTest.java
package com.soops.CEN4010.JMCA.JParser;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#newToken(int)} method.
*/
class TokenTest {

	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the default case of the switch statement.
	*/
	@Test
	void testNewTokenDefault() {
		Token token = Token.newToken(JavaParserConstants.ABSTRACT);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the GT token.
	*/
	@Test
	void testNewTokenGT() {
		Token token = Token.newToken(JavaParserConstants.GT);
		assertEquals(Token.GTToken.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the RUNSIGNEDSHIFT token.
	*/
	@Test
	void testNewTokenRUNSIGNEDSHIFT() {
		Token token = Token.newToken(JavaParserConstants.RUNSIGNEDSHIFT);
		assertEquals(Token.GTToken.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the RSIGNEDSHIFT token.
	*/
	@Test
	void testNewTokenRSIGNEDSHIFT() {
		Token token = Token.newToken(JavaParserConstants.RSIGNEDSHIFT);
		assertEquals(Token.GTToken.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the GTEQ token.
	*/
	@Test
	void testNewTokenGTEQ() {
		Token token = Token.newToken(JavaParserConstants.GTEQ);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the LSHIFT token.
	*/
	@Test
	void testNewTokenLSHIFT() {
		Token token = Token.newToken(JavaParserConstants.LSHIFT);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the RSHIFT token.
	*/
	@Test
	void testNewTokenRSHIFT() {
		Token token = Token.newToken(JavaParserConstants.RSHIFT);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the LTEQ token.
	*/
	@Test
	void testNewTokenLTEQ() {
		Token token = Token.newToken(JavaParserConstants.LTEQ);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the NOTEQ token.
	*/
	@Test
	void testNewTokenNOTEQ() {
		Token token = Token.newToken(JavaParserConstants.NOTEQ);
		assertEquals(Token.class, token.getClass());
	}
	
	/**
	* Test case for {@link Token#newToken(int)} method.
	* It tests the case of the switch statement for the EQEQ token.
	*/
	@Test
	void testNewTokenEQEQ() {
		Token token = Token.newToken(JavaParserConstants.EQEQ);
		assertEquals(Token.class, token.getClass());
	}
}

// TokenMgrError.java
package com.soops.CEN4010.JMCA.JParser;

/**
 * Token Manager Error.
 */
public class TokenMgrError extends Error {

    /*
     * Ordinals for various reasons why an Error of this type can be thrown.
     */

    /**
     * Lexical error occurred.
     */
    static final int LEXICAL_ERROR = 0;

    /**
     * An attempt was made to create a second instance of a static token manager.
     */
    static final int STATIC_LEXER_ERROR = 1;

    /**
     * Tried to change to an invalid lexical state.
     */
    static final int INVALID_LEXICAL_STATE = 2;

    /**
     * Detected (and bailed out of) an infinite loop in the token manager.
     */
    static final int LOOP_DETECTED = 3;

    /**
     * Indicates the reason why the exception is thrown. It will have
     * one of the above 4 values.
     */
    int errorCode;

    /**
     * Replaces unprintable characters by their escaped (or unicode escaped)
     * equivalents in the given string
     */
    protected static final String addEscapes(String str) {
        StringBuffer retval = new StringBuffer();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 0:
                    continue;
                case '\b':
                    retval.append("\\b");
                    continue;
                case '\t':
                    retval.append("\\t");
                    continue;
                case '\n':
                    retval.append("\\n");
                    continue;
                case '\f':
                    retval.append("\\f");
                    continue;
                case '\r':
                    retval.append("\\r");
                    continue;
                case '\"':
                    retval.append("\\\"");
                    continue;
                case '\'':
                    retval.append("\\\'");
                    continue;
                case '\\':
                    retval.append("\\\\");
                    continue;
                default:
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
                    }
                    continue;
            }
        }
        return retval.toString();
    }

    /**
     * Returns a detailed message for the Error when it is thrown by the
     * token manager to indicate a lexical error.
     * Parameters :
     * EOFSeen     : indicates if EOF caused the lexical error
     * curLexState : lexical state in which this error occurred
     * errorLine   : line number when the error occurred
     * errorColumn : column number when the error occurred
     * errorAfter  : prefix that was seen before this error occurred
     * curchar     : the offending character
     * Note: You can customize the lexical error message by modifying this method.
     */
    protected static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {
        return ("Lexical error at line " +
                errorLine + ", column " +
                errorColumn + ".  Encountered: " +
                (EOFSeen ? "<EOF> " : ("\"" + addEscapes(String.valueOf(curChar)) + "\"") + " (" + (int) curChar + "), ") +
                "after : \"" + addEscapes(errorAfter) + "\"");
    }

    /**
     * You can also modify the body of this method to customize your error messages.
     * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
     * of end-users concern, so you can return something like :
     * <p>
     * "Internal Error : Please file a bug report .... "
     * <p>
     * from this method for such cases in the release version of your parser.
     */
    public String getMessage() {
        return super.getMessage();
    }

    /*
     * Constructors of various flavors follow.
     */

    /**
     * No arg constructor.
     */
    public TokenMgrError() {
    }

    /**
     * Constructor with message and reason.
     */
    public TokenMgrError(String message, int reason) {
        super(message);
        errorCode = reason;
    }

    /**
     * Full Constructor.
     */
    public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar, int reason) {
        this(LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar), reason);
    }
}

// TokenMgrErrorTest.java
package com.soops.CEN4010.JMCA.JParser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenMgrError}.
* It contains ten unit test cases for the {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
*/
class TokenMgrErrorTest {
		
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the default case of the switch statement.
	*/
	@Test
	void testLexicalErrorDefault() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", ' ');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \" \" (32), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the GT token.
	*/
	@Test
	void testLexicalErrorGT() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '>');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \">\" (62), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the RUNSIGNEDSHIFT token.
	*/
	@Test
	void testLexicalErrorRUNSIGNEDSHIFT() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '>');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \">\" (62), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the RSIGNEDSHIFT token.
	*/
	@Test
	void testLexicalErrorRSIGNEDSHIFT() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '>');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \">\" (62), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the GTEQ token.
	*/
	@Test
	void testLexicalErrorGTEQ() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '>');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \">\" (62), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the LSHIFT token.
	*/
	@Test
	void testLexicalErrorLSHIFT() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '<');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \"<\" (60), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the RSHIFT token.
	*/
	@Test
	void testLexicalErrorRSHIFT() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '>');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \">\" (62), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the LTEQ token.
	*/
	@Test
	void testLexicalErrorLTEQ() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '<');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \"<\" (60), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the NOTEQ token.
	*/
	@Test
	void testLexicalErrorNOTEQ() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '!');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \"!\" (33), after : \"\"", message);
	}
	
	/**
	* Test case for {@link TokenMgrError#LexicalError(boolean, int, int, int, String, char)} method.
	* It tests the case of the switch statement for the EQEQ token.
	*/
	@Test
	void testLexicalErrorEQEQ() {
		String message = TokenMgrError.LexicalError(false, 0, 0, 0, "", '=');
		assertEquals("Lexical error at line 0, column 0.  Encountered: \"=\" (61), after : \"\"", message);
	}
}

// ParseException.java
package com.soops.CEN4010.JMCA.JParser;

/**
 * This exception is thrown when parse errors are encountered.
 * You can explicitly create objects of this exception type by
 * calling the method generateParseException in the generated
 * parser.
 * <p>
 * You can modify this class to customize your error reporting
 * mechanisms so long as you retain the public fields.
 */
public class ParseException extends Exception {

    /**
     * The version identifier for this Serializable class.
     * Increment only if the <i>serialized</i> form of the
     * class changes.
     */
    private static final long serialVersionUID = 1L;

    /**
     * This constructor is used by the method "generateParseException"
     * in the generated parser.  Calling this constructor generates
     * a new object of this type with the fields "currentToken",
     * "expectedTokenSequences", and "tokenImage" set.
     */
    public ParseException(Token currentTokenVal,
                          int[][] expectedTokenSequencesVal,

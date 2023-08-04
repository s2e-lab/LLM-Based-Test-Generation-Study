// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {

    /**
    * Test {@link _Fail#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _Fail.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _Job.java
package mygrid.web;

public class _Job implements java.io.Serializable {

    private java.lang.String id;

    public _Job() {
    }

    public java.lang.String getId();

    public void setId(java.lang.String id);

    private java.lang.String name;

    public java.lang.String getName();

    public void setName(java.lang.String name);

    private java.lang.String description;

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    private java.lang.String owner;

    public java.lang.String getOwner();

    public void setOwner(java.lang.String owner);

    private java.lang.String status;

    public java.lang.String getStatus();

    public void setStatus(java.lang.String status);

    private java.lang.String type;

    public java.lang.String getType();

    public void setType(java.lang.String type);

    private java.lang.String url;

    public java.lang.String getUrl();

    public void setUrl(java.lang.String url);

    private java.lang.String result;

    public java.lang.String getResult();

    public void setResult(java.lang.String result);

    private java.lang.String error;

    public java.lang.String getError();

    public void setError(java.lang.String error);

    private java.lang.String progress;

    public java.lang.String getProgress();

    public void setProgress(java.lang.String progress);

    private java.lang.String created;

    public java.lang.String getCreated();

    public void setCreated(java.lang.String created);

    private java.lang.String started;

    public java.lang.String getStarted();

    public void setStarted(java.lang.String started);

    private java.lang.String finished;

    public java.lang.String getFinished();

    public void setFinished(java.lang.String finished);

    private java.lang.String lastModified;

    public java.lang.String getLastModified();

    public void setLastModified(java.lang.String lastModified);

    private java.lang.String parameters;

    public java.lang.String getParameters();

    public void setParameters(java.lang.String parameters);

    private java.lang.String results;

    public java.lang.String getResults();

    public void setResults(java.lang.String results);

    private java.lang.String errors;

    public java.lang.String getErrors();

    public void setErrors(java.lang.String errors);

    private java.lang.String progressLog;

    public java.lang.String getProgressLog();

    public void setProgressLog(java.lang.String progressLog);

    private java.lang.String progressLogMessage;

    public java.lang.String getProgressLogMessage();

    public void setProgressLogMessage(java.lang.String progressLogMessage);

    private java.lang.String progressLogMessageLevel;

    public java.lang.String getProgressLogMessageLevel();

    public void setProgressLogMessageLevel(java.lang.String progressLogMessageLevel);

    private java.lang.String progressLogMessageTimestamp;

    public java.lang.String getProgressLogMessageTimestamp();

    public void setProgressLogMessageTimestamp(java.lang.String progressLogMessageTimestamp);

    private java.lang.String progressLogMessageThread;

    public java.lang.String getProgressLogMessageThread();

    public void setProgressLogMessageThread(java.lang.String progressLogMessageThread);

    private java.lang.String progressLogMessageClass;

    public java.lang.String getProgressLogMessageClass();

    public void setProgressLogMessageClass(java.lang.String progressLogMessageClass);

    private java.lang.String progressLogMessageMethod;

    public java.lang.String getProgressLogMessageMethod();

    public void setProgressLogMessageMethod(java.lang.String progressLogMessageMethod);

    private java.lang.String progressLogMessageLine;

    public java.lang.String getProgressLogMessageLine();

    public void setProgressLogMessageLine(java.lang.String progressLogMessageLine);

    private java.lang.String progressLogMessageFile;

    public java.lang.String getProgressLogMessageFile();

    public void setProgressLogMessageFile(java.lang.String progressLogMessageFile);

    private java.lang.String progressLogMessageText;

    public java.lang.String getProgressLogMessageText();

    public void setProgressLogMessageText(java.lang.String progressLogMessageText);

    private java.lang.String progressLogMessageException;

    public java.lang.String getProgressLogMessageException();

    public void setProgressLogMessageException(java.lang.String progressLogMessageException);

    private java.lang.String progressLogMessageExceptionMessage;

    public java.lang.String getProgressLogMessageExceptionMessage();

    public void setProgressLogMessageExceptionMessage(java.lang.String progressLogMessageExceptionMessage);

    private java.lang.String progressLogMessageExceptionStackTrace;

    public java.lang.String getProgressLogMessageExceptionStackTrace();

    public void setProgressLogMessageExceptionStackTrace(java.lang.String progressLogMessageExceptionStackTrace);

    private java.lang.String progressLogMessageExceptionRootCause;

    public java.lang.String getProgressLogMessageExceptionRootCause();

    public void setProgressLogMessageExceptionRootCause(java.lang.String progressLogMessageExceptionRootCause);

    private java.lang.String progressLogMessageExceptionRootCauseMessage;

    public java.lang.String getProgressLogMessageExceptionRootCauseMessage();

    public void setProgressLogMessageExceptionRootCauseMessage(java.lang.String progressLogMessageExceptionRootCauseMessage);

    private java.lang.String progressLogMessageExceptionRootCauseStackTrace;

    public java.lang.String getProgressLogMessageExceptionRootCauseStackTrace();

    public void setProgressLogMessageExceptionRootCauseStackTrace(java.lang.String progressLogMessageExceptionRootCauseStackTrace);

    private java.lang.String progressLogMessageExceptionRootCauseRootCause;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCause();

    public void setProgressLogMessageExceptionRootCauseRootCause(java.lang.String progressLogMessageExceptionRootCauseRootCause);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseMessage;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseMessage();

    public void setProgressLogMessageExceptionRootCauseRootCauseMessage(java.lang.String progressLogMessageExceptionRootCauseRootCauseMessage);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseStackTrace;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseStackTrace();

    public void setProgressLogMessageExceptionRootCauseRootCauseStackTrace(java.lang.String progressLogMessageExceptionRootCauseRootCauseStackTrace);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCause;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCause();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCause(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCause);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseMessage;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCauseMessage();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCauseMessage(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseMessage);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseStackTrace;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCauseStackTrace();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCauseStackTrace(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseStackTrace);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCause;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCause();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCause(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCause);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseMessage;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseMessage();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseMessage(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseMessage);

    private java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseStackTrace;

    public java.lang.String getProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseStackTrace();

    public void setProgressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseStackTrace(java.lang.String progressLogMessageExceptionRootCauseRootCauseRootCauseRootCauseStackTrace);

    private java.
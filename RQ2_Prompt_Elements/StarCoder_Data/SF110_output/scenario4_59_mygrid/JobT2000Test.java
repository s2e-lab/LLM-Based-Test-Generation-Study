// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains ten unit test cases for the {@link Job#getTypeDesc()} method.
*/
class JobTest {

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc1() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc2() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc3() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc4() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc5() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc6() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc7() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc8() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link Job#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc9() {
        org.apache.axis.description.TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// JobType.java
package mygrid.web;

public class JobType implements java.io.Serializable {

    private java.lang.String id;

    private java.lang.String name;

    private mygrid.web.Discriminator discriminators;

    private mygrid.web.ArrayOfDependency dependencies;

    private mygrid.web.ArrayOfContextElement context;

    private int progress;

    private boolean broadcasted;

    private java.lang.String currentEngineId;

    private mygrid.web.GridJobStatus status;

    public JobType() {
    }

    public java.lang.String getId();

    public void setId(java.lang.String id);

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public mygrid.web.Discriminator getDiscriminators();

    public void setDiscriminators(mygrid.web.Discriminator discriminators);

    public mygrid.web.ArrayOfDependency getDependencies();

    public void setDependencies(mygrid.web.ArrayOfDependency dependencies);

    public mygrid.web.ArrayOfContextElement getContext();

    public void setContext(mygrid.web.ArrayOfContextElement context);

    public int getProgress();

    public void setProgress(int progress);

    public boolean isBroadcasted();

    public void setBroadcasted(boolean broadcasted);

    public java.lang.String getCurrentEngineId();

    public void setCurrentEngineId(java.lang.String currentEngineId);

    public mygrid.web.GridJobStatus getStatus();

    public void setStatus(mygrid.web.GridJobStatus status);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(JobType.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// JobTypeTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JobType}.
* It contains ten unit test cases for the {@link JobType#getTypeDesc()} method.
*/
class JobTypeTest {
		
    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc1() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc2() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc3() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc4() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc5() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc6() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc7() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc8() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
    * Test case for {@link JobType#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc9() {
        org.apache.axis.description.TypeDesc typeDesc = JobType.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// JobTypeWrapper.java
package mygrid.web;

public class JobTypeWrapper implements java.io.Serializable {

    private mygrid.web.JobType job;

    public JobTypeWrapper() {
    }

    public mygrid.web.JobType getJob();

    public void setJob(mygrid.web.JobType job);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(JobTypeWrapper.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.
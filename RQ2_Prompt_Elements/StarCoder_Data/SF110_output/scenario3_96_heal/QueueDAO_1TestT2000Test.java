// QueueDAO_1Test.java
package org.heal.module.catalog;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.util.CommonDAO;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QueueDAO}.
* It contains ten unit test cases for the {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)} method.
*/
class QueueDAO_1Test {

    /**
     * Test method for {@link QueueDAO#saveQueuedRecord(QueuedRecordBean)}.
     */
    @Test
    void testSaveQueuedRecord() {
        // Arrange
        final QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setRecordId(1);
        queuedRecord.setRecordName("Record 1");
        queuedRecord.setRecordDescription("Description 1");
        queuedRecord.setRecordStatus("Status 1");
        queuedRecord.setRecordCreatedDate(new Date());
        queuedRecord.setRecordModifiedDate(new Date());
        queuedRecord.setRecordCreatedBy("User 1");
        queuedRecord.setRecordModifiedBy("User 1");
        queuedRecord.setRecordMetadata(new CompleteMetadataBean());
        queuedRecord.getRecordMetadata().setMetadataId(1);
        queuedRecord.getRecordMetadata().setMetadataName("Metadata 1");
        queuedRecord.getRecordMetadata().setMetadataDescription("Description 1");
        queuedRecord.getRecordMetadata().setMetadataStatus("Status 1");
        queuedRecord.getRecordMetadata().setMetadataCreatedDate(new Date());
        queuedRecord.getRecordMetadata().setMetadataModifiedDate(new Date());
        queuedRecord.getRecordMetadata().setMetadataCreatedBy("User 1");
        queuedRecord.getRecordMetadata().setMetadataModifiedBy("User 1");
        queuedRecord.getRecordMetadata().setMetadataFields(new ArrayList<MetadataFieldBean>());
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldName("Field 1");
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldDescription("Description 1");
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldStatus("Status 1");
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldCreatedBy("User 1");
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldModifiedBy("User 1");
        queuedRecord.getRecordMetadata().getMetadataFields().get(0).setMetadataFieldValue("Value 1");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldId(2);
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldName("Field 2");
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldDescription("Description 2");
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldStatus("Status 2");
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldCreatedBy("User 2");
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldModifiedBy("User 2");
        queuedRecord.getRecordMetadata().getMetadataFields().get(1).setMetadataFieldValue("Value 2");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldId(3);
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldName("Field 3");
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldDescription("Description 3");
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldStatus("Status 3");
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldCreatedBy("User 3");
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldModifiedBy("User 3");
        queuedRecord.getRecordMetadata().getMetadataFields().get(2).setMetadataFieldValue("Value 3");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldId(4);
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldName("Field 4");
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldDescription("Description 4");
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldStatus("Status 4");
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldCreatedBy("User 4");
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldModifiedBy("User 4");
        queuedRecord.getRecordMetadata().getMetadataFields().get(3).setMetadataFieldValue("Value 4");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldId(5);
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldName("Field 5");
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldDescription("Description 5");
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldStatus("Status 5");
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldCreatedBy("User 5");
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldModifiedBy("User 5");
        queuedRecord.getRecordMetadata().getMetadataFields().get(4).setMetadataFieldValue("Value 5");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldId(6);
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldName("Field 6");
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldDescription("Description 6");
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldStatus("Status 6");
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldModifiedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldCreatedBy("User 6");
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldModifiedBy("User 6");
        queuedRecord.getRecordMetadata().getMetadataFields().get(5).setMetadataFieldValue("Value 6");
        queuedRecord.getRecordMetadata().getMetadataFields().add(new MetadataFieldBean());
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldId(7);
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldRecordId(1);
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldName("Field 7");
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldDescription("Description 7");
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldStatus("Status 7");
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldCreatedDate(new Date());
        queuedRecord.getRecordMetadata().getMetadataFields().get(6).setMetadataFieldModifiedDate(new
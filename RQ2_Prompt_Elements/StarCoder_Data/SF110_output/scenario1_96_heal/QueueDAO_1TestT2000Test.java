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

    private static DataSource dataSource = null;
    private static MetadataDAO metadataDAO = null;
    private static QueueDAO queueDAO = null;

    @Test
    void testSaveQueuedRecord_1() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_2() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_3() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_4() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_5() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_6() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_7() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_8() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_9() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_10() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_11() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_12() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_13() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_14() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_15() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_16() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_17() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_18() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_19() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_20() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSaveQueuedRecord_21() {
        QueuedRecordBean queuedRecord = new QueuedRecordBean();
        queuedRecord.setShortMetadata(new CompleteMetadataBean());
        queuedRecord.setShortMetadata(metadataDAO.getCompleteMetadata(1));
        queuedRecord.setQueueDate(new Date());
        queuedRecord.setQueueType("test");
        assertTrue(queueDAO.saveQueuedRecord(queuedRecord));
    }

    @Test
    void testSave
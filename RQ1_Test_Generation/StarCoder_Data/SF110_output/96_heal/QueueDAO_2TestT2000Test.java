// QueueDAO_2Test.java
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
class QueueDAO_2Test {

    private QueueDAO queueDAO = new QueueDAO();

    private CommonDAO cd = new CommonDAO();

    private MetadataDAO md = new MetadataDAO();

    private static final String SELECT_QUEUE_BY_TYPE = "SELECT QueuedRecordId," + " MetadataId, Status, Comments FROM QueuedRecords WHERE Type LIKE ?";

    private static final String INSERT_QUEUE_ENTRY = "INSERT INTO QueuedRecords" + " (Type, MetadataId, Status, Comments) VALUES (?, ?, ?, ?)";

    private static final String UPDATE_QUEUE_ENTRY = "UPDATE QueuedRecords" + " SET Type = ?, MetadataId = ?, Status = ?, Comments = ? WHERE" + " QueuedRecordId = ?";

    private static final String DELETE_QUEUE_ENTRY = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId = ?";

    private static final String SELECT_METADATA_BY_ID = "SELECT MetadataId, MetadataType, MetadataTitle, MetadataAbstract, MetadataDate," + " MetadataAuthor, MetadataPublisher, MetadataSubject, MetadataLanguage, MetadataCoverage," + " MetadataRights, MetadataSource, MetadataFormat, MetadataRelation, MetadataCreator," + " MetadataContributor, MetadataDateSubmitted, MetadataDateAccepted, MetadataDateCopyrighted," + " MetadataDateAvailable, MetadataDateIssued, MetadataDateModified, MetadataDateValid, MetadataDateAvailable," + " MetadataDateCopyrighted, MetadataDateSubmitted, MetadataDateValid, MetadataLanguage, MetadataRelation," + " MetadataSource, MetadataFormat, MetadataPublisher, MetadataRights, MetadataSubject," + " MetadataCoverage, MetadataCreator, MetadataContributor, MetadataDate, MetadataTitle, MetadataType" + " FROM Metadata WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_TIMESTAMP_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BYTE_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_CHARACTER_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BYTE_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_CHARACTER_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DATE_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DATE_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_TIMESTAMP_ARRAY_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BYTE_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_CHARACTER_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BYTE_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_CHARACTER_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DATE_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DATE_ARRAY_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_TIMESTAMP_LIST_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BYTE_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_CHARACTER_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_BOOLEAN_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_STRING_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_INTEGER_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_DOUBLE_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_LONG_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_FLOAT_ARRAY_SET_PROPERTY = "UPDATE Metadata SET ? = ? WHERE MetadataId LIKE ?";

    private static final String UPDATE_METADATA_SHORT_ARRAY_SET_PROPERTY
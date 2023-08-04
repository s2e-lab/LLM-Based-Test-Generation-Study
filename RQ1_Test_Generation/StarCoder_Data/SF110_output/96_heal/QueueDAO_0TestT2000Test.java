// QueueDAO_0Test.java
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
* It contains ten unit test cases for the {@link QueueDAO#getQueueByType(String)} method.
*/
class QueueDAO_0Test {

    private QueueDAO queueDAO = new QueueDAO();

    private CommonDAO cd = new CommonDAO();

    private MetadataDAO md = new MetadataDAO();

    private static final String SELECT_QUEUE_BY_TYPE = "SELECT QueuedRecordId," + " MetadataId, Status, Comments FROM QueuedRecords WHERE Type LIKE ?";

    private static final String INSERT_QUEUE_ENTRY = "INSERT INTO QueuedRecords" + " (Type, MetadataId, Status, Comments) VALUES (?, ?, ?, ?)";

    private static final String UPDATE_QUEUE_ENTRY = "UPDATE QueuedRecords" + " SET Type = ?, MetadataId = ?, Status = ?, Comments = ? WHERE" + " QueuedRecordId = ?";

    private static final String DELETE_QUEUE_ENTRY = "DELETE FROM QueuedRecords" + " WHERE QueuedRecordId = ?";

    private static final String TYPE_APPROVAL = new String("approval");

    private static final String TYPE_CATALOG = new String("catalog");

    private static final String METADATA_ID_1 = new String("1");

    private static final String METADATA_ID_2 = new String("2");

    private static final String METADATA_ID_3 = new String("3");

    private static final String METADATA_ID_4 = new String("4");

    private static final String METADATA_ID_5 = new String("5");

    private static final String METADATA_ID_6 = new String("6");

    private static final String METADATA_ID_7 = new String("7");

    private static final String METADATA_ID_8 = new String("8");

    private static final String METADATA_ID_9 = new String("9");

    private static final String METADATA_ID_10 = new String("10");

    private static final String METADATA_ID_11 = new String("11");

    private static final String METADATA_ID_12 = new String("12");

    private static final String METADATA_ID_13 = new String("13");

    private static final String METADATA_ID_14 = new String("14");

    private static final String METADATA_ID_15 = new String("15");

    private static final String METADATA_ID_16 = new String("16");

    private static final String METADATA_ID_17 = new String("17");

    private static final String METADATA_ID_18 = new String("18");

    private static final String METADATA_ID_19 = new String("19");

    private static final String METADATA_ID_20 = new String("20");

    private static final String METADATA_ID_21 = new String("21");

    private static final String METADATA_ID_22 = new String("22");

    private static final String METADATA_ID_23 = new String("23");

    private static final String METADATA_ID_24 = new String("24");

    private static final String METADATA_ID_25 = new String("25");

    private static final String METADATA_ID_26 = new String("26");

    private static final String METADATA_ID_27 = new String("27");

    private static final String METADATA_ID_28 = new String("28");

    private static final String METADATA_ID_29 = new String("29");

    private static final String METADATA_ID_30 = new String("30");

    private static final String METADATA_ID_31 = new String("31");

    private static final String METADATA_ID_32 = new String("32");

    private static final String METADATA_ID_33 = new String("33");

    private static final String METADATA_ID_34 = new String("34");

    private static final String METADATA_ID_35 = new String("35");

    private static final String METADATA_ID_36 = new String("36");

    private static final String METADATA_ID_37 = new String("37");

    private static final String METADATA_ID_38 = new String("38");

    private static final String METADATA_ID_39 = new String("39");

    private static final String METADATA_ID_40 = new String("40");

    private static final String METADATA_ID_41 = new String("41");

    private static final String METADATA_ID_42 = new String("42");

    private static final String METADATA_ID_43 = new String("43");

    private static final String METADATA_ID_44 = new String("44");

    private static final String METADATA_ID_45 = new String("45");

    private static final String METADATA_ID_46 = new String("46");

    private static final String METADATA_ID_47 = new String("47");

    private static final String METADATA_ID_48 = new String("48");

    private static final String METADATA_ID_49 = new String("49");

    private static final String METADATA_ID_50 = new String("50");

    private static final String METADATA_ID_51 = new String("51");

    private static final String METADATA_ID_52 = new String("52");

    private static final String METADATA_ID_53 = new String("53");

    private static final String METADATA_ID_54 = new String("54");

    private static final String METADATA_ID_55 = new String("55");

    private static final String METADATA_ID_56 = new String("56");

    private static final String METADATA_ID_57 = new String("57");

    private static final String METADATA_ID_58 = new String("58");

    private static final String METADATA_ID_59 = new String("59");

    private static final String METADATA_ID_60 = new String("60");

    private static final String METADATA_ID_61 = new String("61");

    private static final String METADATA_ID_62 = new String("62");

    private static final String METADATA_ID_63 = new String("63");

    private static final String METADATA_ID_64 = new String("64");

    private static final String METADATA_ID_65 = new String("65");

    private static final String METADATA_ID_66 = new String("66");

    private static final String METADATA_ID_67 = new String("67");

    private static final String METADATA_ID_68 = new String("68");

    private static final String METADATA_ID_69 = new String("69");

    private static final String METADATA_ID_70 = new String("70");

    private static final String METADATA_ID_71 = new String("71");

    private static final String METADATA_ID_72 = new String("72");

    private static final String METADATA_ID_73 = new String("73");

    private static final String METADATA_ID_74 = new String("74");

    private static final String METADATA_ID_75 = new String("75");

    private static final String METADATA_ID_76 = new String("76");

    private static final String METADATA_ID_77 = new String("77");

    private static final String METADATA_ID_78 = new String("78");

    private static final String METADATA_ID_79 = new String("79");

    private static final String METADATA_ID_80 = new String("80");

    private static final String METADATA_ID_81 = new String("81");

    private static final String METADATA_ID_82 = new String("82");

    private static final String METADATA_ID_83 = new String("83");

    private static final String METADATA_ID_84 = new String("84");

    private static final String METADATA_ID_85 = new String("85");

    private static final String METADATA_ID_86 = new String("86");

    private static final String METADATA_ID_87 = new String("87");

    private static final String METADATA_ID_88 = new String("88");

    private static final String METADATA_ID_89 = new String("89");

    private static final String METADATA_ID_90 = new String("90");

    private static final String METADATA_ID_91 = new String("91");

    private static final String METADATA_ID_92 = new String("92");

    private static final String METADATA_ID_93 = new String("93");

    private static final String METADATA_ID_94 = new String("94");

    private static final String METADATA_ID_95 = new String("95");

    private static final String MET
// ControlerTest.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.interGraph.FenetreChoix;
import fr.unice.gfarce.xls.WritingXLS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases for the {@link Controler#findAllFormation()} method.
*/
class ControlerTest {

    private static final String PATH_XLS = "src/test/resources/test.xls";
    private static final String PATH_XLS_2 = "src/test/resources/test2.xls";
    private static final String PATH_XLS_3 = "src/test/resources/test3.xls";
    private static final String PATH_XLS_4 = "src/test/resources/test4.xls";
    private static final String PATH_XLS_5 = "src/test/resources/test5.xls";
    private static final String PATH_XLS_6 = "src/test/resources/test6.xls";
    private static final String PATH_XLS_7 = "src/test/resources/test7.xls";
    private static final String PATH_XLS_8 = "src/test/resources/test8.xls";
    private static final String PATH_XLS_9 = "src/test/resources/test9.xls";
    private static final String PATH_XLS_10 = "src/test/resources/test10.xls";
    private static final String PATH_XLS_11 = "src/test/resources/test11.xls";
    private static final String PATH_XLS_12 = "src/test/resources/test12.xls";
    private static final String PATH_XLS_13 = "src/test/resources/test13.xls";
    private static final String PATH_XLS_14 = "src/test/resources/test14.xls";
    private static final String PATH_XLS_15 = "src/test/resources/test15.xls";
    private static final String PATH_XLS_16 = "src/test/resources/test16.xls";
    private static final String PATH_XLS_17 = "src/test/resources/test17.xls";
    private static final String PATH_XLS_18 = "src/test/resources/test18.xls";
    private static final String PATH_XLS_19 = "src/test/resources/test19.xls";
    private static final String PATH_XLS_20 = "src/test/resources/test20.xls";
    private static final String PATH_XLS_21 = "src/test/resources/test21.xls";
    private static final String PATH_XLS_22 = "src/test/resources/test22.xls";
    private static final String PATH_XLS_23 = "src/test/resources/test23.xls";
    private static final String PATH_XLS_24 = "src/test/resources/test24.xls";
    private static final String PATH_XLS_25 = "src/test/resources/test25.xls";
    private static final String PATH_XLS_26 = "src/test/resources/test26.xls";
    private static final String PATH_XLS_27 = "src/test/resources/test27.xls";
    private static final String PATH_XLS_28 = "src/test/resources/test28.xls";
    private static final String PATH_XLS_29 = "src/test/resources/test29.xls";
    private static final String PATH_XLS_30 = "src/test/resources/test30.xls";
    private static final String PATH_XLS_31 = "src/test/resources/test31.xls";
    private static final String PATH_XLS_32 = "src/test/resources/test32.xls";
    private static final String PATH_XLS_33 = "src/test/resources/test33.xls";
    private static final String PATH_XLS_34 = "src/test/resources/test34.xls";
    private static final String PATH_XLS_35 = "src/test/resources/test35.xls";
    private static final String PATH_XLS_36 = "src/test/resources/test36.xls";
    private static final String PATH_XLS_37 = "src/test/resources/test37.xls";
    private static final String PATH_XLS_38 = "src/test/resources/test38.xls";
    private static final String PATH_XLS_39 = "src/test/resources/test39.xls";
    private static final String PATH_XLS_40 = "src/test/resources/test40.xls";
    private static final String PATH_XLS_41 = "src/test/resources/test41.xls";
    private static final String PATH_XLS_42 = "src/test/resources/test42.xls";
    private static final String PATH_XLS_43 = "src/test/resources/test43.xls";
    private static final String PATH_XLS_44 = "src/test/resources/test44.xls";
    private static final String PATH_XLS_45 = "src/test/resources/test45.xls";
    private static final String PATH_XLS_46 = "src/test/resources/test46.xls";
    private static final String PATH_XLS_47 = "src/test/resources/test47.xls";
    private static final String PATH_XLS_48 = "src/test/resources/test48.xls";
    private static final String PATH_XLS_49 = "src/test/resources/test49.xls";
    private static final String PATH_XLS_50 = "src/test/resources/test50.xls";
    private static final String PATH_XLS_51 = "src/test/resources/test51.xls";
    private static final String PATH_XLS_52 = "src/test/resources/test52.xls";
    private static final String PATH_XLS_53 = "src/test/resources/test53.xls";
    private static final String PATH_XLS_54 = "src/test/resources/test54.xls";
    private static final String PATH_XLS_55 = "src/test/resources/test55.xls";
    private static final String PATH_XLS_56 = "src/test/resources/test56.xls";
    private static final String PATH_XLS_57 = "src/test/resources/test57.xls";
    private static final String PATH_XLS_58 = "src/test/resources/test58.xls";
    private static final String PATH_XLS_59 = "src/test/resources/test59.xls";
    private static final String PATH_XLS_60 = "src/test/resources/test60.xls";
    private static final String PATH_XLS_61 = "src/test/resources/test61.xls";
    private static final String PATH_XLS_62 = "src/test/resources/test62.xls";
    private static final String PATH_XLS_63 = "src/test/resources/test63.xls";
    private static final String PATH_XLS_64 = "src/test/resources/test64.xls";
    private static final String PATH_XLS_65 = "src/test/resources/test65.xls";
    private static final String PATH_XLS_66 = "src/test/resources/test66.xls";
    private static final String PATH_XLS_67 = "src/test/resources/test67.xls";
    private static final String PATH_XLS_68 = "src/test/resources/test68.xls";
    private static final String PATH_XLS_69 = "src/test/resources/test69.xls";
    private static final String PATH_XLS_70 = "src/test/resources/test70.xls";
    private static final String PATH_XLS_71 = "src/test/resources/test71.xls";
    private static final String PATH_XLS_72 = "src/test/resources/test72.xls";
    private static final String PATH_XLS_73 = "src/test/resources/test73.xls";
    private static final String PATH_XLS_74 = "src/test/resources/test74.xls";
    private static final String PATH_XLS_75 = "src/test/resources/test75.xls";
    private static final String PATH_XLS_76 = "src/test/resources/test76.xls";
    private static final String PATH_XLS_77 = "src/test/resources/test77.xls";
    private static final String PATH_XLS_78 = "src/test/resources
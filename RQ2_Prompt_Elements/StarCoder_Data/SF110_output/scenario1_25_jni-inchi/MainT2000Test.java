// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

    @Test
    void test1() {
        JniInchiStructure struct = Main.getTestMolecule();
        struct.setOption(INCHI_OPTION.INCHI_OPTION_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_ATOM_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_5_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_5_T_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_RELATIVE_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_RACETRACK);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_OPT_STR);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_AUX_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_CONNECT_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_STEREO_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_ORIG_ATOM_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_REC_ATOM_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SAVE_BASIC_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PREPARE_STEREO_FLAGS);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PREPARE_RESULT);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_INCHI);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_AUX_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_INCHI_STRING);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_PLAIN_INCHI);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_PLAIN_INCHI_STRING);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_XML);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_JSON);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRINT_SDFILE);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_ATOM_XTRA_LAYER);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_BONDS_NOT_ON_RING_ONLY);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_FIX_SP3_BUG);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SKIP_AUX_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_PRESERVE_BROKEN_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_ALLOW_EMPTY_STRUCTURE);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_FILL_AUX_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_FILL_COORD);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_RECURSIVE);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_OUTPUT_FILE_HEADER);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_EXPANDED_OUTPUT);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_AUX_INFO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SKIP_INCHI_OUTPUT);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_SKIP_HTML);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_EMBED_REC);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_KET_ENOL_FLAG);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_I_S_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_FIXED_H);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_SCAV_COORD);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_SCAV_VALENCES);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_MODE);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_SB_FIXED_H);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_SCAV_RAC);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_SCAV_RAC_PROT);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RELATIVE_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_PROT);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_REL);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_ABS);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_MAX);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_1);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_2);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_3);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_4);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_5);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_6);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_7);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_8);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_9);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_10);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_11);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_12);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_13);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_14);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_15);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_16);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_17);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_18);
        struct.setOption(INCHI_OPTION.INCHI_OPTION_1_25_RAC_STEREO_19);
        struct.setOption(INCHI_OPTION.IN
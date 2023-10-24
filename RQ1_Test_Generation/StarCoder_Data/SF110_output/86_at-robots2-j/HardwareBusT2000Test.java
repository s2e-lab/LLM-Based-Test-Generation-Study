// HardwareBusTest.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HardwareBus}.
* It contains ten unit test cases for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {

    private static final int PORT_NUMBER = 1;
    private static final short PORT_VALUE = 123;
    private static final int INTERRUPT_NUMBER = 2;
    private static final int INTERRUPT_VALUE = 456;
    private static final int RESET_VALUE = 789;
    private static final int SHUTDOWN_VALUE = 101112;
    private static final int STARTUP_VALUE = 131415;
    private static final int HEAT_VALUE = 161718;

    private static final int PORT_NUMBER_2 = 2;
    private static final short PORT_VALUE_2 = 234;
    private static final int INTERRUPT_NUMBER_2 = 3;
    private static final int INTERRUPT_VALUE_2 = 567;
    private static final int RESET_VALUE_2 = 890;
    private static final int SHUTDOWN_VALUE_2 = 111213;
    private static final int STARTUP_VALUE_2 = 141516;
    private static final int HEAT_VALUE_2 = 171819;

    private static final int PORT_NUMBER_3 = 3;
    private static final short PORT_VALUE_3 = 345;
    private static final int INTERRUPT_NUMBER_3 = 4;
    private static final int INTERRUPT_VALUE_3 = 678;
    private static final int RESET_VALUE_3 = 901;
    private static final int SHUTDOWN_VALUE_3 = 121314;
    private static final int STARTUP_VALUE_3 = 151617;
    private static final int HEAT_VALUE_3 = 181920;

    private static final int PORT_NUMBER_4 = 4;
    private static final short PORT_VALUE_4 = 456;
    private static final int INTERRUPT_NUMBER_4 = 5;
    private static final int INTERRUPT_VALUE_4 = 789;
    private static final int RESET_VALUE_4 = 1012;
    private static final int SHUTDOWN_VALUE_4 = 131415;
    private static final int STARTUP_VALUE_4 = 161718;
    private static final int HEAT_VALUE_4 = 192021;

    private static final int PORT_NUMBER_5 = 5;
    private static final short PORT_VALUE_5 = 567;
    private static final int INTERRUPT_NUMBER_5 = 6;
    private static final int INTERRUPT_VALUE_5 = 890;
    private static final int RESET_VALUE_5 = 1113;
    private static final int SHUTDOWN_VALUE_5 = 141516;
    private static final int STARTUP_VALUE_5 = 171819;
    private static final int HEAT_VALUE_5 = 202122;

    private static final int PORT_NUMBER_6 = 6;
    private static final short PORT_VALUE_6 = 678;
    private static final int INTERRUPT_NUMBER_6 = 7;
    private static final int INTERRUPT_VALUE_6 = 901;
    private static final int RESET_VALUE_6 = 1214;
    private static final int SHUTDOWN_VALUE_6 = 151617;
    private static final int STARTUP_VALUE_6 = 181920;
    private static final int HEAT_VALUE_6 = 212223;

    private static final int PORT_NUMBER_7 = 7;
    private static final short PORT_VALUE_7 = 789;
    private static final int INTERRUPT_NUMBER_7 = 8;
    private static final int INTERRUPT_VALUE_7 = 1012;
    private static final int RESET_VALUE_7 = 1315;
    private static final int SHUTDOWN_VALUE_7 = 161718;
    private static final int STARTUP_VALUE_7 = 192021;
    private static final int HEAT_VALUE_7 = 222324;

    private static final int PORT_NUMBER_8 = 8;
    private static final short PORT_VALUE_8 = 890;
    private static final int INTERRUPT_NUMBER_8 = 9;
    private static final int INTERRUPT_VALUE_8 = 1113;
    private static final int RESET_VALUE_8 = 1416;
    private static final int SHUTDOWN_VALUE_8 = 171819;
    private static final int STARTUP_VALUE_8 = 202122;
    private static final int HEAT_VALUE_8 = 232425;

    private static final int PORT_NUMBER_9 = 9;
    private static final short PORT_VALUE_9 = 901;
    private static final int INTERRUPT_NUMBER_9 = 10;
    private static final int INTERRUPT_VALUE_9 = 1214;
    private static final int RESET_VALUE_9 = 1517;
    private static final int SHUTDOWN_VALUE_9 = 181920;
    private static final int STARTUP_VALUE_9 = 212223;
    private static final int HEAT_VALUE_9 = 242526;

    private static final int PORT_NUMBER_10 = 10;
    private static final short PORT_VALUE_10 = 1012;
    private static final int INTERRUPT_NUMBER_10 = 11;
    private static final int INTERRUPT_VALUE_10 = 1315;
    private static final int RESET_VALUE_10 = 1618;
    private static final int SHUTDOWN_VALUE_10 = 192021;
    private static final int STARTUP_VALUE_10 = 222324;
    private static final int HEAT_VALUE_10 = 252627;

    private static final int PORT_NUMBER_11 = 11;
    private static final short PORT_VALUE_11 = 1113;
    private static final int INTERRUPT_NUMBER_11 = 12;
    private static final int INTERRUPT_VALUE_12 = 1416;
    private static final int RESET_VALUE_11 = 1719;
    private static final int SHUTDOWN_VALUE_11 = 202122;
    private static final int STARTUP_VALUE_11 = 232425;
    private static final int HEAT_VALUE_11 = 262728;

    private static final int PORT_NUMBER_12 = 12;
    private static final short PORT_VALUE_12 = 1214;
    private static final int INTERRUPT_NUMBER_12 = 13;
    private static final int INTERRUPT_VALUE_13 = 1517;
    private static final int RESET_VALUE_12 = 1820;
    private static final int SHUTDOWN_VALUE_12 = 212223;
    private static final int STARTUP_VALUE_12 = 242526;
    private static final int HEAT_VALUE_12 = 272829;

    private static final int PORT_NUMBER_13 = 13;
    private static final short PORT_VALUE_13 = 1315;
    private static final int INTERRUPT_NUMBER_13 = 14;
    private static final int INTERRUPT_VALUE_14 = 1618;
    private static final int RESET_VALUE_13 = 1921;
    private static final int SHUTDOWN_VALUE_13 = 222324;
    private static final int STARTUP_VALUE_13 = 252627;
    private static final int HEAT_VALUE_13 = 282930;

    private static final int PORT_NUMBER_14 = 14;
    private static final short PORT_VALUE_14 = 1416;
    private static final int INTERRUPT_NUMBER_14 = 15;
    private static final int INTERRUPT_VALUE_15 = 1719;
    private static final int RESET_VALUE_14 = 2022;
    private static final int SHUTDOWN_VALUE_14 = 232425;
    private static final int STARTUP_VALUE_14 = 262728;
    private static final int HEAT_VALUE_14 = 29
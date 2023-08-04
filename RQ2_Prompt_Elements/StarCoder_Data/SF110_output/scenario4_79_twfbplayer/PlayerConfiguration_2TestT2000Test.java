// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {

    /**
    * Test method for {@link PlayerConfiguration#showShootline()}.
    */
    @Test
    void testShowShootline() {
        final PlayerConfiguration instance = new PlayerConfiguration();
        final Set<PlayerConfigurationListener> listeners = new HashSet<PlayerConfigurationListener>();
        final Lock playLock = new ReentrantLock();
        final PlayerState state = PlayerState.STOP;
        final int ROUND_DELAY = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE = Configuration.SHOW_SHOOTLINE;
        final boolean showMoveTargets = instance.showMoveTargets();
        final boolean showShootline = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners1 = instance.listeners;
        final Lock playLock1 = instance.playLock;
        final PlayerState state1 = instance.state;
        final int ROUND_DELAY1 = instance.ROUND_DELAY;
        final int PLAYER_DELAY1 = instance.PLAYER_DELAY;
        final int ACTION_DELAY1 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS1 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE1 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets1 = instance.showMoveTargets();
        final boolean showShootline1 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners2 = instance.listeners;
        final Lock playLock2 = instance.playLock;
        final PlayerState state2 = instance.state;
        final int ROUND_DELAY2 = instance.ROUND_DELAY;
        final int PLAYER_DELAY2 = instance.PLAYER_DELAY;
        final int ACTION_DELAY2 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS2 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE2 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets2 = instance.showMoveTargets();
        final boolean showShootline2 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners3 = instance.listeners;
        final Lock playLock3 = instance.playLock;
        final PlayerState state3 = instance.state;
        final int ROUND_DELAY3 = instance.ROUND_DELAY;
        final int PLAYER_DELAY3 = instance.PLAYER_DELAY;
        final int ACTION_DELAY3 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS3 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE3 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets3 = instance.showMoveTargets();
        final boolean showShootline3 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners4 = instance.listeners;
        final Lock playLock4 = instance.playLock;
        final PlayerState state4 = instance.state;
        final int ROUND_DELAY4 = instance.ROUND_DELAY;
        final int PLAYER_DELAY4 = instance.PLAYER_DELAY;
        final int ACTION_DELAY4 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS4 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE4 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets4 = instance.showMoveTargets();
        final boolean showShootline4 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners5 = instance.listeners;
        final Lock playLock5 = instance.playLock;
        final PlayerState state5 = instance.state;
        final int ROUND_DELAY5 = instance.ROUND_DELAY;
        final int PLAYER_DELAY5 = instance.PLAYER_DELAY;
        final int ACTION_DELAY5 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS5 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE5 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets5 = instance.showMoveTargets();
        final boolean showShootline5 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners6 = instance.listeners;
        final Lock playLock6 = instance.playLock;
        final PlayerState state6 = instance.state;
        final int ROUND_DELAY6 = instance.ROUND_DELAY;
        final int PLAYER_DELAY6 = instance.PLAYER_DELAY;
        final int ACTION_DELAY6 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS6 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE6 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets6 = instance.showMoveTargets();
        final boolean showShootline6 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners7 = instance.listeners;
        final Lock playLock7 = instance.playLock;
        final PlayerState state7 = instance.state;
        final int ROUND_DELAY7 = instance.ROUND_DELAY;
        final int PLAYER_DELAY7 = instance.PLAYER_DELAY;
        final int ACTION_DELAY7 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS7 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE7 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets7 = instance.showMoveTargets();
        final boolean showShootline7 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners8 = instance.listeners;
        final Lock playLock8 = instance.playLock;
        final PlayerState state8 = instance.state;
        final int ROUND_DELAY8 = instance.ROUND_DELAY;
        final int PLAYER_DELAY8 = instance.PLAYER_DELAY;
        final int ACTION_DELAY8 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS8 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE8 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets8 = instance.showMoveTargets();
        final boolean showShootline8 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners9 = instance.listeners;
        final Lock playLock9 = instance.playLock;
        final PlayerState state9 = instance.state;
        final int ROUND_DELAY9 = instance.ROUND_DELAY;
        final int PLAYER_DELAY9 = instance.PLAYER_DELAY;
        final int ACTION_DELAY9 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS9 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE9 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets9 = instance.showMoveTargets();
        final boolean showShootline9 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners10 = instance.listeners;
        final Lock playLock10 = instance.playLock;
        final PlayerState state10 = instance.state;
        final int ROUND_DELAY10 = instance.ROUND_DELAY;
        final int PLAYER_DELAY10 = instance.PLAYER_DELAY;
        final int ACTION_DELAY10 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS10 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE10 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets10 = instance.showMoveTargets();
        final boolean showShootline10 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners11 = instance.listeners;
        final Lock playLock11 = instance.playLock;
        final PlayerState state11 = instance.state;
        final int ROUND_DELAY11 = instance.ROUND_DELAY;
        final int PLAYER_DELAY11 = instance.PLAYER_DELAY;
        final int ACTION_DELAY11 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS11 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE11 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets11 = instance.showMoveTargets();
        final boolean showShootline11 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners12 = instance.listeners;
        final Lock playLock12 = instance.playLock;
        final PlayerState state12 = instance.state;
        final int ROUND_DELAY12 = instance.ROUND_DELAY;
        final int PLAYER_DELAY12 = instance.PLAYER_DELAY;
        final int ACTION_DELAY12 = instance.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS12 = instance.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE12 = instance.SHOW_SHOOTLINE;
        final boolean showMoveTargets12 = instance.showMoveTargets();
        final boolean showShootline12 = instance.showShootline();
        final Set<PlayerConfigurationListener> listeners13 = instance
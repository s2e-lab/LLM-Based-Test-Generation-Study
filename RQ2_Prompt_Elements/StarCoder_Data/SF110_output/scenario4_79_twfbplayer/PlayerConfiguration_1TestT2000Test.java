// PlayerConfiguration_1Test.java
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {

    /**
    * Test method for {@link PlayerConfiguration#showMoveTargets()}.
    */
    @Test
    void testShowMoveTargets() {
        final PlayerConfiguration instance = new PlayerConfiguration();
        final Set<PlayerConfigurationListener> listeners = new HashSet<PlayerConfigurationListener>();
        final Lock playLock = new ReentrantLock();
        final PlayerState state = PlayerState.STOP;
        final int ROUND_DELAY = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance2 = new PlayerConfiguration();
        instance2.setTo(instance);
        final Set<PlayerConfigurationListener> listeners2 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock2 = new ReentrantLock();
        final PlayerState state2 = PlayerState.STOP;
        final int ROUND_DELAY2 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY2 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY2 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS2 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE2 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance3 = new PlayerConfiguration();
        instance3.setTo(instance);
        final Set<PlayerConfigurationListener> listeners3 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock3 = new ReentrantLock();
        final PlayerState state3 = PlayerState.STOP;
        final int ROUND_DELAY3 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY3 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY3 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS3 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE3 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance4 = new PlayerConfiguration();
        instance4.setTo(instance);
        final Set<PlayerConfigurationListener> listeners4 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock4 = new ReentrantLock();
        final PlayerState state4 = PlayerState.STOP;
        final int ROUND_DELAY4 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY4 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY4 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS4 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE4 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance5 = new PlayerConfiguration();
        instance5.setTo(instance);
        final Set<PlayerConfigurationListener> listeners5 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock5 = new ReentrantLock();
        final PlayerState state5 = PlayerState.STOP;
        final int ROUND_DELAY5 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY5 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY5 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS5 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE5 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance6 = new PlayerConfiguration();
        instance6.setTo(instance);
        final Set<PlayerConfigurationListener> listeners6 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock6 = new ReentrantLock();
        final PlayerState state6 = PlayerState.STOP;
        final int ROUND_DELAY6 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY6 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY6 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS6 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE6 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance7 = new PlayerConfiguration();
        instance7.setTo(instance);
        final Set<PlayerConfigurationListener> listeners7 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock7 = new ReentrantLock();
        final PlayerState state7 = PlayerState.STOP;
        final int ROUND_DELAY7 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY7 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY7 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS7 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE7 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance8 = new PlayerConfiguration();
        instance8.setTo(instance);
        final Set<PlayerConfigurationListener> listeners8 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock8 = new ReentrantLock();
        final PlayerState state8 = PlayerState.STOP;
        final int ROUND_DELAY8 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY8 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY8 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS8 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE8 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance9 = new PlayerConfiguration();
        instance9.setTo(instance);
        final Set<PlayerConfigurationListener> listeners9 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock9 = new ReentrantLock();
        final PlayerState state9 = PlayerState.STOP;
        final int ROUND_DELAY9 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY9 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY9 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS9 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE9 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance10 = new PlayerConfiguration();
        instance10.setTo(instance);
        final Set<PlayerConfigurationListener> listeners10 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock10 = new ReentrantLock();
        final PlayerState state10 = PlayerState.STOP;
        final int ROUND_DELAY10 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY10 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY10 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS10 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE10 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance11 = new PlayerConfiguration();
        instance11.setTo(instance);
        final Set<PlayerConfigurationListener> listeners11 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock11 = new ReentrantLock();
        final PlayerState state11 = PlayerState.STOP;
        final int ROUND_DELAY11 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY11 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY11 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS11 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE11 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance12 = new PlayerConfiguration();
        instance12.setTo(instance);
        final Set<PlayerConfigurationListener> listeners12 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock12 = new ReentrantLock();
        final PlayerState state12 = PlayerState.STOP;
        final int ROUND_DELAY12 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY12 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY12 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS12 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE12 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance13 = new PlayerConfiguration();
        instance13.setTo(instance);
        final Set<PlayerConfigurationListener> listeners13 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock13 = new ReentrantLock();
        final PlayerState state13 = PlayerState.STOP;
        final int ROUND_DELAY13 = Configuration.ROUND_DELAY;
        final int PLAYER_DELAY13 = Configuration.PLAYER_DELAY;
        final int ACTION_DELAY13 = Configuration.ACTION_DELAY;
        final boolean SHOW_MOVETARGETS13 = Configuration.SHOW_MOVETARGETS;
        final boolean SHOW_SHOOTLINE13 = Configuration.SHOW_SHOOTLINE;
        final PlayerConfiguration instance14 = new PlayerConfiguration();
        instance14.setTo(instance);
        final Set<PlayerConfigurationListener> listeners14 = new HashSet<PlayerConfigurationListener>();
        final Lock playLock14 = new ReentrantLock();
        final PlayerState state14 = PlayerState.STOP;
        final int ROUND_DELAY14 =